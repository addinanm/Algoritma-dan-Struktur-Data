package uts;

public class MainUmur {
    public static void main(String[] args) {
        Umur u = new Umur();
        Umur[] um = new Umur[3];
        um[0] = new Umur("Budi","Ayah", 35);
        um[1] = new Umur("Budi","Ibu", 30);
        um[2] = new Umur("Budi","Anak", 8);
        
        int x, hasil;
        int data[] = {35, 30, 8};
        x = 8;
        System.out.println("Data harga menurut sorting selection sort descanding ");
        u.selectionSort(data);
        
        System.out.println("menggunakan binary Search");
        hasil = u.Binary(data, x, 0, data.length - 1);
        
        if (hasil >=0) {
            System.out.println(x + "--> ada anggota keluarga yang berumur " + x + " tahun");
        } else {
            System.out.println( x + "--> Tidak Ada anggota keluarga yang berumur " + x + "tahun");
        }     
  
        
    }
}
