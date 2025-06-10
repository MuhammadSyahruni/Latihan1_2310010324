package latihan3;

/**
 * Nama  : [Isikan Nama Kamu]
 * NPM   : [Isikan NPM Kamu]
 * Kelas : [Isikan Kelas Kamu]
 */
public class Rumus {

    // Contoh metode sederhana
    public static int luasPersegi(int sisi) {
        return sisi * sisi;
    }

    public static double luasLingkaran(double jariJari) {
        return Math.PI * jariJari * jariJari;
    }

    public static void main(String[] args) {
        System.out.println("Luas persegi dengan sisi 4 = " + luasPersegi(4));
        System.out.println("Luas lingkaran dengan jari-jari 3 = " + luasLingkaran(3));
    }
}