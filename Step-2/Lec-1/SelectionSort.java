public class SelectionSort {

    public static void selectionSort(int arr[], int n){
// TC = O(n^2)   SC = O(1)
        for(int i=0;i<n-1;i++){
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[minIndex]){
                    minIndex=j;
                }
            }
            // Swap
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={9,1,36,4,0,25,3};
        int n=arr.length;
        selectionSort(arr, n);
    }
}
