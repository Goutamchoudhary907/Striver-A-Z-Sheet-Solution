public class BucketSort{

    static int getMax(int arr[]){
     int n=arr.length;
     int max=arr[0];
     for(int i=1;i<n;i++){
        if(arr[i] > max){
            max=arr[i];
        }
     }
     return max;
    }

    public static void bucketSort(int arr[]){
        int n=arr.length;
        int max=getMax(arr);

        int bucket[]=new int[max+1];
        for(int i=0;i<=max;i++){
            bucket[i]=0;
        }
        for(int i=0;i<n;i++){
            bucket[arr[i]]++;
        }
        
        int idx=0;
        for(int i=0;i<=max;i++){
            while (bucket[i] > 0) {
                arr[idx++]=i;
                bucket[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={90,40,5,15,30,9};
        bucketSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
}