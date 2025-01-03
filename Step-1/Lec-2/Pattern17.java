public class Pattern17 {
    public static void alphahill(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            char letter='A';
            int mid= (2*i+1)/2;
            for(int k=0;k<2*i+1;k++){
                System.out.print(letter+" ");
             if(k < mid){
                letter++;
             }else{
                letter--;
             }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        alphahill(3);
    }
}
