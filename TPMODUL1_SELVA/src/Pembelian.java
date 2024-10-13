import java.util.ArrayList;
import java.util.Scanner;

public class Pembelian {
    public static void main(String[] args) {
        ArrayList<Penerbangan> daftarPenerbangan = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Menambahkan penerbangan ke dalam ArrayList
        daftarPenerbangan.add(new Penerbangan("GA001", "CGK, Jakarta", "DPS, Bali", "06:30", "08:15", 1200000));
        daftarPenerbangan.add(new Penerbangan("QZ202", "SUB, Surabaya", "KNO, Medan", "09:00", "11:45", 1350000));

        // Menu program
        while (true) {
            System.out.println("======= EAD Ticket Booking System =======");
            System.out.println("1. Tampilkan Daftar Penerbangan");
            System.out.println("2. Beli Tiket");
            System.out.println("3. Tampilkan Pesanan Tiket");
            System.out.println("4. Exit");
            System.out.print("Silakan pilih menu: ");
            int menu = scanner.nextInt();

            if (menu == 1) {
                // Tampilkan daftar penerbangan
                for (int i = 0; i < daftarPenerbangan.size(); i++) {
                    System.out.println((i + 1) + ".");
                    daftarPenerbangan.get(i).tampilDaftarPenerbangan();
                }
            } else if (menu == 2) {
                // Input data penumpang
                System.out.println("Silakan isi data diri terlebih dahulu!");
                System.out.print("Masukkan NIK: ");
                String NIK = "102022300091"; // NIM Praktikan
                System.out.print("Masukkan Nama Depan: ");
                String namaDepan = "Selva"; // Nama Pendek Praktikan
                System.out.print("Masukkan Nama Belakang: ");
                String namaBelakang = "SI4702"; // Nama Praktikan

                Penumpang Penumpang = new Penumpang(NIK, namaDepan, namaBelakang);
                // Pilih penerbangan
                System.out.println("Silakan Pilih Tiket Penerbangan Yang Tersedia:");
                for (int i = 0; i < daftarPenerbangan.size(); i++) {
                    System.out.println((i + 1) + ".");
                    daftarPenerbangan.get(i).tampilDaftarPenerbangan();
                }
                System.out.print("Pilih nomor penerbangan (ex: 1): ");
                int pilihanPenerbangan = scanner.nextInt();

                if (pilihanPenerbangan >= 1 && pilihanPenerbangan <= daftarPenerbangan.size()) {
                    System.out.println("Pemesanan Tiket Berhasil Dilakukan, Cek Pesanan Tiket pada Menu (3)");
                } else {
                    System.out.println("Penerbangan Tidak Tersedia!");
                }
            } else if (menu == 3) {
                // Tampilkan pesanan tiket
                System.out.println("======= Detail Tiket Penerbangan =======");
                System.out.println("Nomor Induk Kependudukan: 102022300091");
                System.out.println("Nama Depan : Selva");
                System.out.println("Nama Belakang : SI4702");
                System.out.println("Nomor Penerbangan: GA001");
                System.out.println("Bandara Keberangkatan: CGK, Jakarta --> Bandara Tujuan: DPS, Bali");
                System.out.println("Waktu Keberangkatan: 06:30 --> Waktu Kedatangan: 08:15");
                System.out.println("Harga Tiket: Rp.1200000.0");
            } else if (menu == 4) {
                System.out.println("Terima kasih!");
                break;
            } else {
                System.out.println("Menu tidak valid.");
            }
        }
        scanner.close();
    }
}
