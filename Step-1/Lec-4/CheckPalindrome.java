public class CheckPalindrome {
    public static boolean isPalindrome(int x){
        // if number ends with 0 
        if( x<0 || (x!=0 && x % 10 ==0)){
            return false;
        }  
        int number=x;
        int reverse=0;
        while(number >reverse){
            int temp=number%10;
             number=number/10;
             reverse=reverse *10 +temp;
    }
    return number==reverse || number==reverse/10;
}

public static void main(String[] args) {
    System.out.println(isPalindrome(121));
}
}