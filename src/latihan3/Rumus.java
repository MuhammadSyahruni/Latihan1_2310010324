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

    // Konstruktor default
    public Rumus() {
        sisi = 0;
        panjang = 0;
        lebar = 0;
        hasil = 0;
    }

    // Contoh metode
    public int hitungLuasPersegi() {
        hasil = sisi * sisi;
        return hasil;
    }

    public int hitungLuasPersegiPanjang() {
        hasil = panjang * lebar;
        return hasil;
    }

    public static void main(String[] args) {
        Rumus r = new Rumus();
        r.sisi = 4;
        r.panjang = 5;
        r.lebar = 3;

        System.out.println("Luas persegi = " + r.hitungLuasPersegi());
        System.out.println("Luas persegi panjang = " + r.hitungLuasPersegiPanjang());
    }
}