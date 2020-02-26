package TugasNo1;

public class NilaiAlgoritma {
    public String namaMHS;
    public int nilaiTugas;
    public int nilaiKuis;
    public int nilaiUTS;
    public int nilaiUAS;

    public NilaiAlgoritma() {
    }
    
    public double hitungTotalNilai(){
        return (0.3*nilaiTugas)+(0.2*nilaiKuis)+(0.2*nilaiUTS)+(0.3*nilaiUAS);
    }
    
    public int rataRataBF(int n){
        int rata = 0;
        return rata/n;
    }
    
}
