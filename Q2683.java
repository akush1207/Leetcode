import java.util.Scanner;

public class Q2683 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array length:");
        int len=sc.nextInt();
        int[] derived=new int[len];
        System.out.print("Enter array elements:");
        for(int i=0;i<len;i++){
            derived[i]=sc.nextInt();
        }
        System.out.println("Neighbouring Bitwise XOR:"+neighbourXor(derived));
    }
    public static boolean neighbourXor(int[] derived){
        int xor=0;
        for(int i:derived){
            xor^=i;
        }
        return xor==0;
    }
}
