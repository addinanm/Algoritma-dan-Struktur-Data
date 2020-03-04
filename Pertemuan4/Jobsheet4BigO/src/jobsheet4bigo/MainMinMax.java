package jobsheet4bigo;

import java.util.Scanner;
import static jobsheet4bigo.minMax.max_min;

public class MainMinMax {
    public static void main(String[] args) {
        minMax[] ppArray = new minMax[5]; //0(1)
        ppArray[0] = new minMax(); //0(1)
        
        Scanner sc = new Scanner(System.in); //0(1)
        for (int i = 0; i < 5; i++) {//0(n)
            ppArray[i] = new minMax(); //0(1)
            System.out.println("Nilai array indeks ke-"+i); //0(1)
            System.out.println("Masukkan nilai"); //0(1)
            ppArray[i].nilaiArray = sc.nextInt(); //0(1)
        }
        int min=ppArray[0].nilaiArray; //0(1)
        int max=ppArray[0].nilaiArray; //0(1)
        for (int i = 0; i < 5; i++) { //0(n)
            if (ppArray[i].nilaiArray<min) //0(1)
                min=ppArray[i].nilaiArray; //0(1)
            else if(ppArray[i].nilaiArray>max) //0(1)
                max=ppArray[i].nilaiArray; //0(1)
        }
        System.out.println("Brute Force"); //0(1)
        System.out.println("Nilai Minimal" + min); //0(1)
        System.out.println("Nilai Maksimal" + max); //0(1)
        
        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i]=ppArray[i].nilaiArray;
        }
            Maxmin hasil = new Maxmin();
            max_min(arr,0,4,hasil);
            
            System.out.println("Divide Conquer");
            System.out.println("Nilai Minimal" + hasil.minimum +"\n Nilai Maksimal: " + hasil.maximum);
            
        }
        
    }

// 0(1+1+1+n*1*1*1*1+1+1+n*1*1*1*1+1+1+1)
// 0(3+n*1+2+n*1+4)
// 0(n^2)