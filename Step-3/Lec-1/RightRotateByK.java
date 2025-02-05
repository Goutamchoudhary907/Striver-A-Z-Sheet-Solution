// Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
public class RightRotateByK {

    public static int[] rotate(int nums[], int k){
      int n=nums.length;
      k=k%n;

      reverse(nums,0, n-1);

      reverse(nums, 0, k-1);

      reverse(nums, k, n-1);
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
