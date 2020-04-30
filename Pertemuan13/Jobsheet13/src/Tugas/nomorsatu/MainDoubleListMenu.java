package Tugas.nomorsatu;
import java.util.Scanner;

public class MainDoubleListMenu {
    public static void Menu() {
        System.out.println("DOUBLE LINK LIST DENGAN MENU"); 
        System.out.println("==============================");
        System.out.println("Memilih menu"); 
        System.out.println("1. Tambah Awal"); 
        System.out.println("2. Tambah Akhir"); 
        System.out.println("3. Tambah Data Indeks Tertentu"); 
        System.out.println("4. Hapus Awal"); 
        System.out.println("5. Hapus Akhir"); 
        System.out.println("6. Hapus Indeks Tertentu"); 
        System.out.println("7. Cetak Data"); 
        System.out.println("8. Cari");
        System.out.println("10. Keluar"); 
        System.out.println("==============================");
        System.out.print(">> ");
    } 
    
    public static void main(String[] args) throws Exception {
        int menu = 0;
        Scanner scan = new Scanner(System.in);
        DoubleLinked linked = new DoubleLinked();
        try {
            do {                
                Menu();
                menu = scan.nextInt();
                System.out.println("==============================");
                switch(menu) {
                    case 1 : {
                        System.out.println("Masukkan Data :");
                        linked.addFirst(scan.nextInt());
                        System.out.println();
                        break;
                    }
                    case 2 : {
                        System.out.println("Masukkan Data :");
                        linked.addLast(scan.nextInt());
                        System.out.println();
                        break;
                    }
                    case 3 : {
                        int nilai;
                        int index;
                        System.out.println("Masukkan Data :");
                        nilai = scan.nextInt();
                        System.out.println("Masukkan Index :");
                        index = scan.nextInt();
                        linked.add(nilai, index);
                        System.out.println();
                        break;
                    }
                    case 4 : {
                        linked.removeFirst();
                        System.out.println("Masukkan Data awal :");
                        System.out.println();
                        break;
                    }
                    case 5 : {
                        linked.removeLast();
                        System.out.println("Masukkan Data akhir :");
                        System.out.println();
                        break;
                    }
                    case 6 : {
                        int hapus;
                        System.out.println("Hapus index data ke- ");
                        hapus = scan.nextInt();
                        linked.remove(hapus);
                        System.out.println();
                        break;
                    }
                    case 7 : {
                        linked.print();
                        break;
                    }
                    case 8 : {
                        System.out.println("Cari data :");
                        linked.cari(scan.nextInt());
                        System.out.println();
                        break;
                    }
                    case 9 : {
                        System.out.println();
                        break;
                    }
                }
                
            } while (menu != 9);
        }
        catch (Exception e){ 
            System.out.println(e.getMessage());
        }
    }
}
