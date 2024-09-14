import java.util.Scanner;

public class Siakad01 {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      String nama, nim ; // variable tipe string
      char kelas; // variable tipe char
      byte absen; //variable tipe byte
      double nilaiKuis, nilaiTugas, nilaiUjian, nilaiUAS, nilaiAkhir; // variable tipe double 

      System.out.println("Masukan nama: "); // menampilkan pesan untuk memasukan nama
      nama = sc.nextLine(); // input nama
      System.out.println("Masukan NIM: "); // menampilkan pesan untuk memasukan nim
      nim = sc.nextLine(); // input nim
      System.out.println("Masukan kelas: "); // menampilkan pesan untuk memasukan kelas 
      kelas = sc.nextLine(). charAt(0); // membaca seluruh baris lalu mengambil nilai pertama
      System.out.println("Masukan nomer absen: "); //menampilkan pesan absen
      absen = sc.nextByte(); // input absen

      System.out.println("Masukan nilai kuis= "); // input nilai kuis
      nilaiKuis = sc.nextDouble(); // mengambil nilai input nilai kuis 
      System.out.println("Masukan nilai tugas= "); // input nilai tugas
      nilaiTugas = sc.nextDouble(); // mengambil nilai input nilai tugas 
      System.out.println("Masukan nilai ujian= "); // input nilai ujian
      nilaiUjian = sc.nextDouble(); // mengambil nilai input nilai ujian
      System.out.println("Masukan nilai UAS= "); // input nilai UAS
      nilaiUAS = sc.nextDouble(); // mengambil nilai input nilai UAS

      nilaiAkhir = (nilaiKuis * 0.20) + (nilaiTugas * 0.15) + (nilaiUjian * 0.30) + (nilaiUAS * 0.35) ; // total nilai keseluruhan

      System.out.println("Nama: " + nama + "NIM: " + nim); // output nama dan Nim
      System.out.println("Kelas: " + kelas + " Absen: " + absen); // output kelas dan absen
      System.out.println("Nilai Akhir: " + nilaiAkhir); // output nilai akhir keseluruhan
    }
}