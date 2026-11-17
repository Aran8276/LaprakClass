package Perpustakaan;

public class Kategori {
    private String namaKategori;
    private String deskripsi;
    private Buku[] daftarBuku;

    public Kategori(String namaKategori, String deskripsi) {
        this.namaKategori = namaKategori;
        this.deskripsi = deskripsi;
        this.daftarBuku = new Buku[0];
    }

    public void tambahBuku(Buku buku) {
        Buku[] temp = new Buku[daftarBuku.length + 1];
        for (int i = 0; i < daftarBuku.length; i++) {
            temp[i] = daftarBuku[i];
        }
        temp[daftarBuku.length] = buku;
        daftarBuku = temp;
    }

    public String getNamaKategori() {
        return namaKategori;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public Buku[] getDaftarBuku() {
        return daftarBuku;
    }

    public void tampilkanKoleksi() {
        System.out.println("====================================================");
        System.out.println("KATEGORI     : " + namaKategori);
        System.out.println("DESKRIPSI    : " + deskripsi);
        System.out.println("JUMLAH BUKU  : " + daftarBuku.length);
        System.out.println("====================================================");
        for (Buku buku : daftarBuku) {
            buku.tampilkanInfoBuku();
        }
        System.out.println();
    }
}