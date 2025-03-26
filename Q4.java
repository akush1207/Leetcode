import java.util.Scanner;
import java.util.ArrayList;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st array length:");
        int len1=sc.nextInt();
        int[] nums1=new int[len1];
        System.out.print("Enter the 1st array elements:");
        for(int i=0;i<len1;i++){
            nums1[i]=sc.nextInt();
        }
        System.out.print("Enter 2nd array length:");
        int len2=sc.nextInt();
        int[] nums2=new int[len2];
        System.out.print("Enter the 1st array elements:");
        for(int i=0;i<len2;i++){
            nums2[i]=sc.nextInt();
        }
        System.out.println("Median of sorted array:"+medianOfSortedArray(nums1,nums2));
    }
    public static double medianOfSortedArray(int[] nums1,int[] nums2){
        ArrayList<Integer> temp=new ArrayList<>();
        int i=0,j=0;
        while (i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                temp.add(nums1[i]);
                i++;
            }else{
                temp.add(nums2[j]);
                j++;
            }
        }
        while (i<nums1.length){
            temp.add(nums1[i++]);
        }
        while (j<nums2.length){
            temp.add(nums2[j++]);
        }
        if(temp.size()%2!=0){
            return temp.get(temp.size()/2);
        }
        int mid=temp.size()/2;
        return (double)(temp.get(mid)+temp.get(mid-1))/2;
    }
}
