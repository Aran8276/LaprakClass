package mobil;

import java.util.Scanner;

public class MainMobil {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      Mobil m1 = new Mobil();

      System.out.print("Masukkan waktu (dalam satuan jam): ");
      m1.setWaktu(input.nextDouble());
      input.nextLine();

      System.out.print("Masukkan kecepatan: ");
      m1.setKecepatan(input.nextInt());
      input.nextLine();

      System.out.print("Masukkan manufakturer: ");
      m1.setManufaktur(input.nextLine());

      System.out.print("Masukkan plat nomor: ");
      m1.setNoPlat(input.nextLine());

      System.out.print("Masukkan warna: ");
      m1.setWarna(input.nextLine());

      m1.hitungJarak();
      m1.displayMessage();
      System.out.println("----------");
   }
}