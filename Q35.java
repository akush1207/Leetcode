import java.util.Scanner;

public class Q35 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array length:");
        int len=sc.nextInt();
        int[] arr=new int[len];
        System.out.print("Enter array elements:");
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the target:");
        int target=sc.nextInt();
        System.out.println("Correct Index of "+target+" is "+searchInsert(target,arr));
    }
    public static int searchInsert(int target,int[] num){
        int low=0,high=num.length-1;
        while (low<=high){
            int mid=(low+high)>>1;
            if(num[mid]==target){
                return mid;
            }else if(num[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return high+1;
    }

}
