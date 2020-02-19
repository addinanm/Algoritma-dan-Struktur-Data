package Enam;

import java.util.Scanner;

public class MainTanah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Jumlah Tanah :");
        int jml = sc.nextInt();
        Tanah[] tnh = new Tanah[jml];
        
        for(int i=0; i<jml; i++){
            tnh[i] = new Tanah();
            System.out.println("Tanah "+(i+1));
            System.out.print("Panjang : ");
            tnh[i].panjang = sc.nextInt();
            System.out.print("Lebar : ");
            tnh[i].lebar = sc.nextInt();
            
        }
        System.out.println();
        for(int i=0; i<jml;i++){
            System.out.println("Luas Tanah "+(i+1)+" = "+tnh[i].luasTanah());
        }
    }
}
