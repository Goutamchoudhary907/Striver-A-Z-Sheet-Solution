public class Pattern22 {
    public static void getNumberPattern(int n){
        for(int i=0;i< 2*n-1;i++){
            for(int j=0;j< 2*n-1;j++){
               int top=i;
               int bottom=(2*n-2)-i;
               int left=j;
               int right=(2*n-2)-j;

               int num=n- Math.min(Math.min(top, bottom), Math.min(left, right));
            System.out.print(num);
        }
        System.out.println();
    }
    }
    public static void main(String[] args) {
        getNumberPattern(4);
    }
}
