// Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
public class RightRotateByK {

    public static void Rotatetoright(int[] arr, int n, int k) {
        if (n == 0)
          return;
        k = k % n;
        if (k > n)
          return;
    
        int[] temp = new int[k];            
        for (int i=n-k;i<n;i++){          // store last k elements in temp arr
          temp[i-n+k] = arr[i];
        }
        for (int i=n-k-1;i>=0;i--) {      // shift remaining elements to right
          arr[i + k] = arr[i];
        }
        for (int i=0;i<k;i++) {           // copy temp arr to start
          arr[i] = temp[i];
        }
    }
   
    public static int[] rotate(int nums[], int k){
      int n=nums.length;
      k=k%n;

      reverse(nums,0, n-1);       // Reverse entire array

      reverse(nums, 0, k-1);      // Reverse first k elements

      reverse(nums, k, n-1);           // Reverse remaining elements
      return nums;
    }

    public static void reverse(int[]nums ,int left, int right){
        while (left < right) {
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right --;
        }
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7};
        nums=rotate(nums, 3);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i] +" ");
        }
    }
}
