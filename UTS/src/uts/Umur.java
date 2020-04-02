package uts;

public class Umur {
    public String nama;
    public String posisi;
    public int umur;
    public int list[] ;

    public Umur(String nama, String posisi, int umur) {
        this.nama = nama;
        this.posisi = posisi;
        this.umur = umur;
    }

    public Umur() {
    }
    
    public void selectionSort(int cariumur[]){
        for (int i = 0; i < cariumur.length-1; i++) {
            int id = i;
            for (int j = 0; j < cariumur.length-i; j++) {
                if (cariumur[j] < cariumur[id]) {
                    id = j;
                }
            }
            
            int tmp = cariumur [id];
            cariumur[id] = cariumur[i];
            cariumur[i] = tmp;
        }
    }
    
    public int Binary( int cariumur[], int cari, int left, int right) {
        int i;
        while (left <= right) {
            i = (left + right) /2;
            if (cari == cariumur[i]) {
                return i;
            } else if (cari < cariumur[i] ) {
                right = i - 1;
            } else {
                left = i +1;
            }
        }
        return -1;
    }
    
    public void info(){
        System.out.println("Nama : " + nama);
        System.out.println("Posisi : " + nama);
        System.out.println("Umur : " + nama);
    }
    
}
