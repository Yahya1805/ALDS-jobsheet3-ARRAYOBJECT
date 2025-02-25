import java.util.Scanner;

public class DosenDemo09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlahDosen = sc.nextInt();
        sc.nextLine(); 

        DataDosen09[] daftarDosen = new DataDosen09[jumlahDosen];

        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            String kode = sc.nextLine();
            System.out.print("Nama          : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (L/P): ");
            char jk = sc.next().charAt(0);
            System.out.print("Usia          : ");
            int usia = sc.nextInt();
            sc.nextLine(); 

            boolean jenisKelamin = (jk == 'L' || jk == 'l'); 
            daftarDosen[i] = new DataDosen09(kode, nama, jenisKelamin, usia);

            System.out.println("------------------------------------");
        }

        // Menampilkan data dosen dengan FOREACH
        System.out.println("DATA DOSEN YANG TELAH DIMASUKKAN:");
        DataDosen09.dataSemuaDosen(daftarDosen);
        System.out.println("------------------------------------");
        DataDosen09.jumlahDosenPerJenisKelamin(daftarDosen);
        System.out.println("------------------------------------");
        DataDosen09.rerataUsiaDosenPerJenisKelamin(daftarDosen);
        System.out.println("------------------------------------");
        DataDosen09.infoDosenPalingTua(daftarDosen);
        System.out.println("------------------------------------");
        DataDosen09.infoDosenPalingMuda(daftarDosen);
        System.out.println("------------------------------------");

        sc.close();
    }
}
