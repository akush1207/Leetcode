import java.util.Scanner;

public class Q2466 {
    public static final int MOD=1000000007;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter low and high:");
        int low=sc.nextInt();
        int high=sc.nextInt();
        System.out.print("Enter zero and one:");
        int zero=sc.nextInt();
        int one=sc.nextInt();
        System.out.println("Number of good strings:"+countGoodStrings(low,high,zero,one));
    }
    public static int countGoodStrings(int low, int high, int zero, int one) {
        int[] dp = new int[high + 1];
        dp[0] = 1;
        for (int length = 1; length <= high; length++) {
            if (length >= zero) {
                dp[length] = (dp[length] + dp[length - zero]) % MOD;
            }
            if (length >= one) {
                dp[length] = (dp[length] + dp[length - one]) % MOD;
            }
        }
        int result = 0;
        for (int length = low; length <= high; length++) {
            result = (result + dp[length]) % MOD;
        }
        return result;
    }
}
