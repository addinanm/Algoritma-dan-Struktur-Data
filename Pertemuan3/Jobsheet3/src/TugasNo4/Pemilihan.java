package TugasNo4;

import java.util.Scanner;

public class Pemilihan {
    static int n=6, n1=0, n2=0, n3=0, n4=0, n5=0, n6=0;
    static int[] Pemilihan = new int[n];
    static int length;
    public static int proses (int a){
        if (a==Pemilihan.length-1){
            return 0;
        }
        else{
            if (Pemilihan[a]==1){
                 n1+=1;
        }else if(Pemilihan[a]==2){
            n2+=1;
        }else if (Pemilihan[a]==3){
            n3+=1;
        } else if (Pemilihan[a]==4){
            n4++;
        } else if (Pemilihan[a]==5){
            n5++;
        }else if (Pemilihan[a]==4){
            n4++;
        }
            return proses(a+1);
            
        }
    
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calon Ketua \n1. Haris \n2. Dian \n3. Rani \n4. Bisma");
    for(int i=0; i<Pemilihan.length; i++){
        System.out.println("Masukan pemilih ke-"+(i+1));
        Pemilihan[i] = sc.nextInt();
    }
    proses(0);
        System.out.println("Ketua BEM ");
        if(n1>n2&& n1>n3 && n1>n4 && n1>n5&& n1>n6){
            System.out.println(" Haris");
        }
        else if(n2>n1&& n2>n3 && n2>n4&& n2>n5&& n2>n6){
            System.out.println(" Dian");
            
        }
        else if(n3>n2&& n3>n1 && n3>n4&& n3>n5&& n3>n6){
            System.out.println(" Rani ");
        }
       else if(n4>n2&& n4>n3 && n4>n1&& n4>n5&& n4>n6){
            System.out.println(" Bisma");
       }
    }
}
