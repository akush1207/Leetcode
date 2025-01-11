import java.util.HashMap;
import java.util.Scanner;

public class Q1400 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String s=sc.next();
        System.out.println("Enter k:");
        int k=sc.nextInt();
        System.out.println("Cans Construct:"+canConstruct(s,k));
    }
    public static boolean canConstruct(String s,int k){
        if (s.length() < k) {
            return false;
        }
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        int oddCount = 0;
        for (int count : charCount.values()) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }
        return oddCount <= k;
    }
}
