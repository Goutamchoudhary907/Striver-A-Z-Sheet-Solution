public class RecursivebubbleSort {
 
//  TC =O(n^2), in best case O(n)  ,  SC=O(n) 
  public static void bubbleSort(int arr[], int n){
  if(n==1) return;
  boolean didSwap=false;
  for(int j=0;j<=n-2;j++){
    if(arr[j] > arr[j+1]){
     int temp=arr[j];
     arr[j]=arr[j+1];
     arr[j+1]=temp;
     didSwap=true;
    }
  }
   if(!didSwap) return;
  bubbleSort(arr, n-1);
  } 
  
  public static void main(String[] args) {
    int arr[]={13,46,24,52,20,9};
    int n=arr.length;

    bubbleSort(arr, n);
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+ " ");
    }
  }
}
