public class substring {
    public static void makingsubstr(String str){
        for(int i=0;i<str.length();i++){
            String newString= str.substring(i);
            System.out.println(newString);

        }
    }
    public static void main(String args[]){
        String str="Pushpender";
        makingsubstr(str);
    }
    
}
