package quizasd2;

import java.util.Scanner;
public class MainLinkedPariwisata {
    static void menu() {
        System.out.println("+	+");
        System.out.println("1. Tambah");
        System.out.println("2. Hapus");
        System.out.println("3. Cari");
        System.out.println("4. Print");
        System.out.println("5. Keluar");
        System.out.println("+	+");
        System.out.print("Masukkan pilihan : ");
    }

    static void menuTambah() {
        System.out.println("+	+");
        System.out.println("1. Add First");
        System.out.println("2. Add Index");
        System.out.println("3. Add Key");
        System.out.println("4. Add Last");
        System.out.println("+	+");
        System.out.print("Masukkan pilihan : ");
    }

    static void menuHapus() {
        System.out.println("+	+");
        System.out.println("1. Hapus Index");
        System.out.println("2. Hapus Key");
        System.out.println("3. Hapus First");
        System.out.println("4. Clear");
        System.out.println("+	+");
        System.out.print("Masukkan pilihan : ");
    }

    static void menuCari() {
        System.out.println("+	+");
        System.out.println("1. Cari Index");
        System.out.println("2. Cari Key");
        System.out.println("3. Get First");
        System.out.println("4. Get Last");
        System.out.println("+	+");
        System.out.print("Masukkan pilihan : ");
    }
    
    public static void main(String[] args) {
        LinkedPariwisata linkedPrw = new LinkedPariwisata();
        Scanner scan = new Scanner(System.in);
        Scanner scanStr = new Scanner(System.in);
        int menu=0;
        int sub=0;
        String bulan="";
        String tahun1="";
        String tahun2="";
        String tahun3="";
        int index=0;
    try{
        do {
            menu();
            System.out.print("Masukkan pilihan = ");
            menu = scan.nextInt();
            
            switch (menu){
                case 1:
                        menuTambah();
                        System.out.print("Masukkan Pilihan =");
                        sub =scan.nextInt();
                        switch (sub) {
                            case 1:
                                System.out.println("Masukkan Bulan :");
                                bulan = scanStr.nextLine();
                                System.out.println("Tahun 2018");
                                tahun1 = scanStr.nextLine();
                                System.out.println("Tahun 2019");
                                tahun2 = scanStr.nextLine();
                                System.out.println("Tahun 2020");
                                tahun3 = scanStr.nextLine();
                                System.out.println("=========================");
                                linkedPrw.addFirst(bulan,tahun1,tahun2,tahun3);
                            break;
                            case 2:
                                System.out.println("Masukkan Bulan :");
                                bulan = scanStr.nextLine();
                                System.out.println("Tahun 2018");
                                tahun1 = scanStr.nextLine();
                                System.out.println("Tahun 2019");
                                tahun2 = scanStr.nextLine();
                                System.out.println("Tahun 2020");
                                tahun3 = scanStr.nextLine();
                                System.out.print("Masukkan indeks");
                                index = scan.nextInt();
                                System.out.println("=========================");
                                linkedPrw.add(bulan,tahun1,tahun2,tahun3,index);
                            break;
                            case 3:
                                System.out.println("Masukkan Bulan :");
                                bulan = scanStr.nextLine();
                                System.out.println("Tahun 2018");
                                tahun1 = scanStr.nextLine();
                                System.out.println("Tahun 2019");
                                tahun2 = scanStr.nextLine();
                                System.out.println("Tahun 2020");
                                tahun3 = scanStr.nextLine();
                                System.out.println("=========================");
                                linkedPrw.addLast(bulan,tahun1,tahun2,tahun3);
                            break;
                            default:
                                System.out.println("Pilihan tidak tersedia ");
                            
                        } 
                break;
                case 2:
                    menuHapus();
                    System.out.print("Masukkan pilihan : ");
                    sub = scan.nextInt();
                    switch (sub) {
                        case 1:
                        System.out.print("Masukkan indeks : ");
                        index = scanStr.nextInt();
                        linkedPrw.remove(index);
                        break;
                        case 2:
                        System.out.print("Cari dan Dihapus bulan : ");
                        bulan = scanStr.nextLine();
                        linkedPrw.removeKey(bulan);
                        break;
                        case 3:
                        linkedPrw.removeFirst();
                        break;
                        case 4:
                        linkedPrw.clear();
                        break;
                        default:
                            System.out.println("Pilihan tidak tersedia ");
                    }
                break;    
                
                case 3:
                    menuCari();
                    System.out.print("Masukkan pilihan : ");
                    sub = scan.nextInt();
                    switch (sub) {
                        case 1:
                        System.out.print("Masukkan indeks : ");
                        index = scan.nextInt();
                        linkedPrw.get(index);
                        System.out.println("Bulan :" +linkedPrw.get(index).bulan);
                        System.out.println("2018 :" +linkedPrw.get(index).tahun1);                        
                        System.out.println("2019 :" +linkedPrw.get(index).tahun2);
                        System.out.println("2020 :" +linkedPrw.get(index).tahun3);
                        break;
                        case 2:
                        System.out.print("Cari NIM : ");
                        bulan = scanStr.nextLine();
                        int nilai = linkedPrw.getKey(bulan);
                        if (nilai != -1) {
                             System.out.println( "Data ditemukan di index ke-"+nilai);
                        }
                        else{
                             System.out.println("Tidak ditemukan ");
                        }
                        break;
                        case 3:
                            System.out.println("Data : ");
                            System.out.println("Bulan : " + linkedPrw.getFirst().bulan);
                            System.out.println("2018 : "+linkedPrw.getFirst().tahun1);
                            System.out.println("2019 : "+linkedPrw.getFirst().tahun2);
                            System.out.println("2020 : "+linkedPrw.getFirst().tahun3);
                            break;
                        case 4:
                            System.out.println("Data : ");
                            System.out.println("Bulan : " + linkedPrw.getFirst().bulan);
                            System.out.println("2018 : "+linkedPrw.getFirst().tahun1);
                            System.out.println("2019 : "+linkedPrw.getFirst().tahun2);
                            System.out.println("2020 : "+linkedPrw.getFirst().tahun3);
                            break;
                        default:
                            System.out.println("Pilihan tidak tersedia ");
                    }
                break;
                case 4:
                    linkedPrw.print();
                break;
                    
            }
        }while (menu != 0);
    }
    catch (Exception e) {
    System.out.println(e.getMessage());
    }
    }
}
