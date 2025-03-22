import java.util.ArrayList;
import java.util.TreeSet;

public class UnionOfTwoArrays {
    // TC =O((m+n) log n) log n for each insertion and total (m+n) elements are
    // stored
    public static TreeSet<Integer> union(int arr1[], int arr2[]) {
        TreeSet<Integer> union = new TreeSet<>();

        for (int num : arr1) {
            union.add(num);
        }
        for (int num : arr2) {
            union.add(num);
        }
        return union;
    }

    static ArrayList<Integer> findUnion(int arr1[], int arr2[]) {
        int n = arr1.length;
        int m = arr2.length;

        int i = 0, j = 0;
        ArrayList<Integer> union = new ArrayList<>();
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                if (union.size() == 0 || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                    i++;
                } else {
                    if (union.size() == 0 || union.get(union.size() - 1) != arr2[j]) {
                        union.add(arr2[j]);
                        j++;
                    }
                }
            }
        }
        while (j < m) {
            if (union.get(union.size() - 1) != arr2[j]) {
                union.add(arr2[j]);
                j++;
            }
        }
        return union;
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3 };
        int arr2[] = { 2, 4, 5 };
        TreeSet<Integer> union = union(arr1, arr2);
        System.out.println(union);
    }
}