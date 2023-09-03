public class bitmanipulation {
    public static void main(String args[]){
        int number=5;
        int pos=1;
        int bitmask = 1<<pos;
        if((bitmask & number) == 0){
            System.out.println("bit was zero");
        }
        else{
            System.out.println("Bit was one");
        }
    }
    
}
