import java.util.Scanner;

public class Q2874 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array length:");
        int len=sc.nextInt();
        int[] nums=new int[len];
        System.out.print("Enter array elements:");
        for(int i=0;i<len;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Maximum Triplet Value:"+maximumTripletValue(nums));
    }
    public static long maximumTripletValue(int[] nums){
        long maxValue=0;
        int maxDiff=Integer.MIN_VALUE;
        int maxPrefix=nums[0];
        for(int i=1;i<nums.length-1;i++){
            maxDiff=Math.max(maxDiff,maxPrefix-nums[i]);
            maxValue=Math.max(maxValue,((long) maxDiff *nums[i+1]));
            maxPrefix=Math.max(maxPrefix,nums[i]);
        }
        return maxValue;
    }
}
