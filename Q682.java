import java.util.Scanner;
import java.util.Stack;

public class Q682 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of operations:");
        int len=sc.nextInt();
        String[] operations=new String[len];
        System.out.println("Enter the operations:");
        for(int i=0;i<len;i++){
            operations[i]=sc.next();
        }
        System.out.println("Points:"+callPoints(operations));
    }
    public static int callPoints(String[] operations){
        Stack<Integer> st=new Stack<>();
        for(String op:operations){
            if(op.equals("+")){
                int op1= st.pop();
                int op2= st.pop();
                st.push(op2);
                st.push(op1);
                st.push(op1+op2);
            }else if(op.equals("D")){
                st.push(st.peek()*2);
            }else if(op.equals("C")){
                st.pop();
            }else{
                st.push(Integer.parseInt(op));
            }
        }
        int ans=0;
        while (!st.isEmpty()){
            ans+=st.pop();
        }
        return ans;
    }
}
