package TugasNo1;
import java.util.Scanner;

public class MainNilaiAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Jumlah Mahasiswa :");
        int mhs = sc.nextInt();
        NilaiAlgoritma[] na = new NilaiAlgoritma[mhs];
        for (int i = 0; i <mhs; i++) {
            na[i] = new NilaiAlgoritma();
            System.out.println("Nama Mahasiswa :");
            na[i].namaMHS = sc.next();
            System.out.println("Nilai Tugas :");
            na[i].nilaiTugas = sc.nextInt();
            System.out.println("Nilai Kuis :");
            na[i].nilaiKuis = sc.nextInt();
            System.out.println("Nilai UTS :");
            na[i].nilaiUTS = sc.nextInt();
            System.out.println("Nilai UAS :");
            na[i].nilaiUAS = sc.nextInt();
        }
        System.out.println();
        for(int i=0; i<mhs;i++){
            System.out.println("Nama Mahasiswa = "+na[i].namaMHS);
            System.out.println("Nilai Akhir Mahasiswa = "+na[i].hitungTotalNilai());
        }
        
    }
}
