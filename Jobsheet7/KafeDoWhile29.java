import java.util.Scanner;

public class KafeDoWhile29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int kopi = 12000, teh = 7000, roti = 20000, totalHarga;
        String namaPelanggan;
        do {
            System.out.print("Masukkan Nama Pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.print("Jumlah Kafe:");
            kopi = sc.nextInt();
            System.out.print("Jumlah Teh:");
            teh = sc.nextInt();
            System.out.print("Jumlah Roti:");
            roti = sc.nextInt();   

            totalHarga = (kopi * 12000) + (teh * 7000) + (roti * 20000);
            System.out.println("Total yang harus di bayar: Rp " + totalHarga);
            sc.nextLine();
        } while (true);
    System.out.println("semua transaksi selesai.");
    }
}
