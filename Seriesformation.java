import java.util.*;


class Seriesformation{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            print(a,b,n);
            }
        in.close();
        
    }
    

public static void print(int a,int b,int n){
    int sum=a;
    for(int i=0;i<n;i++){
        sum += Math.pow(2, i)*b;
        System.out.print(sum + " ");
    }
    System.out.println();
}
}