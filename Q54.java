import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q54 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter row and column of the matrix:");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] matrix=new int[row][col];
        System.out.print("Enter matrix elements:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Spiral Matrix:"+spiralMatrix(matrix));
    }
    public static List<Integer> spiralMatrix(int[][] matrix){
        int left=0,right=matrix[0].length-1,top=0,bottom=matrix.length-1,count=1;
        List<Integer> ans=new ArrayList<>();
        while (left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                ans.add(matrix[top][i]);
                System.out.println(count++);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                ans.add(matrix[i][right]);
                System.out.println(count++);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    ans.add(matrix[bottom][i]);
                    System.out.println(count++);
                }
            }
            bottom--;
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    ans.add(matrix[i][left]);
                    System.out.println(count++);
                }
            }
            left++;
        }
        return ans;
    }
}
