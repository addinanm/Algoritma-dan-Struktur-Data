package TugasNo2;

import java.util.Scanner;

public class MainFibonacci {
    public static void main(String[] args) {
        int nilai, i;
        Scanner sc = new Scanner (System.in);
        Fibonacci fb = new Fibonacci();
        System.out.println("Masukkan nilai deret Fibonacci : ");
        int n = sc.nextInt();
        System.out.println("==============================================");
        System.out.print("Hasil bilangan fibonacci Brute Force: ");
        for (i = 0; i < n; i++){
            System.out.print(fb.FibBf(i)+", ");
        }
        System.out.println();
        
        System.out.print("Hasil bilangan fibonacci Divide Conquer: ");
        for (i = 0; i < n; i++){
            System.out.print(fb.FibDq(i)+", ");
        }
    }
}
