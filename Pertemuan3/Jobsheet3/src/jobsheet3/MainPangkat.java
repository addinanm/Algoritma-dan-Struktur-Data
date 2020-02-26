package jobsheet3;

import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====================================");
        System.out.println("Masukkan jumlah elemen yang ingin dihitung");
        int elemen = sc.nextInt();
        
        Pangkat[] png = new Pangkat[elemen];
        for (int i = 0; i < elemen; i++) {
            png[i] = new Pangkat();
            System.out.println("Masukkan nilai yang dipangkatkan ke-"+(i+1)+":");
            png[i].nilai = sc.nextInt();
            System.out.println("Masukkan nilai pangkat ke-"+(i+1)+":");
            png[i].pangkat = sc.nextInt();
        }
        System.out.println("=====================================");
        System.out.println("Hasil pangkat dengan Brute Force");
        for (int i = 0; i < elemen; i++) {
            System.out.println("nilai "+png[i].nilai+" pangkat : "+png[i].pangkat+" adalah = "+png[i].pangkatBF(png[i].nilai,png[i].pangkat));
            
        }
        System.out.println("=====================================");
        System.out.println("Hasil pangkat dengan Divide and conquer");
        for (int i = 0; i < elemen; i++) {
            System.out.println("nilai "+png[i].nilai+" pangkat : "+png[i].pangkat+" adalah = "+png[i].pangkatDC(png[i].nilai,png[i].pangkat));
        }
        System.out.println("=====================================");
    }
}
