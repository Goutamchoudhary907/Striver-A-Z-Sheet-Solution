public class LcmAndGcd {
// TC = O(log (min(a,b))) 
    public static int[] lcmAndGcd(int a, int b){
     int gcd=findGcd(a, b);
     int lcm= (a*b)/gcd;
     return new int [] {lcm,gcd};  
    }

    public static int findGcd(int a , int b){
           if(b==0) {
            return a;
        }
           return findGcd(b, a%b);
    }
    public static void main(String[] args) {
        System.out.println(findGcd(20, 15));
    }
}
