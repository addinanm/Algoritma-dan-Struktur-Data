package Tugas6;


public class RataNilai {
    public String nama[];
    public int jml;
    public double rata2[];
    public double nl;

    public RataNilai(int jmlh) {
        this.nama = new String[jmlh];
        this.nl= 0;
        this.rata2 = new double [jmlh];
        this.jml=jmlh;
    }
    
    double rataDC(double arr[], int i, int j){
        if(i==j){
            return arr[1];
        }
        else if(i<j){
            int nilai= (i+j)/2;
            double anilai=rataDC(arr, i, nilai-1);
            double bnilai = rataDC(arr, nilai+1, j);
            return bnilai+anilai + arr[nilai];
        }
        return 0;
    }
}
