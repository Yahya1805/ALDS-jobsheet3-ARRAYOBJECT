public class DataDosen09 {
    String kode;
    String nama;
    Boolean jenisKelamin; 
    int usia;

    public DataDosen09(String kode, String nama, Boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    public static void dataSemuaDosen(DataDosen09[] arrayOfDosen) {
        for (DataDosen09 dosen : arrayOfDosen) {
            System.out.println("Kode: " + dosen.kode + ", Nama: " + dosen.nama + ", Jenis Kelamin: " + (dosen.jenisKelamin ? "Pria" : "Wanita") + ", Usia: " + dosen.usia);
        }
    }

    public static void jumlahDosenPerJenisKelamin(DataDosen09[] arrayOfDosen) {
        int pria = 0;
        int wanita = 0;
        for (DataDosen09 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("Jumlah Dosen Pria: " + pria);
        System.out.println("Jumlah Dosen Wanita: " + wanita);
    }

    public static void rerataUsiaDosenPerJenisKelamin(DataDosen09[] arrayOfDosen) {
        int totalUsiaPria = 0;
        int totalUsiaWanita = 0;
        int jumlahPria = 0;
        int jumlahWanita = 0;
        for (DataDosen09 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalUsiaPria += dosen.usia;
                jumlahPria++;
            } else {
                totalUsiaWanita += dosen.usia;
                jumlahWanita++;
            }
        }
        double rerataUsiaPria = jumlahPria == 0 ? 0 : (double) totalUsiaPria / jumlahPria;
        double rerataUsiaWanita = jumlahWanita == 0 ? 0 : (double) totalUsiaWanita / jumlahWanita;
        System.out.println("Rata-rata Usia Dosen Pria: " + rerataUsiaPria);
        System.out.println("Rata-rata Usia Dosen Wanita: " + rerataUsiaWanita);
    }

    public static void infoDosenPalingTua(DataDosen09[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;
        DataDosen09 dosenTertua = arrayOfDosen[0];
        for (DataDosen09 dosen : arrayOfDosen) {
            if (dosen.usia > dosenTertua.usia) {
                dosenTertua = dosen;
            }
        }
        System.out.println("Dosen Paling Tua: Kode: " + dosenTertua.kode + ", Nama: " + dosenTertua.nama + ", Usia: " + dosenTertua.usia);
    }

    public static void infoDosenPalingMuda(DataDosen09[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;
        DataDosen09 dosenTermuda = arrayOfDosen[0];
        for (DataDosen09 dosen : arrayOfDosen) {
            if (dosen.usia < dosenTermuda.usia) {
                dosenTermuda = dosen;
            }
        }
        System.out.println("Dosen Paling Muda: Kode: " + dosenTermuda.kode + ", Nama: " + dosenTermuda.nama + ", Usia: " + dosenTermuda.usia);
    }
}