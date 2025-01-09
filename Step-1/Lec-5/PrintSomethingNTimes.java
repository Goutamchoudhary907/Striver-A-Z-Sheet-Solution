public class PrintSomethingNTimes {
static int count=1;
static void print(){
    if(count ==11) return;
    System.out.print(count+" ");
    count++;
    print();
}
public static void main(String[] args) {
     print();
}
}