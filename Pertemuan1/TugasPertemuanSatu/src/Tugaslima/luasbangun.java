package Tugaslima;

import java.util.Scanner;

public class luasbangun {
    public int alas, tinggi, sisi,jari2;
    public int LuasSegitiga(){
        int luas = (int)(0.5 * alas * tinggi);
        return luas;
    }
        
    public int LuasSegiEmpat(){
       int luas = (sisi * sisi);     
       return luas;
    }
        
        
    public double LuasLingkaran(){          
        double luas = (3.14 * jari2 * jari2);
        return luas;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        luasbangun l = new luasbangun();
        int bangun;   
        
        System.out.print("Paket : \n 1. Luas Segitiga \n 2. Luas Segiempat \n 3. Luas Lingkaran \n 4. Menu \n\n Pilih Bangun Ruang :");
        bangun = sc.nextInt();
        switch (bangun){
            case 1:
                System.out.println("Alas =");
                l.alas = sc.nextInt();
                System.out.println("tinggi =");
                l.tinggi = sc.nextInt();
                System.out.println("Luas Segitiga =" + l.LuasSegitiga() );
                break;
            case 2:
                System.out.println("Sisi =");
                l.sisi = sc.nextInt();
                System.out.println("Luas Segiempat =" + l.LuasSegiEmpat());
                break;
            case 3:
                System.out.println("Jari-Jari =");
                l.jari2 = sc.nextInt();
                System.out.println("Luas Lingkaran =" + l.LuasLingkaran());
                break;
            case 4:
                System.out.println("Menu");
                break;
            
        }
    }
}
