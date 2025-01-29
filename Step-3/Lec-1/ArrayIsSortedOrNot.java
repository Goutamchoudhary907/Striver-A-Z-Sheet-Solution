public class ArrayIsSortedOrNot {
 
    public static boolean isSorted(int arr[]){
        int n=arr.length;
       
        if(n==0 || n==1) {
            return true;
        }
        boolean isAscending=true;
        boolean isDescending=true;

        for(int i=0;i<n-1;i++){
            if(arr[i] > arr[i+1]){
                isAscending=false;       // Not ascending
            }
            if(arr[i] < arr[i+1]){
              isDescending=false;        // Not descending
            }
        }
        return isAscending || isDescending;
    }
    public static void main(String[] args) {
        int arr[]={5,4,3,0,11,12,2,1,0};
        System.out.println(isSorted(arr));
    }
}
