

public class Recursion2 {
    public static void TowerofHanoi(int n,String src,String Helper,String Dest){
       if(n==1){
        System.out.println("transfer disk" +" "+ n +" "+ "from" +" "+ src + " "+"to" +" "+ Dest);
        return;
       }
        TowerofHanoi(n-1, src, Dest, Helper);
        System.out.println("transfer disk" +" "+ n + " "+"from" +" "+ src +" "+ "to" +" "+ Dest);
        TowerofHanoi(n-1, Helper , src , Dest);
    }
    public static void main(String args[]){
        int n=3;
     
      String sc =  " Source";
      String Hr = "Helper";
      String Dt = "Destination";
        TowerofHanoi(n, sc,Hr, Dt);
    }
}
