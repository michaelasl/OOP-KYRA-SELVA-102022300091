import javafx.animation.Animation.Status;

class KomputerVIP extends Komputer {
    protected boolean vipCard;

    public KomputerVIP (int jumlahKomputer, String namaWarnet, float hargaPerjam, boolean vipCard) {
        super (jumlahKomputer, namaWarnet,hargaPerjam);
        this.vipCard = vipCard;
    }

    public void Informasi(){
        super.Informasi();
        if (vipCard) {
            System.out.println("Benefit member VIP" + );
        } else {
            System.out.println(namaWarnet);
        }
    }
    // To do: Buatlah 1 variable sesuai ketentuan
    
    // To do: Buatlah constructor pada class KomputerVIP
    
    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    
    // To do: Buatlah method Login sesuai dengan ketentuan
    
    // To do: Buatlah method Bermain sesuai dengan ketentuan
    
    // To do: Buatlah method Bermain memakai Polymorphism Overloading sesuai dengan ketentuan

}