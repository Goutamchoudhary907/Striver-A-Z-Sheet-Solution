public class Pattern9 {
    public static void nStarDiamond(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k <=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
            for(int i=n;i>=1;i--){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int k=1;k<=2*i-1;k++){
                    System.out.print("*");
                }
                System.out.println();
            }
            
         }
      public static void main(String[] args) {
            nStarDiamond(5);
      }     
}
