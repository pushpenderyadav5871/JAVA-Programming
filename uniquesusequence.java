import java.util.HashSet;
public class uniquesusequence {
    /**
     * @param str
     * @param idx
     * @param newstr
     */
    public static void makingsubsequence(String str,int idx,String newstr,HashSet<String>set){
       if(idx==str.length()){
        if(set.contains(newstr)){
            System.out.println(newstr);
            return;
        }
        else{
            set.add(newstr);
             System.out.println(newstr);
           
            return;

        }
       }
       char currchar=str.charAt(idx);
        makingsubsequence(str, idx+1, newstr+currchar,set);
        makingsubsequence(str, idx+1, newstr,set);
       
    }
    public static void main(String args[]){
        String str="aaa";
        HashSet<String> set= new HashSet<>();
        makingsubsequence(str, 0, "",set);
    }
    
}

    

