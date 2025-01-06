public class Pattern19 {
    public static void symmetry(int n){
        for(int i=0;i<n;i++){

            for(int j=0;j< n-i;j++){
              System.out.print("* ");  
            }
            for(int k=1;k<=2*i;k++){
                System.out.print(" ");
            }
   
             for(int k=1;k<=n-i;k++){
                System.out.print("* ");
            }
                System.out.println();
                } 
   
               for(int i=0;i<n;i++){
           
            for(int j=0;j<=i;j++){
              System.out.print("* ");  
            }
            for(int k=1;k<=2*(n-i-1);k++){
                System.out.print(" ");
            }
   
             for(int k=0;k<=i;k++){
                System.out.print("* ");
            }
                System.out.println();
                }
          
    }
    public static void main(String[] args) {
        symmetry(3);
    }
}
