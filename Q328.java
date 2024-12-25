public class Q328 {
    public static void main(String[] args) {
        SingleLinkedList list=new SingleLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.display();
        SingleLinkedListNode curr=oddEvenList(list.head);
        while (curr!=null){
            System.out.print(curr.value+" " );
            curr=curr.next;
        }
    }
    public static SingleLinkedListNode oddEvenList(SingleLinkedListNode head){
        if(head==null || head.next==null){
            return head;
        }
        SingleLinkedListNode odd=head;
        SingleLinkedListNode even=head.next;
        SingleLinkedListNode evenHead=even;
        while (even!=null && even.next!=null){
            odd.next=even.next;
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
        }
        odd.next=evenHead;
        return head;
    }
}
