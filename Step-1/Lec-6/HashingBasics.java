import java.util.Scanner;
public class HashingBasics {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=5;
       int arr[]={1,2,3,4,5};

       int hash[]=new int[n+1];
       for(int i=0;i<n;i++){
        hash[arr[i]] +=1;
       }
       int q=5;
       while(q-- !=0){
        int number;
        System.out.println("Enter number to search");
        number=sc.nextInt();
        System.out.println(hash[number]);
       }
       sc.close();
    }
}
