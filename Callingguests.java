//this program find the total number of ways to invite guests in your party
public class Callingguests {
    public static int calculateways(int n){
        if(n<=1){
            return 1;
        }
        
        //n is number of guests
        //inviting single
        int invising= calculateways(n-1);
        //making pairs and then inviting
        int pairinvite= (n-1)*calculateways(n-2);
        return invising+pairinvite;
    }
    public static void main(String args[]){
        int n=4;
       System.out.println(calculateways(n));
    }
}
