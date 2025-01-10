import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class Q916 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st array length:");
        int len1=sc.nextInt();
        System.out.println("Enter the 1st array elements:");
        String[] words1=new String[len1];
        for(int i=0;i<len1;i++){
            words1[i]=sc.next();
        }
        System.out.println("Enter the 2nd array length:");
        int len2=sc.nextInt();
        System.out.println("Enter the 2nd array elements:");
        String[] words2=new String[len2];
        for(int i=0;i<len2;i++){
            words2[i]=sc.next();
        }
        System.out.println("Word subset:"+wordSubsets(words1,words2));
    }
    public static List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> result = new ArrayList<>();
        int[] maxFreq = getMaxFrequency(words2);

        for (String word : words1) {
            if (isUniversal(word, maxFreq)) {
                result.add(word);
            }
        }

        return result;
    }
    private static boolean isUniversal(String word, int[] maxFreq) {
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] < maxFreq[i]) {
                return false;
            }
        }
        return true;
    }
    private static int[] getMaxFrequency(String[] words2) {
        int[] maxFreq = new int[26];

        for (String word : words2) {
            int[] freq = new int[26];
            for (char c : word.toCharArray()) {
                freq[c - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                maxFreq[i] = Math.max(maxFreq[i], freq[i]);
            }
        }
        return maxFreq;
    }
}
