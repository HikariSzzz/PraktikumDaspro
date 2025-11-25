public class Tugas1 {
    public static void main(String[] args) {
        int n = 5,i = 1,z = 1, g = 0;

        while (i <= n) { 
            System.out.print("Jumlah Kuadrat = ");
            z = 1;
            while (z <= i) {
                int y = z * z;
                System.out.print(" + " + y );
                g += y;
                z++;
            }
            System.out.println(" = " + g);
            g = 0;
            System.out.println();
            i++;
        }
    }
}