public class IsPalindrome {
    public static String isPalindrome(String s){
        s=s.toLowerCase().replaceAll("[A-Za-z0-9]", "");

        int left=0, right=s.length()-1;
        while (left <right) {
         if(s.charAt(left) != s.charAt(right)){
            return "Not Palindrome";
         }
         left++;
         right--;   
        }
        return "Palindrome";
    }

    public static boolean palindrome(String s, int i){
        if(i > s.length()/2) return true;
        if(s.charAt(i) != s.charAt(s.length() -i-1)){
          return false;
        }
        return palindrome(s, i+1);
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("ABCDCBA"));
    }
}
