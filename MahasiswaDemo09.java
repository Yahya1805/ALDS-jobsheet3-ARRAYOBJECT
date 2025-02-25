import java.util.Scanner;
public class MahasiswaDemo09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa09[] arrayOfMahasiswa = new Mahasiswa09[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa[i] = new Mahasiswa09();
            System.out.print("NIM     : ");
            arrayOfMahasiswa[i].nim = sc.nextLine();
            System.out.print("Nama    : ");
            arrayOfMahasiswa[i].nama = sc.nextLine();
            System.out.print("Kelas   : ");
            arrayOfMahasiswa[i].kelas = sc.nextLine();
            System.out.print("IPK     : ");
            dummy = sc.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("------------------------------------");
        }

        
        for (int i=0; i<3; i++) {
            arrayOfMahasiswa[i].cetakInfo();
        }


        arrayOfMahasiswa[0] = new Mahasiswa09();
        arrayOfMahasiswa[0].nim = "244107020032";
        arrayOfMahasiswa[0].nama = "M.Yahya Irvansyah";
        arrayOfMahasiswa[0].kelas = "TI-1F";
        arrayOfMahasiswa[0].ipk = (float) 3.9;
        
        arrayOfMahasiswa[1] = new Mahasiswa09();
        arrayOfMahasiswa[1].nim = "1000000";
        arrayOfMahasiswa[1].nama = "Lionel messi";
        arrayOfMahasiswa[1].kelas = "TI-1A";
        arrayOfMahasiswa[1].ipk = (float) 4.0;

        arrayOfMahasiswa[2] = new Mahasiswa09();
        arrayOfMahasiswa[2].nim = "5000000";
        arrayOfMahasiswa[2].nama = "C.Ronaldo";
        arrayOfMahasiswa[2].kelas = "TI-1E";
        arrayOfMahasiswa[2].ipk = (float) 3.0;

        System.out.println("NiIM    : " + arrayOfMahasiswa[0].nim);
        System.out.println("Nama    : " + arrayOfMahasiswa[0].nama);
        System.out.println("Kelas   : " + arrayOfMahasiswa[0].kelas);
        System.out.println("IPK     : " + arrayOfMahasiswa[0].ipk);
        System.out.println("------------------------------------");
        System.out.println("NiIM    : " + arrayOfMahasiswa[0].nim);
        System.out.println("Nama    : " + arrayOfMahasiswa[0].nama);
        System.out.println("Kelas   : " + arrayOfMahasiswa[0].kelas);
        System.out.println("IPK     : " + arrayOfMahasiswa[0].ipk);
        System.out.println("------------------------------------");
        System.out.println("NiIM    : " + arrayOfMahasiswa[0].nim);
        System.out.println("Nama    : " + arrayOfMahasiswa[0].nama);
        System.out.println("Kelas   : " + arrayOfMahasiswa[0].kelas);
        System.out.println("IPK     : " + arrayOfMahasiswa[0].ipk);
    }
    
        
    
    
}