package Perpustakaan;

public class Penulis {
    private String nama;
    private String asalNegara;

    public Penulis(String nama, String asalNegara) {
        this.nama = nama;
        this.asalNegara = asalNegara;
    }

    public String getNama() {
        return nama;
    }

    public String getAsalNegara() {
        return asalNegara;
    }

    public String getInfoPenulis() {
        return nama + " (" + asalNegara + ")";
    }
}