import java.util.Scanner;

public class Q389 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string:");
        String s=sc.next();
        System.out.println("Enter the second string:");
        String t=sc.next();
        System.out.println("Find the difference:"+findTheDifference(s,t));

    }
    public static char findTheDifference(String s,String t){
        char[] freq1=new char[26];
        char[] freq2=new char[26];
        for(char ch:s.toCharArray()){
            freq1[ch-'a']++;
        }
        for(char ch:t.toCharArray()){
            freq2[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq1[i]!=freq2[i]){
                return (char)(97+i);
            }
        }
        return ' ';
    }
}
