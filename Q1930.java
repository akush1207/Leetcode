import java.util.HashSet;
import java.util.Scanner;

public class Q1930 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string:");
        String s=sc.next();
        System.out.println("Number of palindromic sequence:"+countPalindromicSubsequenceBrute(s));
        System.out.println("Number of palindromic sequence:"+countPalindromicSubsequenceOptimum(s));
    }
    public static int countPalindromicSubsequenceBrute(String s) {
        HashSet<String> palindrome=new HashSet<>();
        int n=s.length();
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(s.charAt(i)==s.charAt(k)){
                        String temp=""+s.charAt(i)+s.charAt(j)+s.charAt(k);
                        palindrome.add(temp);
                    }
                }
            }
        }
        System.out.println("Palindrome:"+palindrome);
        return palindrome.size();
    }
    public static int countPalindromicSubsequenceOptimum(String s){
        int n=s.length();
        HashSet<Character> uniqueCharacter=new HashSet<>();
        for(char ch:s.toCharArray()){
            uniqueCharacter.add(ch);
        }
        int ans=0;
        for(char ch:uniqueCharacter){
            int firstIndex=-1,lastIndex=0;
            for(int i=0;i<n;i++){
                if(s.charAt(i)==ch){
                    if(firstIndex==-1){
                        firstIndex=i;
                    }
                    lastIndex=i;
                }
            }
            HashSet<Character> uniqueCharacterBetween=new HashSet<>();
            for(int j=firstIndex+1;j<lastIndex;j++){
                uniqueCharacterBetween.add(s.charAt(j));
            }
            ans+=uniqueCharacterBetween.size();
        }
        return ans;
    }
}
