package Tiga;

public class Barang {
    public String nama;
    public int hargaSatuan;
    public int jumlah;

    public Barang() {
    }

    public Barang(String nama, int hargaSatuan, int jumlah) {
        this.nama = nama;
        this.hargaSatuan = hargaSatuan;
        this.jumlah = jumlah;
    }
    
    public int hitungHargaTotal(){
        return hargaSatuan *jumlah;
    }
    public int Diskon(){
        int diskon = 0;
        if(hitungHargaTotal()>100000){
            diskon = (int) (hitungHargaTotal() * 0.1);
        }else if(hitungHargaTotal()>=50000&&hitungHargaTotal()>=100000){
            diskon = hitungHargaTotal()*5/100;
        }else if(hitungHargaTotal()>50000){
            diskon = hitungHargaTotal()*0/100;
        }
        return diskon;
    }
    public  int hitungHargaBayar(){
        return hitungHargaTotal()-Diskon();
    }
}
