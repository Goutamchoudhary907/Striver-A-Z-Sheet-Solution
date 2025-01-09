public class PrintNameNTimes {
 public static void print(int n){
 if(n==0) return;
 System.out.print("Raj ");
 n--;
  print(n);
 }    
 public static void main(String[] args) {
    print(5);
 }
}
