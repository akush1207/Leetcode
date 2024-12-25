import java.util.HashMap;
import java.util.Scanner;

public class Q387 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.next();
        System.out.println("First Unique Character:"+firstUniqueCharacter(str));
    }
    public static int firstUniqueCharacter(String str){
        int[] freq=new int[26];
        for(char ch:str.toCharArray()){
            freq[ch-'a']++;
        }
        for(int i=0;i<str.length();i++){
            if(freq[str.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
}
