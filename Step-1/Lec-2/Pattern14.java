public class Pattern14 {
    public static void nLetterTriangle(int n){
        for (int i=1;i<=n;i++) {
            char letter='A';
            for (int j=1;j<=i;j++) {
             System.out.print(letter++);    
            } 
            System.out.println();
        }
    }
    public static void main(String[] args) {
        nLetterTriangle(7);
    }
}