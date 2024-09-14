import java.util.Scanner;

public class Listrik01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hargaListrik = 1500; // tarif per kWh
        int jumlahListrik, totalTagihan;  // penggunaan listrik dan total tagihan
        boolean statusListrik;  //status penggunaan lebih 500 atau tidak

        System.out.println("Masukan jumlah Listrik (kWh)"); //input penggunaan jumlah
        jumlahListrik = input.nextInt();

        statusListrik = jumlahListrik > 500 ; // status cek lebih 500 atau tidak

        totalTagihan = jumlahListrik * hargaListrik; // hitung total tagiha  listrik

        System.out.println("Apakah Listrik melebihi 500 kWh?:  " + statusListrik); // output true/false
        System.out.println("Jumlah Listrik : " + jumlahListrik  +  " kWh" ); // output jumlah listrik
        System.out.println("Harga Listrik:  " + hargaListrik); // output hrga listrik
        System.out.println("Total tagihan:  " + totalTagihan); // output total tagihan

    }
}
