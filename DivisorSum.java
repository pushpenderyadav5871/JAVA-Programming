//This program returns the sum of all divisor of an integer n
import java.util.Scanner;
public class DivisorSum {
    public static void calculatesum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
                sum +=i;
                
            }
           
        }
         System.out.println(sum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        calculatesum(n);
    }
    
}
