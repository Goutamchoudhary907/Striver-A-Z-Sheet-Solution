public class Pattern15 {
    public static void nLetterTriangle(int n){
        for (int i=n;i>=1;i--) {
            char letter='A';
            for (int j=1;j<=i;j++) {
             System.out.print(letter++ +" ");    
            } 
            System.out.println();
        }
    }
   public static void main(String[] args) {
    nLetterTriangle(7);
   }
}
