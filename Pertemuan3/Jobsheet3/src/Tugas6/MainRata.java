package Tugas6;

import java.util.Scanner;


public class MainRata {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        
        System.out.println("Menghitung Rata-Rata dengan Divide Qonquer");
        System.out.print("jumlah mahasiswa : ");
        int n= sc.nextInt();
        
        RataNilai arr= new RataNilai(n);
        System.out.println();
        for(int i=0;i<n; i++){
            System.out.print("Nama mahasiswa " + (i+1) + " : ");
            arr.nama[i]=in.nextLine();
            System.out.print("Masukkan nilai : ");
            arr.rata2[i] = sc.nextInt();
            System.out.println();
        }
        for(int i=0; i<arr.jml;i++){
            System.out.println("nilai " + arr.nama[i]+" : "+ arr.rata2[i]);
        }
        System.out.println();
        System.out.println("rata-rata nilai : "+ String.format("%.2f", arr.rataDC(arr.rata2, 0, arr.jml)));
    }
    
}
