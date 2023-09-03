import java.util.Scanner;

class Geeksforgeeks{
    static int isPalindrome(String  S[])
    {   String arr1[] = new String[S.length];
        for(int idx=0,j=0;idx<S.length;idx++,j++){
            arr1[idx] =S[j];
        }
        String arr2[] = new String[S.length];
        for(int pos=S.length-1,k=0;pos<0;pos--,k++){
            arr2[k] = S[pos];
        }
        if(
            arr1 == arr2
        ){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String array[] = new String[n];
        for(int i=0;i<n;i++){
            array[i]=sc.next();
        }
      System.out.println(isPalindrome(array)); 
      

    }
}