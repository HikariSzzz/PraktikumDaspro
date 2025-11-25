import java.util.Scanner;

public class BioskopWithScanner29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int baris, kolom, pilih;
        String nama, next = "y";
        String[][] penonton = new String[4][2];

        do {
            System.out.println("===================================");
            System.out.println("Menu 1: input data penonton");
            System.out.println("Menu 2: tampil data penonton");
            System.out.println("Menu 3: exit");
            System.out.print("Masukkan menu: ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1:
                    while (true) {
                        System.out.println("\n\n===================================");
                        System.out.print("Masukkan nama penonton: ");
                        nama = input.nextLine();
                        
                        do {
                            System.out.print("Masukkan nomor baris: ");
                            baris = input.nextInt();
                            System.out.print("Masukkan nomor kolom: ");
                            kolom = input.nextInt();

                            if (penonton[baris-1][kolom-1] == null) {
                                break;
                            } else {
                                System.out.println("Tempat sudah dipesan");
                            }
                        } while (true);

                        if (baris > penonton.length || kolom > penonton[baris].length) {
                            System.out.println("Baris atau kolom tidak ada");
                        } else {
                            penonton[baris - 1][kolom - 1] = nama;
                        };

                        input.nextLine();

                        System.out.print("Masukkan data lagi? (y/n) ");
                        next = input.nextLine();
                        if (next.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("\n\n===================================");
                    int x = 0, y = 0;
                    for (String[] list : penonton) {
                        for (String data : list) {
                            if (data == null) {
                                System.out.println("kursi " + +x + "" + y + " : " + "****");
                            }
                            y++;
                        }
                        x++;
                    }
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Menu tidak ada");
            }
        } while (true);
    }
}