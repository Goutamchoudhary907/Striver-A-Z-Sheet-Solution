public class SecondMinAndMax {

//  TC =O(n)     SC =O(1)
    static void secondMinAndMax(int arr[]){
      int n=arr.length;
      if( n==0 || n==1){
      System.out.print(-1 + " " + -1);
      }
      int min=Integer.MAX_VALUE;
      int secondMin=Integer.MAX_VALUE;

      int max=Integer.MIN_VALUE;
      int secondMax=Integer.MIN_VALUE;
      
      for(int i=0;i<n;i++){
         min=Math.min(min, arr[i]);
         max=Math.max(max, arr[i]);
      }
      for(int i=0;i<n;i++){
         if(arr[i] < secondMin && arr[i] !=min){
            secondMin=arr[i];
         }
         if(arr[i] > secondMax && arr[i] !=max){
            secondMax=arr[i];
         }
      }
      System.out.println("Second smallest is "+secondMin);
      System.out.println("Second largest is "+secondMax);
    }
    
    static int secondSmall(int arr[]){
      int n=arr.length;
      if(n<2) return -1;
      int min=Integer.MAX_VALUE;
      int secondMin=Integer.MAX_VALUE;
      for(int i=0;i<n;i++){
         if(arr[i] < min){
            secondMin=min;
            min=arr[i];
         }else if(arr[i] < secondMin && arr[i] !=min){
            secondMin=arr[i];
         }
      }
      if(secondMin==Integer.MAX_VALUE){
         return -1;
      }
      return secondMin;
    }
    
    static int secondLargest(int arr[]){
      int n=arr.length;
      if(n<2){
         return -1;
      }
      int max=Integer.MIN_VALUE;
      int secondMax=Integer.MIN_VALUE;

      for(int i=0;i<n;i++){
         if(arr[i] > max){
            secondMax=max;
            max=arr[i];
         }else if(arr[i] > secondMax && arr[i] !=max){
            secondMax=arr[i];
         }
      }
   // All elements of arr are same hence it does not update 
      if(secondMax == Integer.MIN_VALUE){
         return -1;
      }
      return secondMax;
    }
    public static void main(String[] args) {
       int arr[]={1,2,3,4,5,6,7,8};
      //  secondMinAndMax(arr);

       System.out.println("Second smallest is " + secondSmall(arr));
       System.out.println("Second largest is "+ secondLargest(arr));
    }
}
