public class Printpermutation {
    public static void makingpermutation(String str , String permutation){
       if(str.length()==0){
        System.out.println(permutation);
        return;
       }
      
        for(int i=0;i<str.length();i++){
            char currchar = str.charAt(i);
            //"abc -> ab"
            
            String newstring= str.substring(0,i)+str.substring(i+1);
            makingpermutation(newstring, permutation+currchar);
        }
    }
    public static void main(String args[]){
        String str = "abc";
        makingpermutation(str, "");

    }
    }
    

