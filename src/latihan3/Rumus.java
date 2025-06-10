package latihan3;

/**
 * Nama  : [Nama Kamu]
 * NPM   : [NPM Kamu]
 * Kelas : [Kelas Kamu]
 */
public class Rumus {
    // Atribut
    int sisi;
    int panjang;
    int lebar;
    int hasil;

    // Konstruktor
    public Rumus() {
        sisi = 0;
        panjang = 0;
        lebar = 0;
        hasil = 0;
    }

    // Mutator Method: Menghitung luas persegi
    public void hitungLuasPersegi() {
        hasil = sisi * sisi;
    }

    // Mutator Method: Menghitung luas persegi panjang
    public void hitungLuasPersegiPanjang() {
        hasil = panjang * lebar;
    }

    // Getter hasil
    public int getHasil() {
        return hasil;
    }

    public static void main(String[] args) {
        Rumus r = new Rumus();

        // Persegi
        r.sisi = 5;
        r.hitungLuasPersegi();
        System.out.println("Luas persegi: " + r.getHasil());

        // Persegi panjang
        r.panjang = 6;
        r.lebar = 3;
        r.hitungLuasPersegiPanjang();
        System.out.println("Luas persegi panjang: " + r.getHasil());
    }
}