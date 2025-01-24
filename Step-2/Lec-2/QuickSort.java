public class QuickSort {
/*  TC = O(n * log n)   SC =O(n)
 worst case= O(n^2)
 If the partition is done and the last element is the pivot, 
 then the worst case would be either in the increasing order of the array or in the decreasing order of the array. 
*/
    static int partition(int arr[], int low , int high){
        int pivot=arr[low];
        int i=low;
        int j=high;

        while (i < j) {
            
            while (arr[i] <= pivot && i <=high-1) {
                i++;   
            }
            while (arr[j] > pivot && j >=low+1) {
                j--;
            }
            if(i < j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;
        return j;
    }
    
    static void qs(int arr[],int low , int high){
        if(low < high){
            int pIndex=partition(arr, low, high);
            qs(arr, low, pIndex-1);
            qs(arr, pIndex+1, high);
        }
    }
    public static int[] quickSort(int arr[]){
        qs(arr, 0,arr.length-1);
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={4,6,2,5,7,9,1,3};
        arr=quickSort(arr);
        for (int i = 0;i < arr.length;i++) {
             System.out.print(arr[i] +" ");
        }
    }
}
