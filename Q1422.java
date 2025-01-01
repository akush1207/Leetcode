import java.util.Scanner;

public class Q1422 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string:");
        String s=sc.next();
        System.out.println("Maximum Score:"+maximumScoreBrute(s));
        System.out.println("Maximum Score:"+maximumScoreOptimum(s));
    }
    public static int maximumScoreBrute(String s){
        int ans=0;
        for(int i=0;i<s.length()-1;i++){
            int zeroCount=0,oneCount=0;
            int left=0,right=i+1;
            while (left<right){
                if(s.charAt(left++)=='0'){
                    zeroCount++;
                }
            }
            while (right<s.length()){
                if(s.charAt(right++)=='1'){
                    oneCount++;
                }
            }
            ans=Math.max(ans,zeroCount+oneCount);
        }
        return ans;
    }
    public static int maximumScoreOptimum(String s){
        int ans=0;
        int totalOnes=0,zeroCount=0,oneCount=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                totalOnes++;
            }
        }
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='0'){
                zeroCount++;
            }else{
                oneCount++;
            }
            int score=zeroCount+(totalOnes-oneCount);
            ans=Math.max(ans,score);
        }
        return ans;
    }
}
