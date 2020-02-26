package TugasNo3;

public class RataRata {
    public int tugas,kuis, uts,uas; 
    public int rataRataBF(int a){
        int hasil = 1;
        for (int i = 0; i <a; i++) {
            hasil = hasil *a;
        }
        return hasil;
    }
}
