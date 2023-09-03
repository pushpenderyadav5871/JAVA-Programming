//this program is to find total ways of placing 1*m tiles in a floor of size n*m
public class placingtiles {
    public static int countways(int n, int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        //placing vertically
        int vertways = countways(n-m, m);
        // placing horizontally
        int horztways = countways(n-1, m);
        return vertways+horztways;

    }
    public static void main(String args[]){
        int n=4,m=2;
        System.out.println(countways(n, m));
    }
    
}
