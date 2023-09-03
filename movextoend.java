//This program is to move all x in a string to End 
public class movextoend {
    public static void moveallx(String str,int idx,int count,String newstring){
        
      if(idx==str.length()){
        for(int i=0;i<count;i++){
            newstring += 'x';
        }
        System.out.println(newstring);
        return;
      }
      
      
        if(str.charAt(idx)=='x'){
            count++;
        }
        else{
            newstring += str.charAt(idx);
        }
        moveallx(str, idx+1, count, newstring);
    }
    public static void main(String args[]){
        String str="abxcxbxcx";
        String newString="";
        moveallx(str, 0, 0, newString);
    }
    
}
