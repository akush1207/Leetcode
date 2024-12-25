import java.util.Scanner;

public class Q1672 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row and column of the matrix:");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] matrix=new int[row][col];
        System.out.println("Enter matrix elements:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Maximum Wealth:"+maximumWealth(matrix));
    }
    public static int maximumWealth(int[][] accounts) {
        int maxWealth=0;
        for(int[] account:accounts){
            int currWealth=0;
            for(int wealth:account){
                currWealth+=wealth;
            }
            maxWealth=Math.max(maxWealth,currWealth);
        }
        return maxWealth;
    }
}
