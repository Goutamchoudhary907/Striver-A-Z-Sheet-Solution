public class MoveZerosToEnd {

// TC =O(n)  SC=O(n) 
  public static void moveZero(int arr[]){
    int n=arr.length;
    int temp[]=new int[n];
    int j=0;
    for(int i=0;i<n;i++){
    if(arr[i] !=0){
     temp[j++]=arr[i];
    }  
    }

   for(int i=0;i<n;i++){
    arr[i]=temp[i];
   }
  }
  

//  TC =O(n)  SC=O(1) 
  public static int[] move(int arr[]){
    int j=-1;
    int n=arr.length;
    for(int i=0;i<n;i++){
     if(arr[i] ==0){
        j=i;
        break;
     }
    }
    if(j== -1) return arr;

    for(int i=j+1;i<n;i++){
        if(arr[i] !=0){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j++;
        }
    }
    return arr;
  }
  public static void main(String[] args) {
    int arr[]={1,0,2,3,0,4,0,1};
   arr= move(arr);
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
  }    
}
