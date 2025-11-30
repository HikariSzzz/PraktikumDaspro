import java.util.Scanner;

public class nestedUjianSkripsi29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pesan;
        System.out.println("apakah mahasiswa bebas kompen? (ya/tidak)");
        String bebasKompen = sc.next();

        System.out.println("Masukkan jumlah log bimbingan pembimbing 1");
        int logBimbingan1 = sc.nextInt();
        System.out.println("Masukkan jumlah log bimbingan pembimbing 2");
    int logBimbingan2 = sc.nextInt();

    if (bebasKompen.equalsIgnoreCase("ya")) {
        if (logBimbingan1 >= 8 && logBimbingan2 >= 4) {
            pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
        } else if (logBimbingan1 < 8 && logBimbingan2 < 4) {
            pesan = "Gagal! Log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali";
        } else if (logBimbingan1 < 8) {
            pesan = "Gagal! Log bimbingan P1 belum mencapai 8 kali";
        } else {
            pesan = "Gagal! Log bimbingan P2 belum mencapai 4 kali";
        }
    } else {
        pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen";
    }
    System.out.println(pesan);
    sc.close();
}
}
