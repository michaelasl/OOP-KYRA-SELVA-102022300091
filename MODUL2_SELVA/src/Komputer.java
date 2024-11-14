import javafx.animation.Animation.Status;

class Komputer {
    protected int jumlahKomputer;
    protected String namaWarnet;
    protected float hargaPerJam;

public Komputer (int jumlahKomputer, String namaWarnet, float hargaPerjam) {
    this.jumlahKomputer = jumlahKomputer;
    this.namaWarnet = namaWarnet;
    this.hargaPerJam = hargaPerJam
}
public void Informasi (){
    System.out.println("INFORMASI KOMPUTER :");
    System.out.println("Jumlah Komputer" + jumlahKomputer);
    System.out.println("Nama Warnet" + namaWarnet);
    System.out.println("Harga PerJam"+ hargaPerJam);
}

    // To do: Buatlah 3 variable sesuai ketentuan
    
    // To do: Buatlah constructor pada class Komputer
    
    // To do: Buatlah Method Informasi dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)

}