import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner inpur = new Scanner(System.in);
        int[] Nilai = new int[10];

        System.out.println("--- Masukkan 10 Nilai Akhir ---");
        for (int i = 0; i < Nilai.length; i++) {

            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            
            Nilai[i] = inpur.nextInt();
        }
        double total = 0;
        double rata2;
        int nilaiterbesar = 0, nilaiTerkecil = 100;
        for (int i = 0; i < Nilai.length; i++) {
            total = total + Nilai[i];
            if (Nilai[i] > nilaiterbesar) {
                
              
                nilaiterbesar = Nilai[i];
            }
            if (Nilai[i] < nilaiTerkecil) {
                
               
                nilaiTerkecil = Nilai[i];
            }
        }
        rata2 = total / Nilai.length; 

        System.out.println("Rata-rata nilai = " + rata2);
        System.out.println("Nilai Tertinggi = " + nilaiterbesar);
        System.out.println("Nilai Tertinggi = " + nilaiTerkecil);

        System.out.println("\n--- Nilai Seluruh Mahasiswa ---");
        for (int i = 0; i < Nilai.length; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah " + Nilai[i]);
        }
    inpur.close();
    }
}