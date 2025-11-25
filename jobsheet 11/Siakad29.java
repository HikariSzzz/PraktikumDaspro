import java.util.Scanner;

public class Siakad29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Jumlah mahasiswa: ");
        int jmlMhs = input.nextInt();
        System.out.print("Jumlah matkul: ");
        int jmlMtkl = input.nextInt();
        int[][] nilai = new int[jmlMhs][jmlMtkl];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            double totPerSiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = input.nextInt();
                totPerSiswa += nilai[i][j];

                input.nextLine();
            }

            System.out.println("Nilai rata rata : " + (totPerSiswa / nilai[i].length));
        }

        System.out.println("\n=============================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah:");

        for (int j = 0; j < jmlMtkl; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < nilai.length; i++) {
                totalPerMatkul += nilai[i][j];
            }

            System.out.println("Mata Kuliah " + (j + 1) + ": " + totalPerMatkul / jmlMhs);
        }
    }
}