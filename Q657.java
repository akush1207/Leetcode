import java.util.Scanner;

public class Q657 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the moves:");
        String moves=sc.next();
        System.out.println("Judge Circle:"+judgeCircle(moves));
    }
    public static boolean judgeCircle(String moves){
        int U=0,D=0,L=0,R=0;
        for(int i=0;i<moves.length();i++){
            char ch=moves.charAt(i);
            if(ch=='U'){
                U++;
            }else if(ch=='D'){
                D++;
            }else if(ch=='L'){
                L++;
            }else if(ch=='R'){
                R++;
            }
        }
        return L==R && U==D;
    }
}
