package Delapan;

import java.util.Scanner;

public class ModifTanah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Jumlah Tanah :");
        int jm = sc.nextInt();
        Enam.Tanah[] tnh = new Enam.Tanah[jm];
        
        for(int i=0; i<jm; i++){
            tnh[i] = new Enam.Tanah();
            System.out.println("Tanah "+(i+1));
            System.out.print("Panjang : ");
            tnh[i].panjang = sc.nextInt();
            System.out.print("Lebar : ");
            tnh[i].lebar = sc.nextInt();
            
        }
        System.out.println();
        for(int i=0; i<jm;i++){
            System.out.println("Luas Tanah "+(i+1)+" = "+tnh[i].luasTanah());
        }
        int j = 1;
        int terluas=0;
        int tKe=0;
        for (int i = 0; i < jm; i++) {
            if (tnh[i].luasTanah()>terluas) {
                terluas = tnh[i].luasTanah();
                tKe=j;
            }
            j++;
        }
        System.out.println("Tanah Terluas adalah tanah ke: "+tKe);
    }
}
