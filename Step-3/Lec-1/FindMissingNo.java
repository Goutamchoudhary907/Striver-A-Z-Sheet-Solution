public class FindMissingNo {
 
    // omly work when arr is sorted
    public static int findMissing(int arr[]){
      int n=arr.length;
      for(int i=0;i<n-1;i++){
         if(arr[i+1] != (arr[i] +1)){
            return arr[i] +1 ;
         }
      }
      return 0;
    }

// TC =O(n)
    public static int missingNumber(int arr[]){
     int n=arr.length+1;
      // sum of first n numbers
        int sum= (n * (n+1)) /2;

      // summation of all arr elements
      int s=0;
      for(int i=0;i<n-1;i++){
        s +=arr[i];
      }
      int missingNum=sum-s;
      return missingNum; 

    }
    
// TC =O(n)
    public static int missingNum(int arr[]){
      int n=arr.length+1;
      int xor1=0 , xor2=0;
      for(int i=0;i<n-1;i++){
        xor2= xor2 ^ arr[i];      // XOR of array elements
        xor1=xor1 ^ (i+1);        // XOR up to [1 ... N-1]
      }
      xor1=xor1 ^n;      // XOR upto [1...N]

      return (xor1 ^ xor2);  // missing number
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,7,8,9};
       System.out.println(missingNum(arr));
    }
}
