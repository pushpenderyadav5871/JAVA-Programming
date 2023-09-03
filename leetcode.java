import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class leetcode {
    public  static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> resulList = new ArrayList<>();
        int max=candies[0];
        for(int i=0;i<candies.length;i++){
             if(candies[i]>max){
                max=candies[i];
             }
            }
            for(int j=0;j<candies.length;j++){
                if(candies[j]+extraCandies>=max){
                   resulList.add(true);
                }
                else{
                    resulList.add(false);
                }   
            }
            return resulList;
}
    
    public static void main(String[] args){
         Scanner sc= new Scanner(System.in);
        int i = sc.nextInt();
         int candies[]=  new int[i];
        for(int p=0;p<i;p++){
           candies[p]= sc.nextInt();
        }
        int extraCandies=sc.nextInt();
        System.out.println(kidsWithCandies(candies , extraCandies));


} 
    }

