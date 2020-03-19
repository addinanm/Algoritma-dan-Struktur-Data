package Tugas;

import java.util.Scanner;

public class Tiket {
    public int transitCount;
    public String maskapai;
    public int flightTime;
    public float harga;
    Tiket listTiket[] = new Tiket[4];
    Tiket tkt ;
    int idx;

    public Tiket(int tc, String maskapai, int ft, float harga) {
        this.transitCount = tc;
        this.maskapai = maskapai;
        this.flightTime = ft;
        this.harga = harga;
    }

    public Tiket() {
        
    }
    public void tampil(){
        System.out.println("Nama Pesawat = "+maskapai);
        System.out.println("Transit = "+transitCount);
        System.out.println("Waktu Penerbangan = "+flightTime);
        System.out.println("Harga = "+harga);
    }
    
    public void tambah(Tiket ti){
        if (idx<listTiket.length) {
            listTiket[idx] = ti;
            idx++;
        }else{
            System.out.println("Data sudah penuh!!");
        }
    }
    
    public void bubbleSort(){
        for (int i = 0; i < listTiket.length-1; i++) {
            for (int j = 1; j < listTiket.length-i; j++) {
                if (listTiket[j].harga < listTiket[j-1].harga) {
                    Tiket tkt = listTiket[j];
                    listTiket[j] = listTiket[j-1];
                    listTiket[j-1] = tkt;
                    
                }
            }
        }
        for(Tiket m : listTiket){
            m.tampil();
            System.out.println("------------------------------");
        }
    }
    
    public void selectionSort(){
        for (int i = 0; i < listTiket.length-1; i++) {
            int Min = i;
            for (int j = i+1; j < listTiket.length; j++) {
                if (listTiket[j].harga < listTiket[Min].harga) {
                    Min = j;
                }
            }
            
            Tiket t = listTiket [Min];
            listTiket[Min] = listTiket[i];
            listTiket[i] = t;
        }
        for(Tiket m : listTiket){
            m.tampil();
            System.out.println("------------------------------");
        }
    }
    
    public static void main(String[] args) {
        Tiket listTiket[] = new Tiket[4];
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        Tiket tk = new Tiket();
        int jml = 4;
        
        for (int i = 0; i < jml; i++) {
            System.out.println("Nama =");
            String jns = s1.nextLine();
            System.out.println("Harga =");
            float hr = s.nextFloat();
            System.out.println("Transit =");
            int jum = s.nextInt();
            System.out.println("Tempat Duduk =");
            int tmp = s.nextInt();
            
            Tiket t1 = new Tiket(tmp, jns, jum, hr);
            tk.tambah(t1);
        }
        System.out.println("Data mahasiswa sebelum sorting = ");
        tk.tampil();
        System.out.println();
        System.out.println("Data harga menurut sorting bubble sort = ");
        tk.bubbleSort();
        System.out.println();
        System.out.println("Data harga menurut sorting selection sort = ");
        tk.selectionSort();
    }
}
