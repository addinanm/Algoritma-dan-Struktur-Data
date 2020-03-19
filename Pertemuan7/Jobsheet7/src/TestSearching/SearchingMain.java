package TestSearching;

public class SearchingMain {
    public static void main(String[] args) {
        int data[] = {10,30,40,50,60,70,80,90};
        Searching pencarian = new Searching(data, 8);
        System.out.println("isi Array");
        pencarian.TampilData();
        
        int cari = 30;
        System.out.println("menggunakan sequential search");
        int posisi = pencarian.FindSeqSearch(cari);
        if (posisi != -1) {
            System.out.println("data : " + cari + " ditemukan pada indeks " + posisi);
        }else{
            System.out.println("data : " + cari + "tidak ditemukan");
        }
//        
        pencarian.Tampilposisi(cari, posisi);
        System.out.println("===============================");
        System.out.println("menggunakan binary Search");
        posisi = pencarian.FindBinarySearch(cari, 0, data.length - 1);
        pencarian.Tampilposisi(cari, posisi);
        
    }
}
