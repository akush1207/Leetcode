import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string:");
        String haystack=sc.next();
        System.out.println("Enter the second string:");
        String needle=sc.next();
        System.out.println("First index of \""+needle+"\" in \""+haystack+"\":"+firstIndex(haystack,needle));
    }
    public static int firstIndex(String haystack,String needle){
        return haystack.indexOf(needle);
    }
}
