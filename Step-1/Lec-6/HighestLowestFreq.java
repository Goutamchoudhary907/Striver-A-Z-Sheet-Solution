import java.util.HashMap;
import java.util.Map;

public class HighestLowestFreq {
    public static void freq(int arr[],int n){
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
         if(mp.containsKey(arr[i])){
            mp.put(arr[i], mp.get(arr[i]) +1);
         }else{
            mp.put(arr[i],1);
         }
        }
         int mxFreq=0 , minFreq=n;
         int mxEle=0, minEle=0;

         for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
            int count=entry.getValue();
            int element=entry.getKey();

            if(count > mxFreq){
                mxEle=element;
                mxFreq=count;
            }
            if(count < minFreq){
                minEle=element;
                minFreq=count;
            }
         }
         System.out.println("The highest frequency element is: " + mxEle+ " with freq: "+ mxFreq);
         System.out.println("The lowest frequency element is: " + minEle+ " with freq: "+ minFreq);
    }
    public static void main(String[] args) {
        int arr[]={1,2,1,33,4,5,33,33,33};
        int n=arr.length;
        freq(arr, n);
    }
}
