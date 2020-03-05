package DevideConquer;

public class SoalDua {
    static void divideconquer(int numDisc, char source, char destination, char spare){
        if (numDisc == 1) {
                 System.out.println("Pindah 1 gelang dari tower : " + source + " ke " + destination);
        }
        if (numDisc > 1) {
            divideconquer(numDisc-1, source, spare, destination);
            System.out.println("Pindah gelang " + numDisc + " dari tower " + source + " ke " + destination);
        }
        if (numDisc > 1) {
            divideconquer(numDisc-1, spare, destination, source);
        }
    }
    
    public static void main(String args[]) 
    { 
        int n = 4; // Jumlah gelang
        divideconquer(n, 'A', 'C', 'B');  // A, B and C adalah nama tower 
    } 
    
}
