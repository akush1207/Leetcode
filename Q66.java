import java.util.Arrays;
import java.util.Scanner;

public class Q66 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array length:");
        int len=sc.nextInt();
        int[] arr=new int[len];
        System.out.print("Enter array elements:");
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("arr:"+ Arrays.toString(plusOne(arr)));
    }
    public static int[] plusOne(int[] arr){
        int len=arr.length;
        for(int i=len-1;i>=0;i--){
            ++arr[i];
            arr[i]%=10;
            if(arr[i]!=0){
                return arr;
            }
        }
        arr=new int[len+1];
        arr[0]=1;
        return arr;
    }
}
