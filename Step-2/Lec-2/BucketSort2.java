import java.util.ArrayList;
import java.util.Collections;

public class BucketSort2 {
// for float numbers ranging from 0 to <1

static void bucketSort(float arr[]){
    int n=arr.length;
    @SuppressWarnings("unchecked")
    ArrayList<Float> [] buckets  =new ArrayList[n];

    for(int i=0;i<n;i++){
        buckets[i]=new ArrayList<Float>();
    }

    for(int i=0;i<n;i++){
        int bucketIdx=(int) arr[i] *n;
        buckets[bucketIdx].add(arr[i]);
    }

    for(int i=0;i<buckets.length;i++){
        Collections.sort(buckets[i]);
    }
    int idx=0;
    for(int i=0;i<buckets.length;i++){
        ArrayList<Float> currBucket=buckets[i];
        for(int j=0;j<currBucket.size();j++){
            arr[idx++]=currBucket.get(j);
        }
    }
}
    public static void main(String[] args) {
        float arr[]={0.5f,0.4f,0.3f,0.2f,0.1f,0.8f};
        bucketSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
}