// ...existing code...
import java.util.Scanner;
import java.util.Locale;

public class quiz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        String[] days = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};

        System.out.print("Masukkan jumlah wilayah: ");
        int wilayahCount = sc.nextInt();
        sc.nextLine(); // buang newline

        String[] names = new String[wilayahCount];
        double[][] konsumsi = new double[wilayahCount][7];

        for (int w = 0; w < wilayahCount; w++) {
            System.out.print("Nama wilayah ke-" + (w + 1) + ": ");
            names[w] = sc.nextLine().trim();
            System.out.println("Masukkan konsumsi harian (m^3) untuk " + names[w] + " (Senin..Minggu):");
            for (int d = 0; d < 7; d++) {
                System.out.print("  " + days[d] + ": ");
                konsumsi[w][d] = sc.nextDouble();
            }
            sc.nextLine(); // buang newline sebelum nama berikutnya
            System.out.println();
        }

        // Hitung total per wilayah dan total per hari
        double[] totalPerWilayah = new double[wilayahCount];
        double[] totalPerHari = new double[7];
        double grandTotal = 0.0;

        for (int w = 0; w < wilayahCount; w++) {
            double sum = 0.0;
            for (int d = 0; d < 7; d++) {
                sum += konsumsi[w][d];
                totalPerHari[d] += konsumsi[w][d];
            }
            totalPerWilayah[w] = sum;
            grandTotal += sum;
        }

        // Rata-rata konsumsi harian di seluruh wilayah (per hari) dan rata-rata overall per hari
        double[] rataPerHari = new double[7];
        for (int d = 0; d < 7; d++) {
            rataPerHari[d] = totalPerHari[d] / wilayahCount;
        }
        double rataRataPerHariSeluruhWilayah = grandTotal / 7.0; // rata-rata total tiap hari (semua wilayah digabung dibagi 7)

        // Menentukan hari dengan konsumsi tertinggi (total semua wilayah)
        int hariMaxIdx = 0;
        for (int d = 1; d < 7; d++) {
            if (totalPerHari[d] > totalPerHari[hariMaxIdx]) hariMaxIdx = d;
        }

        // Menentukan wilayah dengan total tertinggi
        int wilayahMaxIdx = 0;
        for (int w = 1; w < wilayahCount; w++) {
            if (totalPerWilayah[w] > totalPerWilayah[wilayahMaxIdx]) wilayahMaxIdx = w;
        }

        // Tampilkan tabel
        System.out.println("\nTABEL KONSUMSI (m^3)");
        System.out.printf("%-20s", "Wilayah/ Hari");
        for (String h : days) System.out.printf("%10s", h);
        System.out.printf("%12s%n", "Total");

        for (int w = 0; w < wilayahCount; w++) {
            System.out.printf("%-20s", names[w]);
            for (int d = 0; d < 7; d++) {
                System.out.printf("%10.2f", konsumsi[w][d]);
            }
            System.out.printf("%12.2f%n", totalPerWilayah[w]);
        }

        // Baris total per hari
        System.out.printf("%-20s", "TOTAL/HARI");
        for (int d = 0; d < 7; d++) System.out.printf("%10.2f", totalPerHari[d]);
        System.out.printf("%12.2f%n", grandTotal);

        // Baris rata-rata per hari (di seluruh wilayah)
        System.out.printf("%-20s", "RATA-RATA/HARI");
        for (int d = 0; d < 7; d++) System.out.printf("%10.2f", rataPerHari[d]);
        System.out.printf("%12s%n", "-");

        // Ringkasan
        System.out.println("\nRingkasan:");
        System.out.printf("  - Hari dengan konsumsi tertinggi: %s (%.2f m^3)%n", days[hariMaxIdx], totalPerHari[hariMaxIdx]);
        System.out.printf("  - Wilayah dengan total tertinggi: %s (%.2f m^3)%n", names[wilayahMaxIdx], totalPerWilayah[wilayahMaxIdx]);
        System.out.printf("  - Rata-rata konsumsi harian (semua wilayah digabung dibagi 7): %.2f m^3%n", rataRataPerHariSeluruhWilayah);

        sc.close();
    }
}

// ...existing code...

// Mulai
//   Definisikan daftar hari = ["Senin","Selasa","Rabu","Kamis","Jumat","Sabtu","Minggu"]

//   Tampilkan "Masukkan jumlah wilayah:"
//   Baca wilayahCount

//   Buat array names[wilayahCount]
//   Buat matriks konsumsi[wilayahCount][7]

//   Untuk i dari 0 sampai wilayahCount-1:
//     Tampilkan "Nama wilayah ke-(i+1):"
//     Baca names[i]
//     Tampilkan "Masukkan konsumsi harian (m^3) untuk " + names[i]
//     Untuk d dari 0 sampai 6:
//       Tampilkan nama hari[d]
//       Baca konsumsi[i][d]

//   Buat array totalPerWilayah[wilayahCount] inisialisasi 0
//   Buat array totalPerHari[7] inisialisasi 0
//   grandTotal = 0

//   Untuk w dari 0 sampai wilayahCount-1:
//     sum = 0
//     Untuk d dari 0 sampai 6:
//       sum += konsumsi[w][d]
//       totalPerHari[d] += konsumsi[w][d]
//     totalPerWilayah[w] = sumgs
//     grandTotal += sum

//   Untuk d dari 0 sampai 6:
//     rataPerHari[d] = totalPerHari[d] / wilayahCount

//   rataRataPerHariSeluruhWilayah = grandTotal / 7

//   hariMax = indeks d dengan totalPerHari[d] t6paling besar
//   wilayahMax = indeks w dengan totalPerWilayah[w] paling besar

//   Tampilkan tabel:
//     Header: "Wilayah / Senin ... Minggu / Total"
//     Untuk setiap wilayah w:
//       Tampilkan nama wilayah dan konsumsi per hari dan totalPerWilayah[w]
//     Tampilkan baris TOTAL/HARI dengan totalPerHari dan grandTotal
//     Tampilkan baris RATA-RATA/HARI dengan rataPerHari

//   Tampilkan ringkasan:
//     Hari dengan konsumsi tertinggi = hariMax dan nilai totalPerHari[hariMax]
//     Wilayah dengan total tertinggi = names[wilayahMax] dan totalPerWilayah[wilayahMax]
//     Rata-rata konsumsi harian seluruh wilayah = rataRataPerHariSeluruhWilayah

// Selesai