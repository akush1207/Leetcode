import java.util.Scanner;

public class Q3151 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array length:");
        int len=sc.nextInt();
        int[] nums=new int[len];
        System.out.print("Enter array elements:");
        for(int i=0;i<len;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Is Special:"+isSpecial(nums));
    }
    public static boolean isSpecial(int[] nums){
        if(nums.length==1){
            return true;
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]%2==0 && nums[i+1]%2==0){
                return false;
            }
            if(nums[i]%2!=0 && nums[i+1]%2!=0){
                return false;
            }
        }
        return true;
    }
}

