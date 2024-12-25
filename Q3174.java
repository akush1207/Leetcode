import java.util.Scanner;
import java.util.Stack;

public class Q3174 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string:");
        String s=sc.next();
        System.out.println("Clear Digits:"+clearDigits(s));
    }
    public static String clearDigits(String s){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!st.isEmpty() && Character.isDigit(ch)){
                st.pop();
            }else{
                st.push(ch);
            }
        }
        StringBuilder ans=new StringBuilder();
        while (!st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}
