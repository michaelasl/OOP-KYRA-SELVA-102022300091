import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // Todo : Create ManajemenInventaris Object and Scanner
        ManajemenInventaris manajemenInventaris = new ManajemenInventaris();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        // Todo : Create Loop list menu
        while (running) {
            System.out.println("=== Menu Manajemen Inventaris ===");
            System.out.println("1. Tambah Makanan Kering");
            System.out.println("2. Tambah Makanan Basah");
            System.out.println("3. Tampilkan Semua Makanan");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    manajemenInventaris.tambahMakananKering();
                    break;
                case 2:
                    manajemenInventaris.tambahMakananBasah();
                    break;
                case 3:
                    manajemenInventaris.tampilkanSemuaMakanan();
                    break;
                case 4:
                    System.out.println("Keluar dari program.");
                    running = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
        
        // Close the scanner when done to avoid resource leaks
        // scanner.close();
    }
}
