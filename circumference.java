import java.util.Scanner;
public class circumference {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of circle");
        int radius=sc.nextInt();
        double perimeter =(double ) (2*22*radius)/7 ;
        System.out.println(perimeter);


    }
    
}
