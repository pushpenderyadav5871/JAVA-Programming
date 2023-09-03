public class quicksortsolution {
    public static void quickSort(int arr[], int low , int high){
        if(low<high){
            int piidx= partition(arr,low,high);
            quickSort(arr, low, piidx-1);
            quickSort(arr,piidx+1, high);
        }
    }
    public static int partition(int arr[], int low ,int high){
        int pivot =arr[high];
        int i=low-1;

        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //swap with pivot
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }
    public static void main(String[] args){
        int arr[] = {3,1,8,5,9,4};
        quickSort(arr, 0,arr.length-1);
        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]+"");
        }
    }
    
}
