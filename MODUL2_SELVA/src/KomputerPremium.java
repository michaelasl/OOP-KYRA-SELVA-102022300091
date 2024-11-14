class KomputerPremium extends Komputer {
    protected boolean ruangPrivate;

    public KomputerPremium(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean ruangPrivate) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.ruangPrivate = ruangPrivate;
    }

    public void Informasi (){
        System.out.println("================\n");
        super.Informasi();
        System.out.println("Status :" + (ruangPrivate?"ruanganstandar":"ruangan premium"));

    if (ruangPrivate){}
    }


    // To do: Buatlah 1 variable sesuai ketentuan
    
    // To do: Buatlah constructor pada class KomputerPremium
    
    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    
    // To do: Buatlah method Pesan sesuai dengan ketentuan
    
    // To do: Buatlah method TambahLayanan sesuai dengan ketentuan
    
    // To do: Buatlah method TambahLayanan memakai Polymorphism Overloading sesuai dengan ketentuan
    
}
