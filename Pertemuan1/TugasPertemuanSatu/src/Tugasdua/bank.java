package Tugasdua;

public class bank {
    
    public static void main(String[] args) {
        int uang = 0;
        double bunga;
        for (int saldo = 1000000; saldo <= 1500000; saldo += bunga){
            bunga = saldo *0.02;
            uang++;
            System.out.println("saldo pada bulan ke " + uang + " adalah " + saldo);
        }
        System.out.println("Lama menabung = "+ uang + " bulan");
    }
    
}
