public class ReverseANumber {
    public static int reverse(int x){
       boolean isNegative=x<0;
       x=Math.abs(x);
       int reverse=0;
          while(x >0){
           int temp=x%10;
            x=x/10;
            if(reverse > (Integer.MAX_VALUE -temp) /10){
                return 0;
            }
            reverse=reverse *10 +temp;
        } 
        return isNegative ? -reverse:reverse;
    }
    public static void main(String[] args) {
        System.out.println(reverse(1410));
    }
}
