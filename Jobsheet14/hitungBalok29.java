import java.util.Scanner;

public class hitungBalok29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p, l , t, L, vol;

        System.out.print("Masukkan panjang balok: ");
        p = sc.nextInt();
        System.out.print("Masukkan lebar balok: ");
        l = sc.nextInt();
        System.out.print("Masukkan tinggi balok: ");
        t = sc.nextInt();

        L = hitungLuas(p, l);
        System.out.println("Luas balok adalah " + L);
        vol = hitungVolume(p, l, t);
        System.out.println("Volume balok adalah " + vol);
        sc.close();
    }

    public static int hitungLuas(int pjg, int lbr) {
        return pjg * lbr;
    }

    public static int hitungVolume(int pjg, int lbr, int tinggi) {
        return pjg * lbr * tinggi;
    }
}