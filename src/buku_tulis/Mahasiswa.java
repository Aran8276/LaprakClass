package buku_tulis;

public class Mahasiswa {
    private String nama;
    private int kataPerHari;
    private double halamanPerHari;

    public Mahasiswa(String nama, int kataPerHari, double halamanPerHari) {
        this.nama = nama;
        this.kataPerHari = kataPerHari;
        this.halamanPerHari = halamanPerHari;
    }

    public double hitungLamaMenghabiskanBuku(BukuTulis buku) {
        return buku.hitungTotalHalaman() / halamanPerHari;
    }

    public String getNama() {
        return nama;
    }
}
