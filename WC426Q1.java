import java.util.Scanner;
public class WC426Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        System.out.println("Smallest Number:"+smallestNumber(n));
    }
    public static int smallestNumber(int n){
        int noOfBits=0;
        while (n!=0){
            noOfBits++;
            n>>=1;
        }
        return (int)Math.pow(2,noOfBits)-1;
    }
}
