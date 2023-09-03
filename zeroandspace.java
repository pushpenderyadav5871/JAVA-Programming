import java.util.Scanner;

public class zeroandspace {
     public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                String padded =String.format("%-15s",s1);
               
                String text = String.format("%03d", x);
                 System.out.print(padded) ;System.out.println(text);
            }
            System.out.println("================================");

    }
}


