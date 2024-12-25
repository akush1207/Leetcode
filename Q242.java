import java.util.Scanner;

public class Q242 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first string:");
        String s=sc.next();
        System.out.print("Enter the second string:");
        String t=sc.next();
        System.out.println("Is Anagram:"+isAnagram(s,t));
    }
    public static boolean isAnagram(String s,String t){
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        for(char ch:s.toCharArray()){
            freq1[ch-97]++;
        }
        for(char ch:t.toCharArray()){
            freq2[ch-97]++;
        }
        for(char ch:t.toCharArray()){
            if(freq1[ch-97]!=freq2[ch-97]){
                return false;
            }
        }
        return true;
    }
}
