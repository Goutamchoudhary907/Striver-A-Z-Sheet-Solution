// If pivot is last element 

public class QuickSort2 {
    static void quickSort(int arr[], int low, int high) {
        qs(arr, low,high);
    }
    
    static void qs(int arr[],int low , int high){
        if(low < high){
            int pIndex=partition(arr, low, high);
            qs(arr, low, pIndex-1);
            qs(arr, pIndex+1, high);
        }
    }
    
    static int partition(int arr[], int low, int high) {
       int pivot=arr[high];
        int i=low;
        int j=high-1;
    
        while (i <= j) {
            
            while (i <=high-1 && arr[i] <= pivot ) {
                i++;   
            }
            while (j >=low && arr[j] > pivot) {
                j--;
            }
            if(i < j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[high];
        arr[high]=arr[i];
        arr[i]=temp;
        return i;
    }   
    public static void main(String[] args) {
        int arr[]={4,6,2,5,7,9,1,3};
        quickSort(arr,0,arr.length-1);
        for (int i = 0;i < arr.length;i++) {
             System.out.print(arr[i] +" ");
        }
    }
}
