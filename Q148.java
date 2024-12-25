public class Q148 {
    public static void main(String[] args) {
        SingleLinkedList list=new SingleLinkedList();
        list.add(4);
        list.add(2);
        list.add(1);
        list.add(3);
        list.display();
        SingleLinkedListNode curr=sortList(list.head);
        while (curr!=null){
            System.out.print(curr.value+" ");
            curr=curr.next;
        }
    }
    public static SingleLinkedListNode sortList(SingleLinkedListNode head){
        boolean swapped;
        do{
            swapped=false;
            SingleLinkedListNode curr=head,prev=null;
            while (curr!=null && curr.next!=null){
                if(curr.value > curr.next.value){
                    SingleLinkedListNode nextNode=curr.next;
                    curr.next=nextNode.next;
                    nextNode.next=curr;
                    if(prev==null){
                        head=nextNode;
                        prev=head;
                    }else{
                        prev.next=nextNode;
                        prev=nextNode;
                    }
                    swapped=true;
                }else{
                    prev=curr;
                    curr=curr.next;
                }
            }
        }while (swapped);
        return head;
    }
}
