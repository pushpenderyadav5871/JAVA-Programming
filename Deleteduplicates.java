public class Deleteduplicates {
    public static boolean[] map=new boolean[26];
    public static void makiingnewstring(String str,int idx,String newstring){
        if(idx==str.length()){
            System.out.println(newstring);
            return;
        }
            char currchar=str.charAt(idx);
        if(map[currchar-'a']){
            makiingnewstring(str, idx+1, newstring);
        }
        else{
            newstring +=currchar;
            map[currchar-'a']=true;
            makiingnewstring(str, idx+1, newstring);
        }
    }
    public static void main(String args[]){
        String str="fghgigdjsja";
        makiingnewstring(str, 0, "");
    }
    
}
