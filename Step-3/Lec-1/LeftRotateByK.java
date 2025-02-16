public class LeftRotateByK {
  public static void rotateLeft(int arr[],int k){
    int n=arr.length;
    if(n==0){
        return;
    }
    k=k%n;
    if(k>n) return;

    int temp[]=new int[k];
    for(int i=0;i<k;i++){            // store first k elements in temp arr
          temp[i]=arr[i];
    }

    for(int i=0;i<n-k;i++){         // shift remaining elements left by k pos
        arr[i]=arr[i+k];
    }
    for(int i=n-k;i<n;i++){         // copy temp arr elements to end
        arr[i]=temp[i-n+k];
    }
  }
  
  public static void rotate(int arr[], int k){
    int n=arr.length;
    reverse(arr, 0, k-1);        // Reverse first k elements
    reverse(arr, k, n-1);              // Reverse remaining elements
    reverse(arr, 0, n-1);        // Reverse entire array
  }

  public static void reverse(int arr[],int start, int end){
    while(start <=end){
      int temp=arr[start];
      arr[start]=arr[end];
      arr[end]=temp;
      start++;
      end--;
    }
  }
  public static void main(String[] args) {
     int arr[]={1,2,3,4,5,6,7};
     rotateLeft(arr, 2);
    // Rotatetoright(arr, arr.length, 2);
     for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
     }
  }  
}
