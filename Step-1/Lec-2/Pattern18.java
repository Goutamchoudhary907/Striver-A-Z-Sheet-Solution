public class Pattern18 {

    // Link is given for this pattern
    public static void alphaTriangle(int n){
        int s =65 + (n-1);
        char letter= (char) s;
        for(int i=1;i<=n;i++){
         for(int j=1;j<=i;j++){
            System.out.print(letter+" ");
            letter--;
         }
         letter= (char) s;
         System.out.println();
        }
    }

    // pattern present in sheet 
    public static void reverseAlphaTraingle(int n){
        for(int i=1;i<=n;i++){
            int s =65 + (n-i);
            char ch=(char) s;
            for(int j=1;j<=i;j++){
            System.out.print(ch+" ");
            ch++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // alphaTriangle(5);
        reverseAlphaTraingle(5);
    }
}
