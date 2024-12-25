public class SingleLinkedList {
    SingleLinkedListNode head;
    public void display(){
        if(isEmpty()){
            System.out.println("Linked List is empty.");
        }else{
            System.out.print("Linked List:");
            SingleLinkedListNode curr=head;
            while (curr!=null){
                System.out.print(curr.value);
                if(curr.next!=null){
                    System.out.print("->");
                }
                curr=curr.next;
            }
            System.out.println();
        }
    }

    public boolean isEmpty(){
        return head==null;
    }

    public int size(){
        int len=0;
        SingleLinkedListNode curr=head;
        while (curr!=null){
            len++;
            curr=curr.next;
        }
        return len;
    }

    public void add(int value){
        SingleLinkedListNode toAdd=new SingleLinkedListNode(value);
        if(isEmpty()){
            head=toAdd;
        }else{
            SingleLinkedListNode curr=head;
            while (curr.next!=null){
                curr=curr.next;
            }
            curr.next=toAdd;
        }

    }
    public void addFirst(int value){
        SingleLinkedListNode toAdd=new SingleLinkedListNode(value);
        if(isEmpty()){
            head=toAdd;
            head.next=null;
        }else{
            toAdd.next=head;
            head=toAdd;
        }
    }


    public static void main(String[] args) {
        SingleLinkedList list=new SingleLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.display();
        System.out.println("list.head:"+list.head.value);
        System.out.println("Size:"+list.size());
    }
}
