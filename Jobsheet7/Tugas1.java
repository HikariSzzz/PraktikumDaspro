import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        double Hargatiket = 50000, jmlTiket, jmlpengunjung, totalbayar = 0;
        int totalsehari = 0;

        System.out.print("Jumlah Pengunjung hari ini: ");
        jmlpengunjung = sc.nextDouble();
        for (int i = 1; i <= jmlpengunjung; i++){
            System.out.print("Jumlah Tiket yang dibeli pengunjung ke-" + i + ": ");
            jmlTiket = sc.nextDouble();

            if (jmlTiket <= 0 ){
                System.out.print("Jumlah tiket tidak valid");
                continue;
            }
            if (jmlTiket >= 10){
                totalbayar = jmlTiket * Hargatiket * 0.85;
            } else if (jmlTiket >= 4){
                totalbayar = jmlTiket * Hargatiket * 0.90;
            } else if (jmlTiket < 4){
                totalbayar = jmlTiket * Hargatiket;
            }
            System.out.println("Total yang harus dibayar pengunjung ke-" + i + " : Rp " + totalbayar);
            totalsehari += totalbayar;    
        }  System.out.println("Total Pendapatan Hari ini: Rp " + totalsehari);
        sc.close();
    }
}
