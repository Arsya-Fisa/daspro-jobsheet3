import java.util.Scanner;

public class Kafe01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean keanggotaan; // keanggotaan ya atau tidak
        int jmlKopi, jmlTeh, jmlRoti; // Menu
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0; // harga menu
        float diskon = 10 / 100f; // diskon
        double totalHarga, nominalBayar; //  harga dan pembayaran

        System.out.print("Masukan keanggotann (true/false): "); // input kebenaran anggota atau tidak
        keanggotaan = input.nextBoolean(); // untuk memanggil scanner keanggotaan
        System.out.print("Masukan jumlah pembeli kopi: "); // input jumlah pembeli
        jmlKopi = input.nextInt(); // untuk memanggil scanner jumlah kopi
        System.out.print("Masukan jumlah pembelian teh: "); // input jumlah banyak pembelian teh
        jmlTeh = input.nextInt(); // untuk memanggil scanner jumlah pembelian teh
        System.out.print("Masukan jumlah pemebelian roti: "); // inpu jumlah banyak pembalian roti
        jmlRoti = input.nextInt(); // untuk memanggil scanner jumlah pembelian roti

        totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti); // total harga item
        byte totalByte = (byte) totalHarga; //byte harga
        nominalBayar = totalHarga - (diskon * totalHarga); // total pembayaran disertai diskon

        System.out.println("keanggotaan pelanggan " + keanggotaan); // output pelanggan
        System.out.println("Item pembelian " + jmlKopi + " kopi, " + jmlTeh + " teh, " + jmlRoti + " roti"); //output jumlah item pembeliah
        System.out.println("Nominal bayar Rp " + nominalBayar); // total pembayaran
        System.out.println("Total harga Bytle:" + totalByte); // total harga yang di byte

    }
}
