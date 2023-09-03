import java.util.Scanner;

public class Solution {

    /**
     * @param args
     * @param string
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int i = sc.nextInt();
        Double d= sc.nextDouble();
        String line = sc.nextLine(); 
        // Write your code here.

        extracted(line); 
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

    private static void extracted(String line) {
        System.out.println( "String:"+ line);
    }

  
}