package Tiga;

import java.util.Scanner;

public class MainBarang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Barang br = new Barang();
        br.hargaSatuan = 5000;
        System.out.println("Nama\t\t:");
        br.nama = sc.next();
        System.out.println("Jumlah : ");
        br.jumlah = sc.nextInt();
        System.out.println("Total Bayar = " + br.hitungHargaBayar());
    }
}
