public class Functions {
    static int[] passedBy(int a, int b) {
      a=a+1;
      b=b+2;
      return new int []{a,b};
    }
    public static void main(String[] args) {
        int arr[]=passedBy(10,20);
        System.out.println(arr[0]+" "+arr[1]);
    }
}
