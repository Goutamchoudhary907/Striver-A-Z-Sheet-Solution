// Find the number of digits of ‘n’ that evenly divide ‘n’.

public class CountDigits {
    public static int countDigits(int n){
    int count=0;
    int number=Math.abs(n);
     while (number>0) {
      int digit=number %10;
      if(digit !=0 && n % digit==0){
        count++;
      }
      number=number/10;  
     }
    return count; 
    }
  //  int count=(int) (Math.log10(n) +1);      This is used to count digits in a number 
   

    public static void main(String[] args) {
        // System.out.println(countDigits(336));
        System.out.println(countDigits(336));
    }
}
