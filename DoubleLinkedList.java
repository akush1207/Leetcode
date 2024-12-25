public class DoubleLinkedList {
    DoubleLinkedListNode head,tail;
    public  void addFirst(int value){
        DoubleLinkedListNode toAdd=new DoubleLinkedListNode(value);
        if(head==null){
            head=tail=toAdd;
        }else{
            toAdd.next=head;
            head.prev=toAdd;
            head=toAdd;
        }
    }
    public void addLast(int value){
        DoubleLinkedListNode toAdd=new DoubleLinkedListNode(value);
        if(head==null){
            head=tail=toAdd;
        }else{
            tail.next=toAdd;
            toAdd.prev=tail;
            tail=toAdd;
        }
    }
    public void addAtIndex(int index,int value){
        if(index==0){
            addFirst(value);
        }else if(index==size()-1){
            addLast(value);
        }else{
            DoubleLinkedListNode toAdd=new DoubleLinkedListNode(value);
            DoubleLinkedListNode curr=head;
            for(int i=0;i<index-1;i++){
                curr=curr.next;
            }
            toAdd.next=curr.next;
            curr.next.prev=toAdd;
            toAdd.prev=curr;
            curr.next=toAdd;
        }
    }
    public void deleteFirst(){
        if(isEmpty()){
            System.out.println("Double Linked List is empty.");
        }else{
            if(head.next==null){
                head=tail=null;
            }else{
                head=head.next;
                head.prev=null;
            }
        }
    }
    public void deleteEnd(){
        if(isEmpty()){
            System.out.println("Double Linked List is empty.");
        }else{
            if(head.next==null){
                head=tail=null;
            }else{
                tail=tail.prev;
                tail.next=null;
            }
        }
    }
    public void deleteAtIndex(int index){
        if(index==0){
            deleteFirst();
        }else if(index==size()-1){
            deleteEnd();
        }else{
            DoubleLinkedListNode curr=head;
            for(int i=0;i<index-1;i++){
                curr=curr.next;
            }
            curr.next=curr.next.next;
            curr.next.prev=curr;
        }
    }
    public boolean isEmpty(){
        return head==null;
    }
    public int size(){
        int len=0;
        DoubleLinkedListNode curr=head;
        while (curr!=null){
            len++;
            curr=curr.next;
        }
        return len;
    }
    public void displayForward(){
        if(isEmpty()){
            System.out.println("Double Linked List is empty.");
        }else{
            System.out.print("Double Linked List:");
            DoubleLinkedListNode curr=head;
            while (curr!=null){
                System.out.print(curr.value);
                if(curr.next!=null){
                    System.out.print("<->");
                }
                curr=curr.next;
            }
        }
        System.out.println();
    }
    public void displayBackward(){
        if(isEmpty()){
            System.out.println("Double Linked List is empty.");
        }else{
            System.out.print("Double Linked List:");
            DoubleLinkedListNode curr=tail;
            while (curr!=null){
                System.out.print(curr.value);
                if(curr.prev!=null){
                    System.out.print("<->");
                }
                curr=curr.prev;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoubleLinkedList list=new DoubleLinkedList();
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.addAtIndex(3,0);
        list.displayForward();
        list.displayBackward();
        list.deleteAtIndex(3);
        list.displayForward();
        list.displayBackward();


    }
}