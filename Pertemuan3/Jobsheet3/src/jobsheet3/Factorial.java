package jobsheet3;

public class Factorial {
    public int nilai;
    
    public int faktorialBF(int n){
        int fakto = 1;
        for (int i = 0; i <=n; i++) {
            fakto = fakto *i;
        }
        return fakto;
    }
    public int faktorialDF(int n){
        if(n==1){
            return 1;
            
        }else{
          int fakto = n*faktorialDF(n-1);
          return fakto;
        }
    }

}
