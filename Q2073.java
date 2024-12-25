import java.util.Scanner;

public class Q2073 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array length:");
        int len=sc.nextInt();
        int[] arr=new int[len];
        System.out.print("Enter array elements:");
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter k:");
        int k=sc.nextInt();
        System.out.println("Time required to buy all tickets:"+timeRequiredToBuy(arr,k));
    }
    public static int timeRequiredToBuy(int[] tickets,int k){
        int timeRequired=0;
        while (tickets[k]!=0){
            for(int i=0;i<tickets.length;i++){
                if(tickets[i]>0){
                    tickets[i]--;
                    timeRequired++;
                }
                if(tickets[k]==0){
                    break;
                }
            }
        }
        return timeRequired;
    }
}
