import java.util.TreeSet;

public class UnionOfTwoArrays {
    public static TreeSet<Integer> union(int arr1[], int arr2[]){    
    TreeSet<Integer> union=new TreeSet<>();

     for(int num:arr1){
        union.add(num);
     }
     for(int num:arr2){
        union.add(num);
     }
     return union;
    }
    public static void main(String[] args) {
        int arr1[]={1,2,3};
        int arr2[]={2,4,5};
        TreeSet<Integer> union=union(arr1, arr2);
        System.out.println(union);
    }
}