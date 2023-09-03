public class RcursionStringReversePrint {
    public static void reverseprint(int n,String a){
       if(n==0){
        System.out.println(a.charAt(n));
        return;
       } 
        System.out.print(a.charAt(n));
        reverseprint(n-1, a);
    }
    public static void main(String args[]){
        String a ="Pushpender";
        int n = a.length()-1;
        reverseprint(n, a);
    }
    
}
