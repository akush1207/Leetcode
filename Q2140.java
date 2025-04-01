import java.util.Scanner;

public class Q2140 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of questions:");
        int len=sc.nextInt();
        int[][] questions=new int[len][2];
        System.out.print("Enter points and brainpower of each questions:");
        for(int i=0;i<len;i++){
            questions[i][0]=sc.nextInt();
            questions[i][1]=sc.nextInt();
        }
        System.out.println("Max Points:"+mostPoints(questions));
    }
    public static long mostPoints(int[][] questions) {
        int n=questions.length;
        long[] dp=new long[n+1];
        for(int i=n-1;i>=0;i--){
            long skipPoints=dp[i+1];
            long solvePoints=questions[i][0];
            int nextIndex=i+questions[i][1]+1;
            if(nextIndex<n){
                solvePoints+=dp[nextIndex];
            }
            dp[i]=Math.max(solvePoints,skipPoints);
        }
        return dp[0];
    }
}
