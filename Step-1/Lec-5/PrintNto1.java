public class PrintNto1 {
    public static void printNos(int n){
     if(n <1) return;   
    System.out.print(n+" ");
    n--;
    printNos(n);
    }
    public static void main(String[] args) {
        printNos(10);
    }
}
