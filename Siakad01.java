import java.util.Scanner;

public class Siakad01 {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      String nama, nim ;
      char kelas;
      byte absen;
      double nilaiKuis, nilaiTugas, nilaiUjian, nilaiUAS, nilaiAkhir;

      System.out.println("Masukan nama: ");
      nama = sc.nextLine();
      System.out.println("Masukan NIM: ");
      nim = sc.nextLine();
      System.out.println("Masukan kelas: ");
      kelas = sc.nextLine(). charAt(0);
      System.out.println("Masukan nomer absen: ");
      absen = sc.nextByte();

      System.out.println("Masukan nilai kuis= ");
      nilaiKuis = sc.nextDouble();
      System.out.println("Masukan nilai tugas= ");
      nilaiTugas = sc.nextDouble();
      System.out.println("Masukan nilai ujian= ");
      nilaiUjian = sc.nextDouble();
      System.out.println("Masukan nilai UAS= ");
      nilaiUAS = sc.nextDouble();

      nilaiAkhir = (nilaiKuis * 0.20) + (nilaiTugas * 0.15) + (nilaiUjian * 0.30) + (nilaiUAS * 0.35) ;

      System.out.println("Nama: " + nama + "NIM: " + nim);
      System.out.println("Kelas: " + kelas + " Absen: " + absen);
      System.out.println("Nilai Akhir: " + nilaiAkhir);
    }
}