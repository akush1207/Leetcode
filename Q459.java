import java.util.Scanner;

public class Q459 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string:");
        String str=sc.next();
        System.out.println("Repeated Substring:"+repeatedSubstring(str));
    }
    public static  boolean repeatedSubstring(String str){
        int len=str.length();
        for(int i=0;i<len;i++){
            String substring="",temp=str.substring(0,i+1);
            System.out.println("temp:"+temp);
            for(int j=1;j<=len/(i+1);j++){
                substring+=temp;
                System.out.println("j:"+j);
                System.out.println("substring:"+substring);
                if(substring.length()>len){
                    System.out.println("break substring:"+substring);
                    break;
                }
            }
            if(!temp.equals(str) && substring.equals(str)){
                System.out.println("substring before returning:"+substring);
                return true;
            }
        }
        return false;
    }
}
