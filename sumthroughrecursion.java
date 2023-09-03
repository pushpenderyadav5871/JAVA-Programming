public class sumthroughrecursion {
    public static void a(int i, int n, int sum){
        if(i==n){
             sum += i;
            System.out.println(sum);
            return;
        }
       
        sum +=i;
      a(i+1,n,sum);
        
        
    }
    public static void main(String args[]){
     a(1,20,0);

       
    }
    
}
