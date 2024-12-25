public class Q24 {
    public static void main(String[] args) {
        SingleLinkedList list=new SingleLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.display();
        SingleLinkedListNode head=swapPair(list.head);
        while (head!=null){
            System.out.print(head.value+" ");
            head=head.next;
        }
    }
    public static SingleLinkedListNode swapPair(SingleLinkedListNode head){
        if(head==null || head.next==null){
            return head;
        }
        SingleLinkedListNode temp,curr=head,prev=null;
        head=head.next;
        while (curr!=null && curr.next!=null){
            temp=curr.next;
            curr.next=temp.next;
            temp.next=curr;
            if(prev!=null){
                prev.next=temp;
            }
            prev=curr;
            curr=curr.next;
        }
        return head;
    }

}
