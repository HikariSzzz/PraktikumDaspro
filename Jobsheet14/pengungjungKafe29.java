public class pengungjungKafe29 {
    public static void daftarPengunjung(String...namaPengunjung) {
        System.out.println("Daftar Pengunjung Kafe");
        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
    }
 
    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Sadikin");
        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
    }
}