import java.util.Scanner;
public class sumofoddnumbers {
    /**
     * @param args
     */
    public static void main(String args[]){
        
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
     if(n%2==0){
            System.out.println("Even Number");
        }
        else{
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
            sum=sum+i;
        }
    }
    System.out.println(sum);
}
    
}
}
