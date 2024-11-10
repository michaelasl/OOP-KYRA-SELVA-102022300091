public class Main {
    public static void main(String[] args) {
        System.out.println("Detail Hewan\n");

        // Objek Kucing
        Kucing kucing = new Kucing("Siti", 3, "Persia");
        System.out.println("ini adalah " + kucing.nama + " !");
        kucing.suara();
        kucing.makan();
        kucing.makan("ikan");
        kucing.infoHewan();

        System.out.println();

        // Objek Burung
        Burung burung = new Burung("Riki", 2, "Hijau");
        System.out.println("ini adalah " + burung.nama + " !");
        burung.suara();
        burung.makan();
        burung.makan("biji-bijian");
        burung.infoHewan();
    }
}
