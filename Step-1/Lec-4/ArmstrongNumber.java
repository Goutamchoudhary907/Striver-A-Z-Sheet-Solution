public class ArmstrongNumber {
// TC= O(log n)    
    public static boolean armstrongNumber(int n){
        int count=(int) (Math.log10(n) +1);
        int number=n;
        int result=0;
        while (number>0) {
          int digits=number%10;
           result+= Math.pow(digits, count);
           number=number/10;
        }
        return n==result;
    }
    public static void main(String[] args) {
         System.out.println(armstrongNumber(371));
    }
}
