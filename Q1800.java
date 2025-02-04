import java.util.Scanner;

public class Q1800 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array length:");
        int len=sc.nextInt();
        int[] nums=new int[len];
        System.out.print("Enter array elements:");
        for(int i=0;i<len;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Max Ascending Sum:"+maxAscendingSum(nums));
    }
    public static int maxAscendingSum(int[] nums) {
        int maxSum = 0;
        for (int startIdx = 0; startIdx < nums.length; startIdx++) {
            int currentSubarraySum = nums[startIdx];
            for (
                    int endIdx = startIdx + 1;
                    endIdx < nums.length && nums[endIdx] > nums[endIdx - 1];
                    endIdx++
            ) {
                currentSubarraySum += nums[endIdx];
            }
            maxSum = Math.max(maxSum, currentSubarraySum);
        }

        return maxSum;
    }
}
