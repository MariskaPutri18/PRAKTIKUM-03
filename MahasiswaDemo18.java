import java.util.Scanner;
public class MahasiswaDemo18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahMahasiswa;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlahMahasiswa = sc.nextInt();

        Mahasiswa18[] daftarMahasiswa = new Mahasiswa18[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.print("Nama: ");
            String nama = sc.next();
            System.out.print("NIM: ");
            String nim = sc.next();
            System.out.print("Jenis Kelamin (L/P): ");
            char jenisKelamin = sc.next().charAt(0);
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();

            daftarMahasiswa[i] = new Mahasiswa18(nama, nim, jenisKelamin, ipk);
        }

        double totalIpk = 0;
        for (Mahasiswa18 mahasiswa : daftarMahasiswa) {
            totalIpk += mahasiswa.getIpk();
        }

        System.out.println("\nDaftar Mahasiswa:");
        for (Mahasiswa18 mahasiswa : daftarMahasiswa) {
            System.out.println("Nama: " + mahasiswa.getNama() +
                    ", NIM: " + mahasiswa.getNim() +
                    ", Jenis Kelamin: " + mahasiswa.getJenisKelamin() +
                    ", IPK: " + mahasiswa.getIpk());
        }

        double rataRataIpk = totalIpk / jumlahMahasiswa;
        System.out.println("\nRata-rata IPK: " + rataRataIpk);
    }
}
