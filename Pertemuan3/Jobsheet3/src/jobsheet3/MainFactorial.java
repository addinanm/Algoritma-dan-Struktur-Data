package jobsheet3;

import java.util.Scanner;

public class MainFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=====================================");
        System.out.println("Masukkan jumlah elemen yang ingin dihitung");
        int elemen = sc.nextInt();
        
        Factorial[] fk = new Factorial[elemen];
        for (int i = 0; i < elemen; i++) {
            fk[i] = new Factorial();
            System.out.println("Masukkan nilai data ke-"+(i+1)+":");
            fk[i].nilai = sc.nextInt();
        }
        System.out.println("=====================================");
        System.out.println("Hasil faktorial dengan Brute Force");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].faktorialBF(fk[i].nilai));
            
        }
        System.out.println("=====================================");
        System.out.println("Hasil faktorial dengan Divide and conquer");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].faktorialDF(fk[i].nilai));
            
        }
    }
}
