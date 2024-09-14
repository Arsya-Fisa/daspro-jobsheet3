import java.util.Scanner;

public class Gajikaryawan01 {
    public static void main(String[] args) {
        Scanner boy = new Scanner(System.in);

        int jamKerja; // waktu kerja
        double upahKerja, totalGaji, totalBonus, totalPajak, totalGajiakhir; // pendapatan gaji karyawan
        double pajak = 0.05; // pajak 5%
        double bonus = 0.10; // bonus 10%
        
        System.out.println("Masukan upah per jam kerja"); // input upah jam kerja
        upahKerja = boy.nextDouble(); // untuk memanggil scanner dan menambahkan nilai
        System.out.println("Masukan jumlah jam kerja"); // input jumlah jam kerja
        jamKerja = boy.nextInt(); // untuk menambah scanner dan menambah nilai

        totalGaji = jamKerja * upahKerja; // perhitungan total gaji
        totalBonus = (totalGaji * bonus); // perhitungan total bonus
        totalPajak = (totalGaji + totalBonus) * pajak; // perhitungan total pajak
        totalGajiakhir = totalGaji + totalBonus - totalPajak; // perhitungan total gaji akhir

        System.out.println("jam Kerja       :  " + jamKerja); // output jumlah jam kerja
        System.out.println("upah perjam     :  " + "Rp " + upahKerja ); // output jumlah upah
        System.out.println("total Bonus     :  " + "Rp "+ totalBonus); // output total bonus yang didapat
        System.out.println("total gaji      :  " + "Rp "+ totalGaji ); // output total haji
        System.out.println("total pajak     :  " + "Rp "+ totalPajak  ); // output total pajak karyawan
        System.out.println("total gaji akhir:  " + "Rp "+ totalGajiakhir ); // outpiut total gaji akhir
    }
}
