public class Dosen09 {
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;

    // Constructor
    public Dosen09(String kode, String nama, Boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    // Method untuk menampilkan informasi dosen
    public void cetakInfo() {
        System.out.println("Kode       : " + kode);
        System.out.println("Nama       : " + nama);
        System.out.println("Jenis Kelamin : " + (jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia       : " + usia);
        System.out.println("------------------------------------");
    }
}