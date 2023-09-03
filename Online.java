import java.util.Scanner;
public class Online();
{
   public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double mealcost= sc.nextDouble();
        int tippercent =sc.nextInt();
        int taxpercent=sc.nextInt();
        
        int totalcost=  (int) (mealcost + tippercent*mealcost/100 + taxpercent*mealcost/100) ;
        System.out.print(totalcost);
    }
}