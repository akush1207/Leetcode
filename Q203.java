public class Q203 {
    public static void main(String[] args) {
        SingleLinkedList list=new SingleLinkedList();
        list.add(1);
        list.add(2);
        list.add(6);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.display();
        list.head=removeElements(list.head,6);
        list.display();
    }
    public static SingleLinkedListNode removeElements(SingleLinkedListNode head, int val) {
       SingleLinkedListNode dummyHead=new SingleLinkedListNode(-1);
       dummyHead.next=head;
       SingleLinkedListNode curr=dummyHead;
       while (curr.next!=null){
            if(curr.next.value==val){
                curr.next=curr.next.next;
            }else{
                curr=curr.next;
            }
       }
       return dummyHead.next;

    }
}
