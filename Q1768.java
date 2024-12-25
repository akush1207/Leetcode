import java.util.Scanner;

public class Q1768 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first string:");
        String word1=sc.next();
        System.out.print("Enter the second string:");
        String word2=sc.next();
        System.out.println("Merge Alternately:"+mergeAlternately(word1,word2));
    }
    public static String mergeAlternately(String word1,String word2){
        StringBuilder ans=new StringBuilder();
        int len=Math.min(word1.length(),word2.length());
        int i=0;
        while (i<len){
            ans.append(word1.charAt(i)).append(word2.charAt(i));
            i++;
        }
        if(len==word1.length()){
            ans.append(word2.substring(i));
        }else{
            ans.append(word1.substring(i));
        }
        return ans.toString();
    }
}
