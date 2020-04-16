package Praktikum;
import java.util.Scanner;

public class MainLinkedList {
    public static void Menu(){
        System.out.println("==================================");
        System.out.println("Menu");
        System.out.println("1. Tambah");
        System.out.println("2. Hapus");
        System.out.println("3. Cari");
        System.out.println("0. Keluar");
        System.out.println("==================================");        
        
    }
    public static void SubMenu(){
        System.out.println("==================================");
        System.out.println("menu");
        System.out.println("1. Tambah (First)");
        System.out.println("2. Tambah (Index)");
        System.out.println("4. Tambah (Last)");
        System.out.println("==================================");        
        
    }
    public static void SubMenuRemove(){
        System.out.println("==================================");
        System.out.println("Menu");
        System.out.println("1. Hapus (index)");
        System.out.println("2. Hapus (key)");
        System.out.println("3. Clear");
        System.out.println("==================================");        
        
    }
    public static void MenuCari(){
        System.out.println("==================================");
        System.out.println("Menu");
        System.out.println("1. Cari (index)");
        System.out.println("2. Cari (key)");
        System.out.println("==================================");        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu, sub;
        int data, index;
        LinkedList list = new LinkedList();
    try{
        do {
            Menu();
            System.out.print("Masukkan pilihan = ");
            menu = sc.nextInt();
            
            switch (menu){
                case 1:
                    do{
                        SubMenu();
                        System.out.print("Masukkan Pilihan =");
                        sub =sc.nextInt();
                        switch (sub) {
                            case 1:
                                System.out.println("Masukkan nilai :");
                                data = sc.nextInt();
                                System.out.println("=========================");
                                list.addFirst(data);
                                list.print();
                            break;
                            case 2:
                                System.out.print("Masukkan nilai");
                                data = sc.nextInt();
                                System.out.print("Masukkan indeks");
                                index = sc.nextInt();
                                System.out.println("=========================");
                                list.addFirst(index);
                                list.print();
                            break;
                            case 3:
                                System.out.print("Masukkan nilai");
                                data = sc.nextInt();
                                System.out.println("=========================");
                                list.addFirst(data);
                                list.print();
                            break;
                            case 4:
                                System.out.print("Masukkan nilai");
                                data = sc.nextInt();
                                System.out.println("=========================");
                                list.addLast(data);
                                list.print();
                            break;
                            
                        } 
                    } while (sub != 0);
                break;
                case 3:
                do {
                    MenuCari();
                    System.out.print("Masukkan pilihan : ");
                    sub = sc.nextInt();
                    switch (sub) {
                        case 1:
                        System.out.print("Masukkan indeks : ");
                        index = sc.nextInt();
                        list.remove(index);
                        list.print();
                        break;
                        case 2:
                        System.out.print("Masukkan indeks : ");
                        data = sc.nextInt();
                        list.removeFirst();
                        list.print();
                        break;
                    }
                }while (sub != 0);
                break;
                    
            }
        }while (menu != 0);
    }
    catch (Exception e) {
    System.out.println(e.getMessage());
    }
    }
}