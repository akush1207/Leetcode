import java.util.Scanner;
public class Q2843 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter low and high:");
        int low=sc.nextInt();
        int high=sc.nextInt();
        Q2843 ob=new Q2843();
        System.out.println("Number of symmetric integer:"+ob.countSymmetricIntegers(low,high));
    }
    public int countSymmetricIntegers(int low, int high) {
        int ans=0;
        while (low<=high){
            String temp=String.valueOf(low);
            if(temp.length()%2==0){
                int sumFirst=0;
                for(int i=0;i<temp.length()/2;i++){
                    sumFirst+=(temp.charAt(i)-'0');
                }
                int sumLast=0;
                for(int i=temp.length()/2;i<temp.length();i++){
                    sumLast+=(temp.charAt(i)-'0');
                }
                if (sumLast==sumFirst){
                    ans++;
                }
            }
            low++;
        }
        return ans;
    }
}
