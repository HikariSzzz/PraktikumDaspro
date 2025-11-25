import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner inpur = new Scanner(System.in);

        System.out.print("masukkan jumlah cabang = ");
        int c = inpur.nextInt();
        int o = 0;
        int jtp = 0;
        int jti = 0;

        for (int i = 1; i <= c; i++) {
            System.out.println(" --- Cabang " + i + " --- ");
            System.out.print("masukkan jumlah pelanggan = ");
            int p = inpur.nextInt();
            for (int z = 1; z <= p; z++) {
                System.out.print(z + ". jumlah pesanan Pelanggan ke-" + z + " = ");
                int jp = inpur.nextInt();
                o += jp;
                jti += jp;
            }
            System.out.println("Cabang ke-" + i);
            System.out.println("- jumlah pelanggan  : " + p);
            System.out.println("- item terjual      : " + o);
            System.out.println();
            o = 0;
            jtp += p;
        }
        System.out.println();
        System.out.println("Total Seluruh cabang");
        System.out.println("Pelanggan   : " + jtp);
        System.out.println("Item        : " + jti);
    }
}