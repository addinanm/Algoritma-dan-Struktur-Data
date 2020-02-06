package Tugastiga;

public class kata {
    public static void main(String[] args) {
//        char[] kata = {m,i,s,s,i,s,s,i,p,i}
char[] kata = {'m', 'i', 's', 's', 'i', 's', 's', 'i', 'p', 'i'};	   
int M = 0;
int I = 0;
int S = 0;
int P = 0;
for (int i=0; i<kata.length; i++) {	      
    if (kata[i] == 'm') M++;
}	   
System.out.println("Jumlah m pada kalimat tersebut : "+ M);

for (int j=0; j<kata.length; j++) {	      
    if (kata[j] == 'i') I++;
}	   
System.out.println("Jumlah i pada kalimat tersebut : "+ I);

for (int k=0; k<kata.length; k++) {	      
    if (kata[k] == 's') S++;
}	   
System.out.println("Jumlah s pada kalimat tersebut : "+ S);

for (int l=0; l<kata.length; l++) {	      
    if (kata[l] == 'p') P++;
}	   
System.out.println("Jumlah p pada kalimat tersebut : "+ P);
    }
    
}
