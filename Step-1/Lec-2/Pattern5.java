public class Pattern5 {
    public static void seeding(int n){
        for(int i=5;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        seeding(5);
    }
}
