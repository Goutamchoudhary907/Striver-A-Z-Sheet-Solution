public class SumOfNNaturalNos {
   static int sum=0;
    public static int sum(int n){
    if(n<1) return sum;
    sum+=n;
    n--;
    return sum(n);
    }

    public static int sum2(int n){
        if(n==0) return 0;
        return n+sum2(n-1);
    }

    public static int sum3(int n){
        int sum= n * (n+1)/2;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum3(6));
    }
}
