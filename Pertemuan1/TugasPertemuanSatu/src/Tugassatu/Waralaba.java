package Tugassatu;
import java.util.Scanner;

public class Waralaba {
        public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int menu;
        
        System.out.print("Paket : \n 1. paket Chicken \n 2. Paket Oke \n\n Pilihlah Paket :");
        menu = in.nextInt();
        switch (menu){
            case 1:
                int Chicken_A = 12000;
                int Chicken_B = 15000;
                int Chicken_C = 20000;
                int total;
                System.out.println("Chicken A =" + Chicken_A);
                System.out.println("Chicken B ="+ Chicken_B);
                System.out.println("Chicken C ="+ Chicken_C);
                total = Chicken_A + Chicken_B + Chicken_C;
                System.out.println("Total :"+total);
                break;
            case 2:
                int Oke_A = 10000;
                int Oke_B = 12000;
                int Oke_C = 15000;
                int hitung;
                System.out.println("Oke A =" + Oke_A);
                System.out.println("Oke B =" + Oke_B);
                System.out.println("Oke C =" + Oke_C);
                hitung = Oke_A + Oke_B + Oke_C;
                System.out.println("total :" + hitung);
                
        }
    }

}
