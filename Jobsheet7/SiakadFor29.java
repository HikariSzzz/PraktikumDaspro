import java.util.Scanner;

public class SiakadFor29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    double Nilai, Tertinggi = 0, Terendah = 100;
        
        for (int i = 1 ; i <= 10; i++){
            System.out.print("Masukkan Nilai Mahasiswa ke-" + i + ": ");
            Nilai = sc.nextDouble();
            if (Nilai > Tertinggi){
                Tertinggi = Nilai;
            }
            if (Nilai < Terendah){
                Terendah = Nilai;
            }
        }
        System.out.println("Nilai Tertinggi: " + Tertinggi);
        System.out.println("Nilai Terendah: " + Terendah); 

        sc.close();
    }
}