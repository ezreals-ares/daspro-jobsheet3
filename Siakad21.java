import java.util.Scanner;
public class Siakad21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilaiAkhir, nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS;
        String nama, nim, kelas;
        byte absen;
        System.out.print("Masukkan Nama : ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM : ");
        nim = sc.nextLine();
        System.out.print("Masukkan Kelas : ");
        kelas = sc.nextLine();
        System.out.print("Masukkan Absen : ");
        absen = sc.nextByte();
        System.out.print("Masukkan Nilai Kuis : ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan Nilai Tugas : ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan Nilai UTS : ");
        nilaiUTS = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS : ");
        nilaiUAS = sc.nextDouble();
        nilaiAkhir = (nilaiKuis * 0.20) + (nilaiTugas * 0.15) + (nilaiUTS * 0.30) + (nilaiUAS * 0.35);
        System.out.print("Mahasiswa dengan nama " + nama);
        System.out.print(" (NIM " + nim + ")");
        System.out.print(" Kelas " + kelas);
        System.out.print(" No Absen " + absen);
        System.out.println("\nNilai Akhir : " + nilaiAkhir);
        sc.close();

    }
}
