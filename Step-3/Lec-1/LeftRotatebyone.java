public class LeftRotatebyone {
    
    public static int[] rotate(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        return arr;
    }

    public static int[] rotate2(int arr[]){
        int n=arr.length;
        int temp=arr[0];

        for(int i=0;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        arr[n-1]=temp;
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        arr=rotate2(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
}
