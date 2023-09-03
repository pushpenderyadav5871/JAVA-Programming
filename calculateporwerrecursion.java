public class calculateporwerrecursion {
    public static int calcpower(int x,int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        int pownm1 = calcpower(x, n-1);
       int xpown = x * pownm1;
       return xpown;
    }
    public static void main(String args[]){
        int x=3,n=4;
        int ans=calcpower(x, n);
        System.out.println(ans);
    }
    
}
