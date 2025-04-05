import java.util.Scanner;

public class Q1863 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array length:");
        int len=sc.nextInt();
        int[] nums=new int[len];
        System.out.print("Enter array elements:");
        for(int i=0;i<len;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Subset XOR Sum:"+subsetXORSum(nums));
    }
    public static int subsetXORSum(int[] nums) {
        int sum=0;
        int len=nums.length;
        int noOfSubset=1<<len;
        for(int i=0;i<noOfSubset;i++){
            int xor=0;
            for(int j=0;j<len;j++){
                if((i&(1<<j))!=0){
                    xor^=nums[j];
                }
            }
            sum+=xor;
        }
        return sum;
    }
}
