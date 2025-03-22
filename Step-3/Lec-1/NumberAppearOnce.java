// Find the number that appears once, and the other numbers twice

import java.util.HashMap;
import java.util.Map;

public class NumberAppearOnce {

    public static int findNum(int arr[]){
        int n=arr.length;
        int freq[]=new int[n];
        for(int i=0;i<n;i++){
            freq[arr[i]]++;
        }
        for(int i=0;i<n;i++){
            if(freq[arr[i]] ==1){
                return arr[i];
            }
        }
        return -1;
    }

    public static int getSingleElement(int arr[]){
        int n=arr.length;
        HashMap<Integer,Integer> mp=new HashMap<>();

        for(int i=0;i<n;i++){
            int value=mp.getOrDefault(arr[i],0);
            mp.put(arr[i],value+1);
        }
      for(Map.Entry<Integer, Integer> it:mp.entrySet()){
        if(it.getValue()==1){
            return it.getKey();
        }
      }
     return -1;
    }

    public static int getSingleElement2(int arr[]){
        int n=arr.length;

        int xor=0;
        for(int i=0;i<n;i++){
            xor=xor ^ arr[i];
        }
        return xor;
    }

    public static void main(String[] args) {
        int arr[]={4,4,1,2,1,2,3};
        System.out.println(getSingleElement2(arr));
    }
}
