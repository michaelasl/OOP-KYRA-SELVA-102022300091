public class Main {
    public static void main(String[] args) {

        // To do: Buatlah sebuah Objek baru dari class Komputer
        Komputer komputer = new Komputer(20, "Warnet Gaming X", 5000);
        // To do: Panggillah Method Informasi dari class Komputer
        komputer.Informasi();
        System.out.println();

        // To do: Buatlah sebuah Objek baru dari class KomputerVIP 
        KomputerVIP komputerVIP = new Komputer(15, "Warnet Gaming X", 7000);
        // To do: Panggillah Method Informasi dari class KomputerVIP
        komputerVIP.Informasi();
        // To do: Panggillah Method Login
        komputerVIP.Login("Asep");
        // To do: Panggillah Method Bermain 2x agar dapat melakukan polymorphism overloading
        Komputer VIPTrue.Informasi();
        

        System.out.println();


        // To do: Buatlah sebuah Objek baru dari class KomputerPremium

        // To do: Panggillah Method Informasi dari class KomputerPremium

        // To do: Panggillah Method Pesan

        // To do: Panggillah Method TambahLayanan 2x agar dapat melakukan polymorphism overloading
       
    }
}