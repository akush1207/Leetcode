import java.util.Scanner;

public class Q2185 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of words:");
        int n=sc.nextInt();
        String[] words=new String[n];
        System.out.println("Enter the words:");
        for(int i=0;i<n;i++){
            words[i]=sc.next();
        }
        System.out.println("Enter the prefix:");
        String prefix=sc.next();
        System.out.println("Count Prefix:"+countPrefix(words,prefix));
    }
    public static int countPrefix(String[] words,String prefix){
        int ans=0;
        for (String word : words) {
            if (word.startsWith(prefix)) {
                ans++;
            }
        }
        return ans;
    }
}
