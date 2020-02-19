package Tujuh;

import java.util.Scanner;

public class MainNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jumlah mahasiswa :");
        int m = sc.nextInt();
        Nilai[] nl = new Nilai[m];
        
        for(int i=0; i<m; i++){
            nl[i] = new Nilai();
            System.out.println("Mahasiswa "+(i+1));
            System.out.print("Nilai 1 :");
            nl[i].n1 = sc.nextInt();
            System.out.print("Nilai 2 :");
            nl[i].n2 = sc.nextInt();
            
        }
        System.out.println();
        for(int i=0; i<m;i++){
            System.out.println("Nilai Terbaik "+(i+1)+" ="+nl[i].nTerbaik(nl[i].n1, nl[i].n2));
        }
    }
}
