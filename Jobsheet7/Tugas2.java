import java.util.Scanner;

public class Tugas2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int jeniskendaraan, durasi, total = 0 , totalbayar = 0;

        do{
            System.out.println("===== Sistem Parkir =====");
            System.out.print("1. Mobil\n2. Motor\n3. Total\n");
            System.out.print("Masukkan opsi :");
            jeniskendaraan = sc.nextInt();

            if (jeniskendaraan < 0 || jeniskendaraan > 3) {
                System.out.println("Jenis Kendaraan tidak valid");
            }

            if (jeniskendaraan == 1 || jeniskendaraan == 2){
                System.out.print("Masukkan Durasi Parkir (jam): ");
                durasi = sc.nextInt();
                if (durasi > 5){
                    total += 12500;
                } else if (jeniskendaraan == 1){
                    total += durasi * 3000;
                } else if (jeniskendaraan == 2){
                    total += durasi * 2000;
                }
                
            }
            System.out.println("Total biaya parkir: Rp " + total);
        } while (jeniskendaraan != 3);
    }
}
