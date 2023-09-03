import java.util.Scanner;
public class greaternumber {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b){
            System.out.print("Greater number is " + a);
        }
        else if(a==b){
            System.out.print("Both the numbers are equal");
        }
        else{
            System.out.print("Greater number is " + b);
        }


    }
    
}
