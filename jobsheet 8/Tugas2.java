import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan nilai gapapdeh anu deh n minimal 3 : ");
        int n = input.nextInt();

        if (n < 10) {
        for (int i = 1; i <= n; i++){
            if (i==1||i==n) {
                for (int z = 1; z <= n; z++){
                    System.out.print(" " + n + " ");
                }
            }
            else {
                for (int z = 1; z <= n; z++){
                    if (z==1||z==n) {
                        System.out.print(" " + n + " ");
                    }
                    else{
                        System.out.print(" " + " " + " ");
                    }
                }
            }
            System.out.println(); 
        }
        }
        else{
            for (int i = 1; i <= n; i++){
            if (i==1||i==n) {
                for (int z = 1; z <= n; z++){
                    System.out.print(" " + n + " ");
                }
            }
            else {
                for (int z = 1; z <= n; z++){
                    if (z==1||z==n) {
                        System.out.print(" " + n + " ");
                    }
                    else{
                        System.out.print(" " + "  " + " ");
                    }
                }
            }
            System.out.println(); 
        }
        }
    }
}