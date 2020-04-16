package Tugas.NomorSatu;
import java.util.Scanner;

public class MainLinkedlistMHS {
    public static void Menu(){
        System.out.println("==================================");
        System.out.println("Menu");
        System.out.println("1. Tambah");
        System.out.println("2. Hapus");
        System.out.println("3. Cari");
        System.out.println("3. Print");
        System.out.println("5. Keluar");
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
    public static void SubRemove(){
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
        LinkedListMhs linkedMhs = new LinkedListMhs();
        Scanner scan = new Scanner(System.in);
        Scanner scanStr = new Scanner(System.in);
        int menu=0;
        int sub=0;
        String nim="";
        String nama="";
        String alamat="";
        int index=0;
        
        
    }
    
}
