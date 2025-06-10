package latihan2;

public class DataDiriBeraksi {
    public static void main(String[] args) {
        // Membuat objek dari class DataDiri
        DataDiri saya = new DataDiri("Muhammad Syahruni", "2310010324", "IF-3B");

        // Menampilkan data (opsional, jika ingin memastikan data tersimpan)
        System.out.println("Nama: " + saya.getNama());
        System.out.println("NPM: " + saya.getNpm());
        System.out.println("Kelas: " + saya.getKelas());
    }
}