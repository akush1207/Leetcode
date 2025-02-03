import java.util.Scanner;

public class Q3105 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array length:");
        int len=sc.nextInt();
        int[] nums=new int[len];
        System.out.print("Enter array elements:");
        for(int i=0;i<len;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Longest Monotonic Subarray:"+longestMonotonicSubarrayBrute(nums));
        System.out.println("Longest Monotonic Subarray:"+longestMonotonicSubarrayOptimized(nums));
    }
    public static int longestMonotonicSubarrayBrute(int[] nums) {
        return Math.max(increasing(nums),decreasing(nums));
    }
    public static int increasing(int[] nums){
        int maxLength=1,currLength=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                currLength++;
            }else{
                maxLength=Math.max(maxLength,currLength);
                currLength=1;
            }
        }
        maxLength=Math.max(maxLength,currLength);
        System.out.println("maxLength inc:"+maxLength);
        return maxLength;
    }
    public static int decreasing(int[] nums){
        int maxLength=1,currLength=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                currLength++;
            }else{
                maxLength=Math.max(maxLength,currLength);
                currLength=1;
            }
        }
        maxLength=Math.max(maxLength,currLength);
        System.out.println("maxLength dec:"+maxLength);
        return maxLength;
    }
    public static int longestMonotonicSubarrayOptimized(int[] nums){
        int incLength=1,decLength=1,maxLength=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                decLength++;
                incLength=1;
            }else if(nums[i]<nums[i+1]){
                incLength++;
                decLength=1;
            }else{
                decLength=incLength=1;
            }
            maxLength=Math.max(maxLength,Math.max(incLength,decLength));
        }
        return maxLength;
    }
}
