public class bubblesort {
    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
        System.out.println(arr[i] + " ");}
        System.out.println();
    }
    public static void main(String args[]){
        int array[]={1,4,2,3,7,8,5,6};
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-i-1;j++){
           if(array[j]>array[j+1]){
                int temp    =  array[j];
                array[j] = array[j+1];
                array[j+1]   =  temp;
            }
            }
        } printarray(array);
    }
   
   
    
}
