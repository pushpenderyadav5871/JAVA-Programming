//this program finds total number of ways to move to a certain block in a matrix 
public class CountPaths {
    public static int findpaths(int i, int j, int n ,int m){
        if(i==n-1 && j==m-1){
            return 1;
        }
        if(i==n || j==m){
            return 0;
        }
       int downpaths= findpaths(i+1, j, n, m);
         int rightpaths=findpaths(i, j+1, n, m);
        return downpaths+rightpaths;
        
    }
    public static void main(String args[]){
        int n=3,m=3;
        int Totalpaths=findpaths(0, 0, n, m);
        System.out.println(Totalpaths);
    }
    
}
