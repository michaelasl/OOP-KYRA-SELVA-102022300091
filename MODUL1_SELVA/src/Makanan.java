// Don't delete any comments below!!!

public class Makanan {

    // Todo : Create private attribute of Makanan (nama, jumlah, and harga)
    private String nama;
    private int jumlah;
    private double harga;

    // Todo : Create Constructor of Makanan
    public Makanan(String nama, int jumlah, double harga) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    // Todo : Create Getter and Setter
    public String getnama(){
        return nama;
    }
    
    public void setnama(String nama) {
       this.nama = nama; 
    }

    public int getjumlah(){
        return jumlah;
    }

    public void setjumlah(int jumlah){
        this.jumlah = jumlah;
    }

    public double getharga(){
        return harga;
    }

    public void setharga(double harga){
        this.harga = harga;
    }
}

// Todo : Import Arraylist and Scanner

