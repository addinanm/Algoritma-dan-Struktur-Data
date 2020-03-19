package BruteForce;
public class SoalSatu {
    public String[] text;
    public String[] pola;
    public int n;
    public int m;
    public int j;
    public int i;
    boolean cek;
    public  boolean bruteforce(char teks[], char pola[] ){
        for (i=0; i<= teks.length-pola.length; i++) {
            int j=1;
            while (j < pola.length && (this.pola[j]==(this.text[i + j]))) {
                j = j + 1;
                j++;
            }
            if (j == pola.length)
            cek = true;
            i= i+1;
        }
        if (cek) {
            System.out.println("Data Cocok");
        }else{
            System.out.println("Data Tidak Cocok");
        }
        return cek;
    }
    public static void main(String[] args) {
        char[] x = {'N','G','A'};
        char[] y = {'S','E','M','A','N','G','A','T'};
        SoalSatu s = new SoalSatu();
        s.bruteforce(x,y);
        
    }
}