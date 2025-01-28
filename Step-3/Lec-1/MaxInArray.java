public class MaxInArray {

// TC =O(n) 
    public static int max(int arr[]){
        int n=arr.length;
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i] > max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={1,5,9,7,41,36,22,55,238};
        System.out.println(max(arr));
    }
}
