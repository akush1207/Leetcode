public class Q445 {
    public static void main(String[] args) {
        SingleLinkedList list1=new SingleLinkedList();
        list1.add(7);/*
        list1.add(3);
        list1.add(2);
        list1.add(4);*/
        list1.display();
        SingleLinkedList list2=new SingleLinkedList();
        list2.add(5);
        /*list2.add(6);
        list2.add(4);*/
        list2.display();
        System.out.print("Sum:");
        SingleLinkedListNode ans=addTwoNumber(list1.head,list2.head);
        while (ans!=null){
            System.out.print(ans.value+" ");
            ans=ans.next;
        }
    }
    public static SingleLinkedListNode addTwoNumber(SingleLinkedListNode l1,SingleLinkedListNode l2){
        SingleLinkedListNode ans=new SingleLinkedListNode(-1);
        SingleLinkedListNode curr1=reverse(l1),curr2=reverse(l2),curr=ans;
        int carry=0;
        while (curr1!=null && curr2!=null){
            int sum=carry+curr1.value+curr2.value;
            carry=sum/10;
            sum%=10;
            curr.next=new SingleLinkedListNode(sum);
            curr=curr.next;
            curr1=curr1.next;
            curr2=curr2.next;
        }
        while (curr1!=null){
            int sum=carry+curr1.value;
            carry=sum/10;
            sum%=10;
            curr.next=new SingleLinkedListNode(sum);
            curr=curr.next;
            curr1=curr1.next;
        }
        while (curr2!=null){
            int sum=carry+curr2.value;
            carry=sum/10;
            sum%=10;
            curr.next=new SingleLinkedListNode(sum);
            curr=curr.next;
            curr2=curr2.next;
        }
        if(carry!=0){
            curr.next=new SingleLinkedListNode(carry);
        }
        ans=ans.next;
        ans=reverse(ans);
        return ans;
    }
    public static SingleLinkedListNode reverse(SingleLinkedListNode head){
        SingleLinkedListNode curr=head,prev=null;
        while (curr!=null){
            SingleLinkedListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
}
