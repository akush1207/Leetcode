public class Q82 {
    public static void main(String[] args) {
        SingleLinkedList list=new SingleLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);
        list.display();
        SingleLinkedListNode head=deleteDuplicates(list.head);
        while (head!=null){
            System.out.print(head.value+" ");
            head=head.next;
        }
    }
    public static SingleLinkedListNode deleteDuplicates(SingleLinkedListNode head){
        SingleLinkedListNode dummyHead=new SingleLinkedListNode(-200);
        dummyHead.next=head;
        SingleLinkedListNode prev=dummyHead;
        SingleLinkedListNode curr=head;
        while (curr!=null && curr.next!=null){
            if(curr.value == curr.next.value){
                while (curr.next!=null && curr.value==curr.next.value){
                    curr=curr.next;
                }
                prev.next=curr.next;
            }else{
                prev=curr;
            }
            curr=curr.next;
        }
        return dummyHead.next;
    }
}
