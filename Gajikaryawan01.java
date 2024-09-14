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

        totalGaji = jamKerja * upahKerja; //
        totalBonus = (totalGaji * bonus);
        totalPajak = (totalGaji + totalBonus) * pajak;
        totalGajiakhir = totalGaji + totalBonus - totalPajak;

        System.out.println("jam Kerja       :  " + jamKerja);
        System.out.println("upah perjam     :  " + "Rp " + upahKerja );
        System.out.println("total Bonus     :  " + "Rp "+ totalBonus);
        System.out.println("total gaji      :  " + "Rp "+ totalGaji );
        System.out.println("total pajak     :  " + "Rp "+ totalPajak  );
        System.out.println("total gaji akhir:  " + "Rp "+ totalGajiakhir );
    }
}
