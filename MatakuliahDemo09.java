import java.util.Scanner;

public class MatakuliahDemo09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Membuat array dengan kapasitas 3
        Matakuliah09[] arrayOfMatakuliah = new Matakuliah09[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode       : ");
            String kode = sc.nextLine();
            System.out.print("Nama       : ");
            String nama = sc.nextLine();
            System.out.print("SKS        : ");
            int sks = sc.nextInt();
            System.out.print("Jumlah Jam : ");
            int jumlahJam = sc.nextInt();
            sc.nextLine(); // Membersihkan buffer
            System.out.println("------------------------------------");

            // Inisialisasi objek dan menambahkan data
            arrayOfMatakuliah[i].tambahData(kode, nama, sks, jumlahJam);
        }

        // Menampilkan hasil input
        System.out.println("\nData Matakuliah yang telah dimasukkan:");
        for (Matakuliah09 matkul : arrayOfMatakuliah) {
            matkul.cetakInfo();
        }
    }
}
