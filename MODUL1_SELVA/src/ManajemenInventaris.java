// Don't delete any comments below!!!
// Todo : Import Arraylist and Scanner
import java.util.ArrayList;


public class ManajemenInventaris {
    // Todo : Create ArrayList of MakananKering (daftarMakananKering) and MakananBasah (daftarMakananBasah) to store items

    public void tambahMakananKering() {
        ArrayList<String> daftarMakananKering = new ArrayList<>();
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Brand Makanan

        // Todo : Create a new object for MakananKering
        MakananKering Makanan = new MakananKering("keripik", 4, 10000, "lays");
        daftarMakananKering.add(Makanan);
        
        // Todo : Create Print Notifitaction "Makanan kering berhasil ditambahkan"
        
    }

    public void tambahMakananBasah() {
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Bahan Makanan
        ArrayList<String> daftarMakananBasah = new ArrayList<>();
        // Todo : Create a new object for MakananBasah
        MakananBasah Makanan = new MakananBasah("coklat", 4, 20000, "kakao");
        daftarMakananBasah.add(Makanan);

        // Todo :Create Print Notifitaction "Makanan Basah berhasil ditambahkan"
    }

    public void tampilkanSemuaMakanan() {
        if (daftarMakananKering.isEmpty() && daftarMakananBasah.isEmpty()) {
            // Todo : Create Print Notification "Tidak ada makanan disini"
        } else {
            // Todo : Create print notification for Makanan Kering  
            for 
            }
            // Todo : Create print notification for  Makanan Basah
            for 
            }
        }
    }
}
