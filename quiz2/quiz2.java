import java.util.Scanner;

public class quiz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};

        System.out.print("Masukkan jumlah wilayah: ");  
        int wilayahCount = sc.nextInt();
        sc.nextLine(); 

        String[] nama = new String[wilayahCount];
        double[][] konsumsi = new double[wilayahCount][7];
        //nama dan konsumsi
        for (int i = 0; i < wilayahCount; i++) {
            System.out.print("Nama wilayah ke-" + (i + 1) + ": ");
            nama[i] = sc.nextLine();
            System.out.println("Masukkan konsumsi harian (mkubik) untuk " + nama[i] + " (Senin-Minggu):");
            for (int d = 0; d < 7; d++) {
                System.out.print("  " + hari[d] + ": ");
                konsumsi[i][d] = sc.nextDouble();
            }
            sc.nextLine();
            System.out.println();
        }
        

        //total
        double[] totalPerWilayah = new double[wilayahCount];
        double[] totalPerHari = new double[7];
        double Total = 0.0;
        //count wilayah
        for (int w = 0; w < wilayahCount; w++) {
            double sum = 0.0;
            for (int d = 0; d < 7; d++) {
                sum += konsumsi[w][d];
                totalPerHari[d] += konsumsi[w][d];
            }
            totalPerWilayah[w] = sum;
            Total += sum;
        }
        //rata rata
        double[] rataPerHari = new double[7];
        for (int d = 0; d < 7; d++) {
            rataPerHari[d] = totalPerHari[d] / wilayahCount;
        }
        double rataRataPerHariSeluruhWilayah = Total / 7.0;
        //hari maximal
         int hariMax = 0;
        for (int d = 1; d < 7; d++) {
            if (totalPerHari[d] > totalPerHari[hariMax]) hariMax = d;
        }
        // wilayah maximal
        int wilayahMax = 0;
        for (int w = 1; w < wilayahCount; w++) {
            if (totalPerWilayah[w] > totalPerWilayah[wilayahMax]) wilayahMax = w;
        }
        //tabel
        System.out.println("Konsumsi Wilayah");
        System.out.println("\nTABEL KONSUMSI");
        System.out.printf("%-20s", "Wilayah/ Hari");
        for (String h : hari) System.out.printf("%10s", h);
        System.out.printf("%12s%n", "Total");

        for (int w = 0; w < wilayahCount; w++) {
            System.out.printf("%-20s", nama[w]);
            for (int d = 0; d < 7; d++) {
                System.out.printf("%10.2f", konsumsi[w][d]);
            }
            System.out.printf("%12.2%f", totalPerWilayah[w]);
        }
        
        System.out.printf("%-20s", "TOTAL/HARI");
        for (int d = 0; d < 7; d++) System.out.printf("%10.2f", totalPerHari[d]);
        System.out.printf("%12.2f%n", Total);

        
        System.out.printf("%-20s", "RATA-RATA/HARI");
        for (int d = 0; d < 7; d++) System.out.printf("%10.2f", rataPerHari[d]);
        System.out.printf("%12s%n", "-");

        
        System.out.println("\nLaporan:");
        System.out.printf("  - Hari dengan konsumsi tertinggi: %s (%.2f mkubik)%n", hari[hariMax], totalPerHari[hariMax]);
        System.out.printf("  - Wilayah dengan total tertinggi: %s (%.2f mkubik)%n", nama[wilayahMax], totalPerWilayah[wilayahMax]);
        System.out.printf("  - Rata-rata konsumsi harian semjua wilayah: %.2f mkubik%n", rataRataPerHariSeluruhWilayah);
        // buatkan saya flow
        sc.close();


    }
}