import java.util.Arrays;
import java.util.Scanner;

public class Q283 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array length:");
        int len=sc.nextInt();
        int[] arr=new int[len];
        System.out.print("Enter array elements");
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        moveZeros(arr);
        System.out.println("Move Zeros:"+Arrays.toString(arr));
    }
    public static void moveZeros(int[] arr){
        int index=-1;
        for(int a:arr){
            if(a!=0){
                arr[++index]=a;
            }
        }
        Arrays.fill(arr,index+1,arr.length,0);
    }
}
