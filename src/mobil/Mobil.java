package mobil;

public class Mobil {
    private double waktu;
    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan;

    public void setWaktu(double d) {
        waktu = ubahSekon(d);
    }

    public void setNoPlat(String s) {
        noPlat = s;
    }

    public void setWarna(String s) {
        warna = s;
    }

    public void setManufaktur(String s) {
        manufaktur = s;
    }

    public void setKecepatan(int i) {
        kecepatan = ubahKecepatan(i);
    }

    public double hitungJarak() {
        return kecepatan * waktu;
    }

    private double ubahSekon(double d) {
        return d * 3600;
    }

    private int ubahKecepatan(int i) {
        return (int) (i / 3.6);
    }

    public void displayMessage() {
        System.out.println("Mobil Anda Adalah bermerek " + manufaktur);
        System.out.println("mempunyai nomor plat " + noPlat);
        System.out.println("serta memililki warna " + warna);
        System.out.println("dan mampu menempuh kecepatan " + kecepatan);
        System.out.println("dengan waktu?: " + waktu);
        System.out.println("jarak yang dapat ditempuh adalah " + (hitungJarak() / 1000) + " km");
    }
}