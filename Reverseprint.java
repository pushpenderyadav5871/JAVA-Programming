import java.util.Scanner;

public class Reverseprint {
    public static void main(String args[]){
        for(int a=0;a<3;a++){
       Scanner sc =new Scanner(System.in);
       String T = sc.nextLine();
        StringBuilder D= new StringBuilder(T);
        for(int i=0;i<D.length()/2;i++){
            int front=i;
            int back=D.length()-1-i;
             char frontchar= D.charAt(front);
             char backchar = D.charAt(back);
             D.setCharAt(front, backchar);
             D.setCharAt(back, frontchar);
             
             }
             System.out.println(D);
            }
    }
}
    

