package Tugas.Nomor2;

import java.util.Scanner;
public class MainNasabah {
    public static void menu(){
        System.out.println("Masukkan operasi yang diinginkan");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Print Front");
        System.out.println("5. Print Rear");
        System.out.println("6. Print Position");
        System.out.println("7. Print Nasabah");
        System.out.println("---------------------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah maksimal antrian: ");
        int n = sc.nextInt();
        int pilih ;
        
        Queue Q = new Queue(n);
        do {            
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case  1:
                    System.out.print("Masukkan nama nasabah: ");
                    String nama = sc.next();
                    System.out.print("Masukkan no rekening: ");
                    String rek = sc.next();
                    Nasabah nas = new Nasabah(rek, nama);
                    Q.enqueue(nas);
                    break;
                case  2:
                    Nasabah dataKeluar = Q.dequeue();
                    
                case  3:
                    Q.print();
                    break;
                case  4:
                    Q.printFront();
                    break;
                case  5:
                    Q.printRear();
                    break;
                case  6:
                    System.out.println("Data Nasabah :");
                    String na = sc.next();
                    Q.printPosition(na);
                    break;
                case  7:
                    System.out.println("Posisi : ");
                    int posisi = sc.nextInt();
                    Q.printNasabah(posisi);
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
    }
}
