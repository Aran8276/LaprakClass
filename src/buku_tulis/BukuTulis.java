package buku_tulis;

public class BukuTulis {
    private int jumlahLembar;
    private final int halamanPerLembar = 2;
    private int kataPerHalaman;

    public BukuTulis(int jumlahLembar, int kataPerHalaman) {
        this.jumlahLembar = jumlahLembar;
        this.kataPerHalaman = kataPerHalaman;
    }

    public int hitungTotalHalaman() {
        return jumlahLembar * halamanPerLembar;
    }

    public int hitungTotalKata() {
        return hitungTotalHalaman() * kataPerHalaman;
    }
}