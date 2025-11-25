import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] menu = {"Mac n Cheese","Spagethi","Pizza","Burger","Ayam","Orange Juice","Melon Juice","Wine","Milk","Not Milk"};
        int hasil = -1; 

        System.out.print("Cari Makangan : ");
        String cari = sc.nextLine();

        for (int i = 0; i < menu.length; i++){
            if (cari.equalsIgnoreCase(menu[i])) {
                hasil = i;
                break;
            }
        }
        
        if (hasil != -1) {
            hasil += 1;
            System.out.println("---------------------------------------------");
            System.out.println("Menu "+cari+" Tersedia, Pada Normor : "+hasil);
            System.out.println("---------------------------------------------");
        } else {
            System.out.println("---------------------------------------------");
            System.out.println("Menu "+cari+" Tidak Tersedia");
            System.out.println("---------------------------------------------");
        }
    }
}