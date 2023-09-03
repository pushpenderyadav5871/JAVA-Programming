import java.util.Scanner;


public class ifelse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a%b==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
