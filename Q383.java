import java.util.Scanner;

public class Q383 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter ransomNote and magazine:");
        String ransomNote=sc.next();
        String magazine=sc.next();
        System.out.println("Can Construct:"+canConstruct(ransomNote,magazine));
    }
    public static boolean canConstruct(String ransomNote,String magazine){
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        for(char ch:ransomNote.toCharArray()){
            freq1[ch-97]++;
        }
        for(char ch:magazine.toCharArray()){
            freq2[ch-97]++;
        }
        for(char ch:ransomNote.toCharArray()){
            if(freq2[ch-97]<freq1[ch-97]){
                return false;
            }
        }
        return true;
    }
}
