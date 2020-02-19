package Dua;

import java.util.Scanner;

public class MainSewa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sewa sw = new Sewa();
        System.out.println("Masukkan ID :");
        sw.id = sc.nextInt();
        System.out.println("Masukkan Nama :");
        sw.namaMember = sc.next();
        System.out.println("Masukkan Nama Game :");
        sw.namaGame = sc.next();
        System.out.println("Masukkan Lama Sewa :");
        sw.lama = sc.nextInt();
        System.out.println("Masukkan Harga : ");
        sw.harga = sc.nextInt();
        
        System.out.println("===================================");
        System.out.println("ID \t\t:" + sw.id);
        System.out.println("Nama\t\t:" + sw.namaMember);
        System.out.println("Nama Game \t:" + sw.namaGame);
        System.out.println("Lama Sewa \t:" + sw.lama);
        System.out.println("Harga sewa \t:" + sw.harga);
        System.out.println("Total Pembayaran: "+sw.hitungSewa());
        System.out.println("===================================");
    }
}
