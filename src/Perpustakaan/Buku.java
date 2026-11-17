package Perpustakaan;

public class Buku {
    private String kodeBuku;
    private String judul;
    private int tahunTerbit;
    private String penerbit;
    private Penulis[] daftarPenulis;

    public Buku(String kodeBuku, String judul, int tahunTerbit, String penerbit, Penulis[] daftarPenulis) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.penerbit = penerbit;
        this.daftarPenulis = daftarPenulis;
    }

    public String getKodeBuku() {
        return kodeBuku;
    }

    public String getJudul() {
        return judul;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public Penulis[] getDaftarPenulis() {
        return daftarPenulis;
    }

    public void tampilkanInfoBuku() {
        System.out.println("  Kode Buku    : " + kodeBuku);
        System.out.println("  Judul        : " + judul);
        System.out.println("  Tahun Terbit : " + tahunTerbit);
        System.out.println("  Penerbit     : " + penerbit);
        System.out.print("  Penulis      : ");
        for (int i = 0; i < daftarPenulis.length; i++) {
            System.out.print(daftarPenulis[i].getInfoPenulis());
            if (i < daftarPenulis.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("  --------------------------------------------------");
    }
}