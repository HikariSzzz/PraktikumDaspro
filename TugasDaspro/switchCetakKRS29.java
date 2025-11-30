import java.util.Scanner;

public class switchCetakKRS29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("--- Cetak KRS SIAKAD --- ");
        System.out.println("Masukkan Semester Saat Ini");
        int semester = sc.nextInt();
        switch (semester) {
            case 1:
            System.out.println("KRS Semester 1 ditampilan");
                break;
            case 2:
            System.out.println("KRS Semester 2 ditampilan");
                break;
            case 3:
            System.out.println("KRS Semester 3 ditampilan");
                break; 
            case 4:
            System.out.println("KRS Semester 4 ditampilan");
                break;
            case 5:
            System.out.println("KRS Semester 5 ditampilan");    
                break;
            case 6:
            System.out.println("KRS Semester 6 ditampilan");
                break;
            case 7:
            System.out.println("KRS Semester 7 ditampilan");
                break;
            case 8:
            System.out.println("KRS Semester 8 ditampilan");    
                break;
            default:
            System.out.println("Semester tidak valid");                            
        }
        sc.close();
        }
 }
