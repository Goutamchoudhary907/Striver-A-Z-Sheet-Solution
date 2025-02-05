// Remove Duplicates in-place from Sorted Array

import java.util.HashSet;

// TC = O(n * log(n) + O(n))     SC=O(n)
public class ReomveDuplicates {
    public static int removeDuplicates(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int k = set.size();
        int j = 0;
        for (int x : set) {
            arr[j++] = x;
        }
        return k;
    }

    // TC =O(n)   SC=O(1)
    public static int removeDuplicates2(int arr[]){
        int i=0;
        for(int j=1;j<arr.length;j++){
         if(arr[i] != arr[j]){
            i++;
            arr[i]=arr[j];
         }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 2, 3, 3 };
        System.out.println(removeDuplicates2(arr));
    }
}
