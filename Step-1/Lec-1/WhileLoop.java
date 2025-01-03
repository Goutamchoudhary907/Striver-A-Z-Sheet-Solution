import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
        int i=10;
        while(i>0){
            System.out.print(i *n +" ");
            i--;
        }
        sc.close();
    }
}
