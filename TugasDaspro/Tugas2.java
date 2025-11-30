import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = scanner.nextInt();

        if (angka % 2 == 0) {
            System.out.println(angka + " bilangan tersebut genap.");
        } else {
            System.out.println(angka + " bilangan tersebut ganjil.");
        }
        scanner.close();
    }
}