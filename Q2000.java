import java.util.Scanner;

public class Q2000 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word:");
        String word=sc.next();
        System.out.println("Enter the character:");
        char ch=sc.next().charAt(0);
        System.out.println("Reverse Prefix:"+reversePrefix(word,ch));
    }
    public static String reversePrefix(String word,char ch){
        int index=word.indexOf(ch);
        if(index==-1){
            return word;
        }
        StringBuilder substr=new StringBuilder(word.substring(0,index+1));
        substr.reverse();
        return substr+word.substring(index+1);
    }
}
