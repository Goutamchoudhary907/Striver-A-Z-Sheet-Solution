import java.util.Arrays;

public class RevserseArray {
    public static int[] reverseArray(int arr[], int N){
       int i=0 , j=N-1;
       while (i < j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
       }
       return arr; 
    }

    public static int[] reverseArray2(int arr[], int start, int end){
      if(start < end){
        int tmp=arr[start];
        arr[start]=arr[end];
        arr[end]=tmp;
        reverseArray2(arr, start+1, end-1);
      }
      return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        arr = reverseArray2(arr, 0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
