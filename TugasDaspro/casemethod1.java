// ...existing code...
import java.util.Scanner;

public class casemethod1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== INPUT DATA MAHASISWA =====");
        System.out.print("Nama : ");
        String nama = input.nextLine();
        System.out.print("NIM  : ");
        String nim = input.nextLine();

        // Mata Kuliah 1
        System.out.println("\n--- Mata Kuliah 1: Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS      : ");
        double utsAlgoritma = input.nextDouble();
        System.out.print("Nilai UAS      : ");
        double uasAlgoritma = input.nextDouble();
        System.out.print("Nilai Tugas    : ");
        double tugasAlgoritma = input.nextDouble();
        System.out.print("Nilai Kehadiran (%): ");
        double hadirAlgoritma = input.nextDouble();
        System.out.print("Nilai Etika    : ");
        double etikaAlgoritma = input.nextDouble();

        // bobot: UTS 30%, UAS 35%, Tugas 25%, Kehadiran 5%, Etika 5%
        double nilaiAkhirAlgoritma = (utsAlgoritma * 0.30) + (uasAlgoritma * 0.35) + (tugasAlgoritma * 0.25)
                + (hadirAlgoritma * 0.05) + (etikaAlgoritma * 0.05);
        String hurufAlgoritma = konversiHuruf(nilaiAkhirAlgoritma);
        // gunakan nested if untuk memberi detail alasan tidak lulus
        String statusAlgoritma = statusMataKuliah(nilaiAkhirAlgoritma, hadirAlgoritma, etikaAlgoritma);

        // === Mata Kuliah 2 ===
        System.out.println("\n--- Mata Kuliah 2: Struktur Data ---");
        System.out.print("Nilai UTS      : ");
        double utsStruktur = input.nextDouble();
        System.out.print("Nilai UAS      : ");
        double uasStruktur = input.nextDouble();
        System.out.print("Nilai Tugas    : ");
        double tugasStruktur = input.nextDouble();
        System.out.print("Nilai Kehadiran (%): ");
        double hadirStruktur = input.nextDouble();
        System.out.print("Nilai Etika    : ");
        double etikaStruktur = input.nextDouble();

        double nilaiAkhirStruktur = (utsStruktur * 0.30) + (uasStruktur * 0.35) + (tugasStruktur * 0.25)
                + (hadirStruktur * 0.05) + (etikaStruktur * 0.05);
        String hurufStruktur = konversiHuruf(nilaiAkhirStruktur);
        String statusStruktur = statusMataKuliah(nilaiAkhirStruktur, hadirStruktur, etikaStruktur);

        // === Hitung rata-rata dan status semester (nested if) ===
        double rataRata = (nilaiAkhirAlgoritma + nilaiAkhirStruktur) / 2;
        String statusSemester;
        // kalau status berisi detail (mis. "TIDAK LULUS (Etika < 70)"), cek dengan startsWith
        if (statusAlgoritma.startsWith("LULUS") && statusStruktur.startsWith("LULUS") ) {
            if (rataRata >= 70) {
                statusSemester = "LULUS (Rata-rata >= 70)";
            } else {
                statusSemester = "TIDAK LULUS (Rata-rata < 70)";
            }
        } else {
            statusSemester = "TIDAK LULUS (Salah satu MK tidak lulus)";
        }

        // === OUTPUT ===
        System.out.println("\n================ HASIL PENILAIAN AKADEMIK ====================");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println();
        System.out.println("Mata Kuliah           UTS   UAS   Tugas   Kehadiran Etika  Nilai Akhir   Nilai Huruf   Status");
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.printf("Algoritma Pemrograman  %.0f   %.0f    %.0f       %.0f%%      %.0f      %.2f         %-3s        %s%n",
                utsAlgoritma, uasAlgoritma, tugasAlgoritma, hadirAlgoritma, etikaAlgoritma, nilaiAkhirAlgoritma, hurufAlgoritma, statusAlgoritma);
        System.out.printf("Struktur Data          %.0f   %.0f    %.0f       %.0f%%      %.0f      %.2f         %-3s        %s%n",
                utsStruktur, uasStruktur, tugasStruktur, hadirStruktur, etikaStruktur, nilaiAkhirStruktur, hurufStruktur, statusStruktur);
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.printf("Rata-rata Nilai Akhir: %.2f%n", rataRata);
        System.out.println("Status Semester: " + statusSemester);
        System.out.println("==========================================================================================");

        input.close();
    }

    // mengecek syarat lulus per mata kuliah
    public static boolean nilaiakhircheck(double nilaiAkhir, double kehadiran, double etika) {
        return nilaiAkhir >= 60 && kehadiran >= 75 && etika >= 70;
    }

    // pengecekan status lulus
    public static String statusMataKuliah(double nilaiAkhir, double kehadiran, double etika) {
        if (nilaiAkhir >= 60) {
            if (kehadiran >= 75) {
                if (etika >= 70) {
                    return "LULUS";
                } else {
                    return "TIDAK LULUS (Etika < 70)";
                }
            } else {
                if (etika >= 70) {
                    return "TIDAK LULUS (Kehadiran < 75)";
                } else {
                    return "TIDAK LULUS (Kehadiran & Etika kurang)";
                }
            }
        } else {
            boolean k = kehadiran < 75;
            boolean e = etika < 70;
            if (k && e) return "TIDAK LULUS (Nilai, Kehadiran & Etika kurang)";
            if (k) return "TIDAK LULUS (Nilai & Kehadiran kurang)";
            if (e) return "TIDAK LULUS (Nilai & Etika kurang)";
            return "TIDAK LULUS (Nilai < 60)";
        }
    }

    // konversi nilai ke huruf sesuai tabel di jobsheet
    public static String konversiHuruf(double nilai) {
        if (nilai > 80 && nilai <= 100) {
            return "A";
        } else if (nilai > 73 && nilai <= 80) {
            return "B+";
        } else if (nilai > 65 && nilai <= 73) {
            return "B";
        } else if (nilai > 60 && nilai <= 65) {
            return "C+";
        } else if (nilai > 50 && nilai <= 60) {
            return "C";
        } else if (nilai > 39 && nilai <= 50) {
            return "D";
        } else {
            return "E";
        }
    }
}
