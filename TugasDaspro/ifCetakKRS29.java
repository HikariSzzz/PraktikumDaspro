import java.util.Scanner;

public class ifCetakKRS29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("--- Cetak KRS SIAKAD --- ");
        System.out.println("Apakah UKT sudah lunas? (true/false) ");
        boolean uktlunas = sc.nextBoolean();

        if (uktlunas) {
            System.out.println("Pembayaran UKT terverifikasi");
        } else {
            System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        }

        // 🔽 Tambahan baris baru: versi Ternary Operator
        String hasil = (uktlunas)
            ? "Pembayaran UKT terverifikasi"
            : "Silahkan cetak KRS dan minta tanda tangan DPA";
        System.out.println(hasil);
    sc.close();
    }
}
