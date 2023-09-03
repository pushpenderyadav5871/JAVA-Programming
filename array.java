import java.util.Scanner;

public class array {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int arr[]=  new int[10];
        for(int i=1;i<10;i++){
           arr[i]= sc.nextInt();
        }
        System.out.println(arr);

    }
    
}
