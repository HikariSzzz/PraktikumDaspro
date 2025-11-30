import java.util.Scanner;

public class tugas {

    public static void main(String[] args) {
        int[][] surveyPelanggan = new int[3][6];
        double totalPoin = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\n===Survey Kepuasan Pelanggan Terhadap Layanan X ====");
        for (int i = 0; i < surveyPelanggan.length; i++) {
            double totalPoinPerPelanggan = 0;
            System.out.println("------------------------------------------------");
            System.out.println("Pelanggan ke-" + (i + 1));
            for (int j = 0; j < surveyPelanggan[i].length; j++) {
                System.out.print("Pertanyaan ke-" + (j + 1) + " (1-5): ");
                surveyPelanggan[i][j] = sc.nextInt();
                totalPoinPerPelanggan += surveyPelanggan[i][j];
            }
            totalPoin += totalPoinPerPelanggan;
            System.out.println("Rata-rata poin pelanggan ke-" + (i + 1) + ": " + totalPoinPerPelanggan / 6);
        }

        System.out.println("------------------------------------------------");

        for (int i = 0; i < 6; i++) {
            int totalPoinPerPertanyaan = 0;
            for (int j = 0; j < surveyPelanggan.length; j++) {
                totalPoinPerPertanyaan += surveyPelanggan[j][i];
            }
            System.out.println("Rata-rata poin pertanyaan ke-"+ (i+1) + ": " + totalPoinPerPertanyaan / surveyPelanggan.length);
        }

        System.out.println("------------------------------------------------");
        System.out.println("Total rata-rata poin keseluruhan pelanggan: " + totalPoin / surveyPelanggan.length);
        sc.close();
    }
}