import java.util.Scanner;

public class Q1572 {
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
        System.out.println("Diagonal Sum:"+diagonalSum(matrix));
    }
    public static int diagonalSum(int[][] matrix){
        int sum=0,row=matrix.length,col=matrix[0].length,j=0;
        boolean[][] visited=new boolean[row][col];
        col--;
        for(int i=0;i<row;i++){
            if(i==j){
                System.out.println("inside if "+i+" "+j);
                sum+=matrix[i][j];
                visited[i][j]=true;
                j++;
            }
            System.out.println("sum:"+sum);
            if(!visited[i][col]){
                System.out.println("inside second if "+i+" "+col);
                visited[i][col]=true;
                sum+=matrix[i][col];
            }
            col--;
            System.out.println("sum:"+sum);
        }
        return sum;
    }
}
