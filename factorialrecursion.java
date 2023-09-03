public class factorialrecursion {
    public static int calcfactorial(int n){
        if(n==0 || n==1){
        return 1;
        }
        int facnm1= calcfactorial(n-1);
       int fact_n= n * facnm1;
       return fact_n;
        
    }
    public static void main(String args[]){
        int ans=calcfactorial(5);
        System.out.println(ans);
    }
    
}
