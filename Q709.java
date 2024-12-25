import java.util.Scanner;

public class Q709 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string:");
        String s=sc.next();
        System.out.println("To Lower Case:"+toLowerCase(s));
    }
    public static String toLowerCase(String s){
        return s.toLowerCase();
    }
}
