public class printsubsequence {
    public static void makingsubsequence(String str,int idx,String newstr){
       if(idx==str.length()){
        System.out.println(newstr);
        return;
       }
       char currchar=str.charAt(idx);
        makingsubsequence(str, idx+1, newstr+currchar);
        makingsubsequence(str, idx+1, newstr);
       
    }
    public static void main(String args[]){
        String str="abc";
        makingsubsequence(str, 0, "");
    }
    
}
