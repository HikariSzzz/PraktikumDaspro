import java.util.Scanner;

public class kafe29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kodePromo = "DISKON50";
        int totalBayar = 0;
 
        do {
            menu("Budi", true, kodePromo);

            System.out.print("Pilih menu: ");
            int pilih = sc.nextInt();
            System.out.print("Quantity: ");
            int qty = sc.nextInt();
            int totalHarga = hitungTotalHarga(pilih, qty, kodePromo);
            totalBayar += totalHarga;    

            sc.nextLine(); // Clear input buffer
            
            System.out.print("Apakah ingin pilih menu lagi (y/n): ");
            String lanjut = sc.nextLine();
            if (lanjut.equalsIgnoreCase("n")) {
                break;
            }

        } while (true);

        System.out.println("Total Bayar: Rp " + totalBayar);
    }

    public static void menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat Datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% setiap pembelian!");
        }

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("Anda mendapatkan diskon 50%");
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            System.out.println("Anda mendapatkan diskon 30%");
        } else {
            System.out.println("Kode promo tidak valid.");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam – Rp 15,000");
        System.out.println("2. Cappuccino – Rp 20,000");
        System.out.println("3. Latte – Rp 22,000");
        System.out.println("4. Teh Tarik – Rp 12,000");
        System.out.println("5. Roti Bakar – Rp 10,000");
        System.out.println("6. Mie Goreng – Rp 18,000");
        System.out.println("===========================");
    }

    public static int hitungTotalHarga(int pilih, int qty, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        double diskon = 0;

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            diskon = 0.5;
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            diskon = 0.3;
        }

        int hargaTotal = diskon != 0 ? (int) ((hargaItems[pilih - 1] * qty) * (1 - diskon)) : hargaItems[pilih - 1] * qty;
        return hargaTotal;
    }
}