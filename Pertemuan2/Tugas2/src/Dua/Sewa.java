package Dua;

public class Sewa {
    public int id;
    public String namaMember;
    public String namaGame;
    public int lama;
    public int harga;

    public Sewa() {
    }
    
    public int hitungSewa(){
        int total = lama * harga;
        return total;
    }
    
}
