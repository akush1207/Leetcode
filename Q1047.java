import java.util.Scanner;
import java.util.Stack;

public class Q1047 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.next();
        System.out.println("Remove Duplicates:"+removeDuplicates(str));
    }
    public static String removeDuplicates(String str){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            if(!st.isEmpty() && st.peek()==str.charAt(i)){
                st.pop();
            }else{
                st.push(str.charAt(i));
            }
            System.out.println(st);
        }
        StringBuilder ans=new StringBuilder();
        while (!st.isEmpty()){
            ans.append(st.pop());
        }
        System.out.println("ans:"+ans);
        return ans.reverse().toString();
    }
}
