public class Pattern10 {
    public static void nStarTraingle(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
             System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>0;i--){
            for(int j=1;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        nStarTraingle(5);
    }
}
