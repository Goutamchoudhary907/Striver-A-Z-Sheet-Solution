import java.util.Scanner;

public class CharHashing {
    public static void main(String[] args) {
        String s="hashing";
        Scanner sc=new Scanner(System.in);
       
      int []hash=new int[26];
      for(int i=0;i<s.length();i++){
        hash[s.charAt(i) -'a']++;
      }
      int q=5;
      while(q-- >0){
        System.out.println("Enter char to search:");
        char c=sc.next().charAt(0);
        System.out.println(hash[c-'a']);
      }  
      sc.close();
    }
}
