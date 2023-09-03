public class keypadformation {
    public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void printstring(String str,int idx,String combination){
        if(idx==str.length()){
            System.out.println(combination);
            return;
        } 
        char currchar=str.charAt(idx);
        String mapping=keypad[currchar-'0'];
        for(int i=0;i<mapping.length();i++){
            printstring(str, idx+1, combination+mapping.charAt(i));
        }
    }
    public static void main(String args[]){
        printstring("63", 0, "");

    }
    
}
