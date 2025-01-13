import java.util.Scanner;


public class Q3223 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String s=sc.next();
        System.out.println("Minimum Length:"+minimumLength(s));
    }
    public static int minimumLength(String s){
        int[] charFrequency = new int[26];
        int totalLength = 0;
        for (char currentChar : s.toCharArray()) {
            charFrequency[currentChar - 'a']++;
        }
        for (int frequency : charFrequency) {
            if (frequency == 0) continue;
            if (frequency % 2 == 0) {
                totalLength += 2;
            } else {
                totalLength += 1;
            }
        }
        return totalLength;
    }
}
