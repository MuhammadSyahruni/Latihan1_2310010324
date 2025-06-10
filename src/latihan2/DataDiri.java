// File: DataDiri.java
package latihan2;

public class DataDiri {
    // Atribut
    private String nama;
    private String npm;
    private String kelas;

    // Konstruktor
    public DataDiri(String nama, String npm, String kelas) {
        this.nama = nama;
        this.npm = npm;
        this.kelas = kelas;
    }

    // Getter (opsional jika dibutuhkan)
    public String getNama() {
        return nama;
    }

    public String getNpm() {
        return npm;
    }

    public String getKelas() {
        return kelas;
    }

    // Setter (opsional jika dibutuhkan)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
}