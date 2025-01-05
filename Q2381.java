import java.util.Scanner;

public class Q2381 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string:");
        String s=sc.next();
        System.out.print("Enter the no. of queries:");
        int n=sc.nextInt();
        int[][] shifts=new int[n][3];
        System.out.print("Enter the shifts:");
        for(int i=0;i<n;i++){
            shifts[i][0]=sc.nextInt();
            shifts[i][1]=sc.nextInt();
            shifts[i][2]=sc.nextInt();
        }
        System.out.println("Shifting letters:"+shiftingLettersBrute(s,shifts));
        System.out.println("Shifting letters:"+shiftingLettersOptimum(s,shifts));
    }
    public static String shiftingLettersBrute(String s, int[][] shifts) {
        StringBuilder ans=new StringBuilder(s);
        for(int[] shift:shifts){
            for(int i=shift[0];i<=shift[1];i++){
                char ch=ans.charAt(i);
                if(shift[2]==1){
                    if(ch=='z'){
                        ans.setCharAt(i,'a');
                    }else{
                        ans.setCharAt(i, (char) (ch+1));
                    }
                }else{
                    if(ch=='a'){
                        ans.setCharAt(i,'z');
                    }else{
                        ans.setCharAt(i, (char) (ch-1));
                    }
                }
            }
        }
        return ans.toString();
    }
    public static String shiftingLettersOptimum(String s,int[][] shifts){
        int n=s.length();
        int[] netShift=new int[n+1];
        for (int[] shift : shifts) {
            int start = shift[0], end = shift[1];
            if (shift[2] == 1) {
                netShift[start]++;
                netShift[end + 1]--;
            } else {
                netShift[start]--;
                netShift[end + 1]++;
            }
        }
        int shiftSum=0;
        StringBuilder ans=new StringBuilder(s);
        for(int i=0;i<n;i++){
            shiftSum+=netShift[i];
            int shift=shiftSum%26;
            char newChar=(char)('a'+(ans.charAt(i)-'a'+shift+26)%26);
            ans.setCharAt(i,newChar );
        }
        return ans.toString();
    }
}
