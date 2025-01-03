import java.util.Scanner;

public class ForLoops {
  public static int fibonacci(int n){
    if(n==1 || n==2){
        return 1;
    }
    int a=1;
    int b=1;
    int fib=1;
    for(int i=3;i<=n;i++){
      fib=a+b;
      a=b;
      b=fib;
    }
    return fib;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of n: ");
    int n=sc.nextInt();
    System.out.println("The "+n+ "th fib number is: "+fibonacci(n));
    sc.close();
  }    
}
