package Lima;

public class JajarGenjang {
    public int tinggi, panjang, sisiMiring;

    public JajarGenjang(int tinggi, int panjang, int sisiMiring) {
        this.tinggi = tinggi;
        this.panjang = panjang;
        this.sisiMiring = sisiMiring;
    }
    
    
    public double hitungLuas(){
        return panjang * tinggi;
    }
    
    public double hitungKeliling(){
        return 2*(panjang + sisiMiring);
    }
}
