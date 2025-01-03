public class Pattern8 {
  public static void nStarTriangle(int n){
    for(int i=n;i>0;i--){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int k=1;k <=2*i-1;k++){
            System.out.print("*");
        }
        System.out.println();
    }
  }      
  public static void main(String[] args) {
        nStarTriangle(5);
  }
}
