import java.util.Scanner;

public class Q896 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array length:");
        int len=sc.nextInt();
        int[] nums=new int[len];
        System.out.print("Enter array elements:");
        for(int i=0;i<len;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Is monotonic:"+isMonotonic(nums));
    }
    public static boolean isMonotonic(int[] nums){
        if(nums.length<=2){
            return true;
        }
        boolean isIncreasing=false,isDecreasing=false;
        int i=0;
        while (i<nums.length-1 && nums[i]<=nums[i+1]){
            if(nums[i]<nums[i+1]){
                isIncreasing=true;
                break;
            }
            i++;
        }
        i=0;
        while (i<nums.length-1 && nums[i]>=nums[i+1]){
            if(nums[i]>nums[i+1]){
                isDecreasing=true;
                break;
            }
            i++;
        }
        if(isIncreasing){
            for(i=0;i<nums.length-1;i++){
                if(nums[i]>nums[i+1]){
                    return false;
                }
            }
        }
        if(isDecreasing){
            for(i=0;i<nums.length-1;i++){
                if(nums[i]<nums[i+1]){
                    return false;
                }
            }
        }
        return true;
    }
}
