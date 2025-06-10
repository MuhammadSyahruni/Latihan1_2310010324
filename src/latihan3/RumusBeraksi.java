package latihan3;

public class RumusBeraksi {
    public static void main(String[] args) {
        // Membuat objek dari class Rumus
        Rumus rafi = new Rumus();

        // Mengatur nilai sisi, menghitung dan menampilkan luas persegi
        rafi.sisi = 4;
        rafi.hitungLuasPersegi();
        System.out.println("Luas persegi: " + rafi.getHasil());

        // Mengatur nilai panjang dan lebar, menghitung dan menampilkan luas persegi panjang
        rafi.panjang = 7;
        rafi.lebar = 3;
        rafi.hitungLuasPersegiPanjang();
        System.out.println("Luas persegi panjang: " + rafi.getHasil());
    }
}