import java.util.Arrays;
import java.util.Scanner;

public class Q2559 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. of words:");
        int n=sc.nextInt();
        String[] words=new String[n];
        System.out.print("Enter the words:");
        for(int i=0;i<n;i++){
            words[i]=sc.next();
        }
        System.out.print("Enter the no. of queries:");
        int m=sc.nextInt();
        int[][] queries=new int[m][2];
        System.out.print("Enter the queries:");
        for(int i=0;i<m;i++){
            queries[i][0]=sc.nextInt();
            queries[i][1]=sc.nextInt();
        }
        System.out.println("queries:"+Arrays.deepToString(queries));
        System.out.println("Vowel Strings:"+ Arrays.toString(vowelStrings(words,queries)));
    }
    public static int[] vowelStrings(String[] words, int[][] queries) {
        int n=words.length;
        int[] prefixCount=new int[n+1];
        for(int i=0;i<n;i++){
            if(startsWithVowel(words[i]) && endsWithVowel(words[i])){
                prefixCount[i+1]=prefixCount[i]+1;
            }else{
                prefixCount[i+1]=prefixCount[i];
            }
        }
        int m=queries.length;
        int[] ans=new int[m];
        for(int i=0;i<m;i++){
            int leftInd=queries[i][0];
            int rightInd=queries[i][1];
            ans[i]=prefixCount[rightInd+1]-prefixCount[leftInd];
        }
        return ans;
    }
    public static boolean startsWithVowel(String word){
        char ch=word.charAt(0);
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
    public static boolean endsWithVowel(String word){
        char ch=word.charAt(word.length()-1);
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
}
