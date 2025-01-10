public class PrintFibSeries {
// TC = 2*O(n)
// SC =O(n) 
    public static void fib(int n){
        if(n==0) {
            System.out.print(0);
            return;
        }
       int fib[]=new int[n+1];
       fib[0]=0;
       fib[1]=1;
       for(int i=2;i<=n;i++){
        fib[i]=fib[i-2] + fib[i-1];
       }
       for(int i=0;i<fib.length;i++){
        System.out.print(fib[i] +" ");
       }
    }
// TC =O(n)   SC=O(1)
    public static void fib2(int n){
        if(n==0){
            System.out.print(0);
            return;
        }
        int secondLast=0;
        int last=1;

        System.out.print(secondLast +" "+last+" ");
        int curr;
        for(int i=2;i<=n;i++){
            curr=last+secondLast;
            secondLast=last;
            last=curr;
            System.out.print(curr+" ");
        }
    }

// TC =O(2^n)    SC =O(n)    
    public static int fib3(int n){
        if(n <=1) return n;

        int last= fib3(n-1);
        int secondLast=fib3(n-2);
        return last+secondLast;

    }
    public static void main(String[] args) {
        // fib2(6);
        int n=6;
        for (int i = 0; i <= n; i++) {
            System.out.print(fib3(i) + " ");
        }
     }
}
