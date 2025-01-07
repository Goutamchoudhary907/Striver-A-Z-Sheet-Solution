public class Pattern20 {
    public static void symmetry(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            for (int j = 0; j < 2 * (n - i - 1); j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = n - 1; i > 0; i--) {

            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < 2 * (n - i); j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        symmetry(5);
    }
}
