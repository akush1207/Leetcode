import java.util.HashSet;
import java.util.Scanner;
public class Q219 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array length:");
        int len=sc.nextInt();
        int[] arr=new int[len];
        System.out.print("Enter array element:");
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter k:");
        int k=sc.nextInt();
        System.out.println("Contains Duplicate:"+containsDuplicate(arr,len,k));
    }
    public static boolean containsDuplicate(int[] arr,int len,int k){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<len;i++){
            if(set.contains(arr[i])){
                return true;
            }
            set.add(arr[i]);
            if(set.size()>k){
                set.remove(arr[i-k]);
            }
        }
        return false;
    }    
}
