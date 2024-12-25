import java.util.Scanner;
import java.util.Stack;

public class Q1544 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string:");
        String s=sc.next();
        System.out.println("Great String:"+makeGreat(s));
    }
    public static String makeGreat(String s){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            boolean found=false;
            char ch=s.charAt(i);
            if(!st.isEmpty()){
                if(Character.isUpperCase(ch)){
                    if( Character.toLowerCase(ch)==st.peek()){
                        System.out.println("yes upper");
                        st.pop();
                        found=true;
                    }
                }else if(Character.isLowerCase(ch) ){
                    if( Character.toUpperCase(ch)==st.peek()){
                        System.out.println("yes upper");
                        st.pop();
                        found=true;
                    }
                }
            }
            if(!found){
                st.push(ch);
            }
        }
        System.out.println("st:"+st);
        StringBuilder ans=new StringBuilder();
        while (!st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}
