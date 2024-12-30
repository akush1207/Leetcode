import java.util.Arrays;
import java.util.Scanner;

public class Q1929 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array length:");
        int len=sc.nextInt();
        int[] nums=new int[len];
        System.out.print("Enter array elements:");
        for(int i=0;i<len;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("nums:"+Arrays.toString(getConcatenation(nums)));
    }
    public static int[] getConcatenation(int[] nums) {
        int len=nums.length;
        int[] ans=new int[len*2];
        for(int i=0;i<len;i++){
            ans[i]=nums[i];
            ans[len+i]=nums[i];
        }
        return  ans;
    }
}
