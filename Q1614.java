import java.util.Scanner;

public class Q1614 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string:");
        String s=sc.next();
        System.out.println("Max Depth:"+maxDepth(s));
    }
    public static int maxDepth(String s){
        int ans=0,currMaxDepth=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                currMaxDepth++;
                ans=Math.max(ans,currMaxDepth);
            }else if(ch==')'){
                currMaxDepth--;
            }
        }
        return ans;
    }
}
