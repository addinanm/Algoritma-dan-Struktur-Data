package TugasNo2;

public class Fibonacci {
    public int FibDq(int n){
        if(n<=1){
            return n;
        }else{
            return FibDq(n-1) + FibDq(n-2);
        }
    }
    
    public int FibBf(int n){
        int fibo[];
        fibo = new int [n+2];  
        fibo[0] = 0;
        fibo[1] = 1; 
         
        for (int i = 2; i <= n; i++) 
        {
        fibo[i] = fibo[i-1] + fibo[i-2]; 
        }  
        return fibo[(int)n];

    }
}
