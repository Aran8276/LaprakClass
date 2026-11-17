package buku_tulis;

public class BukuTulisMain {
    public static void main(String[] args) {
        BukuTulis buku = new BukuTulis(50, 200);
        Mahasiswa mhsA = new Mahasiswa("Mahasiswa A", 100, 0.5);

        double lamaHari = mhsA.hitungLamaMenghabiskanBuku(buku);

        System.out.println("Nama: " + mhsA.getNama());
        System.out.println("Total halaman buku: " + buku.hitungTotalHalaman() + " halaman");
        System.out.println("Total kapasitas: " + buku.hitungTotalKata() + " kata");
        System.out.println("Waktu penyelesaian: " + (int) lamaHari + " hari");
    }
}
