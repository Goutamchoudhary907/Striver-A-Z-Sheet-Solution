public class IfElseStatemenets {
    public static String compareNM(int n , int m){
        if(n<m){
            return "lesser";
        }else if(n==m){
            return "equal";
        }else{
            return "greater";
        }
    }
    public static void main(String[] args) {
       int n=8;
       int m=4;
       System.out.println(compareNM(n, m)); 
    }
}
