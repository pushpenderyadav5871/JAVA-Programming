import java.util.Scanner;

public class breakstatment {
    /**
     * @param args
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch(button){
            case 1 : System.out.println("January");
            break;
            case 2 : System.out.println("Februrary");
            break;
            case 3 : System.out.println("March");
            break;
            case 4 : System.out.println("April");5
            break;
            case 5 : System.out.println("May");
            break;
            case 6 : System.out.println("June");
            break;
        }
    }
    
}
