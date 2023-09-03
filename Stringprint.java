import java.util.Scanner;
class Stringprint {
    public static String gcdOfStrings(String str1, String str2) {
        String arr[]=new String[str1.length()-1];
        String arb[]=new String[str2.length()-1];
       int i=0;
       int j=0;
       while(i<str1.length() && j<str2.length()){
           if(str1.charAt(i) == str2.charAt(j)){
               System.out.print(str1.charAt(i));
           }
           i++;
           j++;
       }
    return str2; 
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        gcdOfStrings(str1 , str2);
    }
}