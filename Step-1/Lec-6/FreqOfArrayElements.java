import java.util.HashMap;
import java.util.Map;

public class FreqOfArrayElements {
 
// TC =O(n * n)    SC= O(n)    
public static void countFreq(int arr[], int n){
    boolean visited[] = new boolean[n];
    for (int i = 0; i < n; i++) {
        if (visited[i] == true)
            continue;
 
        int count = 1;
        for (int j = i + 1; j < n; j++) {
            if (arr[i] == arr[j]) {
                visited[j] = true;
                count++;
            }
        }
        System.out.println(arr[i] + " " + count);
    }
}

// TC =O(n)   SC = O(n)
 public static void freq(int arr[], int n){
    Map<Integer,Integer> mp=new HashMap<>();
    for(int i=0;i<n;i++){
        if(mp.containsKey(arr[i])){
            mp.put(arr[i],mp.get(arr[i]) +1);
        }else{
            mp.put(arr[i],1);
        }
    }
    for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
      System.out.println(entry.getKey()  + " " + entry.getValue());
    }
 }
 public static void main(String args[]){  
   
      int arr[] ={10,5,10,15,10,5};
      int n = arr.length;
      freq(arr, n);  
  }
}