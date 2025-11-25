import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner inpur = new Scanner(System.in);

        String menu[] = {"Mac n Cheese","Spagethi","Pizza","Burger","Ayam","Orange Juice","Melon Juice","Wine","Milk","Not Milk"};
        int hargaMenu[] = {13,13,50,10,5,15,15,30,15,1};
        int i, jml, byr, ttal = 0;

        System.out.println("Menu Resto That's not milk, that's my...");
        for ( i = 0; i <= menu.length; i++) {
            System.out.println( i + 1 + ". " + menu[i] + "  $ " + hargaMenu[i]);
        }
        do {
            System.out.print("Masukkan nomor menu yang dipilih (ketik 0 jika ingin keluar) : ");
            i = inpur.nextInt();

            if (i == 0) {
                break;
            }

            System.out.print("anda memilih menu " + menu[i-1] + " berapa banyak kah yang anda inginkan : ");
            jml = inpur.nextInt();
            byr = jml * hargaMenu[i-1];
            ttal += byr;
            System.out.println(menu[i-1] + "sejumlah " + jml + " dengan harga : $ " + byr);
            System.out.println("Total bill saat ini : $ " + ttal);
        } while (i == 0);

        System.out.println("Total Biaya = $ " + ttal);
    }
}