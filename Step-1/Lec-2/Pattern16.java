public class Pattern16 {
    public static void alpharamp(int n){
        char letter='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
            System.out.print(letter +" ");
            }
            letter++;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        alpharamp(4);
    }
}
