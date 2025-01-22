import java.util.ArrayList;

public class MergeSort {
//  TC =O(n log n)      SC O(n)
    private static void merge(int arr[],int low,int mid, int high){
        ArrayList<Integer> temp=new ArrayList<>();
        int left=low;
        int right=mid+1;
        
        while (left <= mid && right <=high) {
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }

        while(left <=mid){
            temp.add(arr[left]);
            left++;
        }

        while (right <=high) {
            temp.add(arr[right]);
            right++;
        }

        for(int i=low;i<=high;i++){
            arr[i]=temp.get(i-low);
        }
    }

    public static void mergeSort(int arr[] ,int low , int high){
        if(low >=high) return;
        int mid=(low+high)/2;
        mergeSort(arr, low, mid);            // left half
        mergeSort(arr, mid +1, high);        // right half

        merge(arr, low, mid, high);          // merging sorted halves
    }

    public static void main(String[] args) {
        int arr[]={9,4,7,6,3,1,5};
        int n=arr.length;
        mergeSort(arr, 0, n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }
    }
}
