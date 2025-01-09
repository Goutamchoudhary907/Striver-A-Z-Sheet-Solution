public class Checkprime {
    public static boolean prime(int n){
// TC =O(n)        
        int count=0;
      for(int i=1;i<=n;i++){
       if(n%i==0){
        count++;
       }
      }
      if(count==2)return true;
      return false;
    }

    public static boolean prime2(int n){
// TC =O(sqrt(n))        
       int sqrt=(int) Math.sqrt(n);
       int count=0;
       for(int i=1;i<=sqrt;i++){
        if(n%i==0){
            count++;
            if(i != n/i){
                count++;
            }
        }
       }
       if(count==2)return true;
      return false;
    }
    public static void main(String[] args) {
        System.out.println(prime2(10));
    }
}
