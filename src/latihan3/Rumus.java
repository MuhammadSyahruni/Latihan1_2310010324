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

    // Konstruktor: Inisialisasi semua atribut ke nol
    public Rumus() {
        sisi = 0;
        panjang = 0;
        lebar = 0;
        hasil = 0;
    }

    // Accessor Methods (Getter)
    public int getSisi() {
        return sisi;
    }

    public int getPanjang() {
        return panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public int getHasil() {
        return hasil;
    }

    // Mutator Method: Menghitung luas persegi
    public void hitungLuasPersegi() {
        hasil = sisi * sisi;
    }

    // Mutator Method: Menghitung luas persegi panjang
    public void hitungLuasPersegiPanjang() {
        hasil = panjang * lebar;
    }

    public static void main(String[] args) {
        Rumus r = new Rumus();

        // Set nilai sisi untuk persegi
        r.sisi = 5;
        r.hitungLuasPersegi();
        System.out.println("Luas persegi: " + r.getHasil());

        // Set nilai panjang dan lebar untuk persegi panjang
        r.panjang = 6;
        r.lebar = 3;
        r.hitungLuasPersegiPanjang();
        System.out.println("Luas persegi panjang: " + r.getHasil());
    }
}