import java.util.Scanner;

public class recursionself {
    /**
     * @param args
     */
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int product = 1;
        for(int i=n;i>=1;i--){
            product =product*i; 
    }
    System.out.println(product);
    
}
}
