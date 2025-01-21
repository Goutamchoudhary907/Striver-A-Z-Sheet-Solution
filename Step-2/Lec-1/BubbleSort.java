public class BubbleSort {
 public static void bubbleSort(int arr[], int n){
 // TC = O(n^2)   
    for(int i=n-1;i>=0;i--){
        for(int j=0;j<i;j++){
            if(arr[j] > arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
 }
  
// TC = O(n) in best case if arr is already sorted , no swap will occur and break the loop 
  public static void sortedBubbleSort(int arr[], int n){
    for(int i=n-1;i>=0;i--){
        boolean didSwap=false;
        for(int j=0;j<i;j++){
            if(arr[j] > arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                didSwap=true;
            }
        }
        if(!didSwap){
            break;
        }
    }
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
  }
 
 public static void main(String[] args) {
    int arr[]={13,46,24,52,20,9};
    int n=arr.length;
    sortedBubbleSort(arr, n);
 }
}