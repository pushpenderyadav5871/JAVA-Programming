public class calcpowershortrecursion {
    public static int calcpower(int x , int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        if(n%2==0){
            int a= calcpower(x, n/2) * calcpower(x, n/2);
            return a;
        }
        else{
            int a=calcpower(x, n/2)*calcpower(x, n/2)*x;
            return a;
        }
    }
    public static void main(String arsg[]){
        int x=15,n=10;
        int ans=calcpower(x, n);
        System.out.println(ans);

    }
    
}
