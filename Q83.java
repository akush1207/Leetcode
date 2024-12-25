public class Q83 {
    public static void main(String[] args) {
        SingleLinkedList list=new SingleLinkedList();
        list.add(1);
        list.add(1);
        list.add(2);
        list.display();
        list.head=deleteDuplicate(list.head);
        list.display();
    }
    public static SingleLinkedListNode deleteDuplicate(SingleLinkedListNode head){
        SingleLinkedListNode curr=head;
        while (curr!=null && curr.next!=null){
            if(curr.value==curr.next.value){
                curr.next=curr.next.next;
            }else{
                curr=curr.next;
            }
        }
        return head;
    }
}
