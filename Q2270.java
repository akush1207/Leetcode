import java.util.Scanner;

public class Q2270 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array length:");
        int len=sc.nextInt();
        int[] nums=new int[len];
        System.out.print("Enter array elements:");
        for(int i=0;i<len;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Ways to split array:"+waysToSplitArray(nums));
    }
    public static int waysToSplitArray(int[] nums) {
        int ans=0;
        long totalSum=0;
        for(int num:nums){
            totalSum+=num;
        }
        long currSum=0;
        for(int i=0;i<nums.length-1;i++){
            currSum+=nums[i];
            if(currSum>=(totalSum-currSum)){
                ans++;
            }
        }
        return ans;
    }
}
