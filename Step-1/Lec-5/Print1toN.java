public class Print1toN {
   static int i=1; 
public static void print(int n){
    if(i>n) return;
    System.out.print(i+" ");
    i++;
    print(n);
}    
public static void main(String[] args) {
    print(5);
}
}
