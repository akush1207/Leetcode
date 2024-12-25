import java.util.HashSet;
import java.util.Scanner;
public class Q3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string:");
        String s=sc.nextLine();
        System.out.println("Length of longest substring:"+lengthOfLongestSubstring(s));
        sc.close();
    }
    public static int lengthOfLongestSubstring(String s){
        int maxLength=0;
        int i=0,j=0;
        HashSet<Character> set=new HashSet<>();
        while(j<s.length()){
            char currChar=s.charAt(j);
            while(set.contains(currChar)){
                set.remove(s.charAt(i));
                i++;
            }
            set.add(currChar);
            maxLength=Math.max(maxLength, j-i+1);
            System.out.println("set:"+set+"\tmaxLength:"+maxLength);
            j++;
        }
        return maxLength;
    }
}