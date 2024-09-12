import java.util.Scanner;
public class Kafe21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean keanggotaan;
        int jmlkopi, jmlteh, jmlRoti;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000, totalharga, nominalbayar;
        float diskon = 10 / 100F;
        System.out.print("Masukkan Keanggotaan : ");
        keanggotaan = sc.nextBoolean();
        System.out.print("Masukkan jumlah pembelian kopi : ");
        jmlkopi = sc.nextInt();
        System.out.print("Masukkan jumlah pembelian teh : ");
        jmlteh = sc.nextInt();
        System.out.print("Masukkan jumlah pembelian roti : ");
        jmlRoti = sc.nextInt();
        totalharga = (jmlkopi * hargaKopi) + (jmlteh * hargaTeh) + (jmlRoti * hargaRoti);
        byte totalByte = (byte) totalharga;
        nominalbayar = totalharga - (diskon * totalharga);
        int nominalInt = (int) nominalbayar;
        System.out.println("Keanggotaan pelanggan : " + keanggotaan);
        System.out.println("Item pembelian : " + jmlRoti + " Kopi, " + jmlteh + " Teh, " + jmlRoti + " roti");
        System.out.println("Nominal Bayar Rp " + nominalbayar);
        System.out.println("Nominal Bayar (dalam bentuk integer) Rp " + nominalInt);
        System.out.println("Total Harga (dalam bentuk byte) Rp " + totalByte);
        System.out.println("total harga" + totalharga);
        sc.close();
    }
}