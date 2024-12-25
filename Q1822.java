import java.util.Scanner;

public class Q1822 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length:");
        int len=sc.nextInt();
        int[] nums=new int[len];
        System.out.println("Enter array elements:");
        for(int i=0;i<len;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Sign:"+sign(nums));
    }
    public static int sign(int[] nums){
        int negCount=0;
        for(int num:nums){
            if(num<0){
                negCount++;
            }else if(num==0){
                return 0;
            }
        }
        if(negCount%2==0){
            return 1;
        }
        return -1;
    }
}
