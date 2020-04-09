package Tugas.Nomor2;

public class Nasabah {
    public String noRekening;
    public String nama;

    public Nasabah(String noRek, String nm) {
        this.noRekening = noRek;
        this.nama = nm;
    }
    
    void print(){
        System.out.println("Nama Nasabah : " + nama);
        System.out.println("Nomor Rekening : " + noRekening);
    }
    
}
