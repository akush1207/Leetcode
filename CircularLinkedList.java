public class CircularLinkedList {
    CircularLinkedListNode head,tail;
    public void append(int value){
        CircularLinkedListNode toAdd=new CircularLinkedListNode(value);
        if(isEmpty()){
            head=tail=toAdd;
        }else{
            tail.next=toAdd;
            toAdd.prev=tail;
            tail=toAdd;
        }
        tail.next=head;
        head.prev=tail;
    }
    public boolean isEmpty(){
        return head==null;
    }
    public int size(){
        int len=0;
        CircularLinkedListNode curr=head;
        while (curr.next!=head){
            len++;
            curr=curr.next;
        }
        return len+1;
    }
    public void prepend(int value){
        CircularLinkedListNode toAdd=new CircularLinkedListNode(value);
        if(isEmpty()){
            head=tail=toAdd;
        }else{
            head.prev=toAdd;
            toAdd.next=head;
            head=toAdd;
        }
        head.prev=tail;
        tail.next=head;
    }
    public void insert(int index,int value){
        if(index==0){
            prepend(value);
        }else if(index==size()-1){
            append(value);
        }else{
            CircularLinkedListNode toAdd=new CircularLinkedListNode(value);
            CircularLinkedListNode curr=head;
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
            System.out.println("Circular Linked List is empty.");
        }else{
            if(head.next==head){
                head=tail=null;
            }else{
                head=head.next;
                head.prev=tail;
                tail.next=head;
            }
        }
    }
    public void deleteLast(){
        if(isEmpty()){
            System.out.println("Circular Linked List is empty.");
        }else{
            if(head.next==head){
                head=tail=null;
            }else{
                tail=tail.prev;
                tail.next=head;
                head.prev=tail;
            }
        }
    }
    public void deleteAtIndex(int index){
        if(index==0){
            deleteFirst();
        }else if(index==size()-1){
            deleteLast();
        }else{
            CircularLinkedListNode curr=head;
            for(int i=0;i<index-1;i++){
                curr= curr.next;
            }
            curr.next=curr.next.next;
            curr.next.prev=curr;
        }
    }
    public void displayForward(){
        if(isEmpty()){
            System.out.println("Circular Linked List is empty");
        }else{
            System.out.print("Circular Linked List:");
            CircularLinkedListNode curr=head;
            do{
                System.out.print(curr.value);
                if(curr.next!=null){
                    System.out.print(" <-> ");
                }
                curr=curr.next;
            }while (curr!=head);
            System.out.println(curr.value);
        }
    }
    public void displayBackward(){
        if(isEmpty()){
            System.out.println("Circular Linked List is empty");
        }else{
            System.out.print("Circular Linked List:");
            CircularLinkedListNode curr=tail;
            do{
                System.out.print(curr.value);
                if(curr.prev!=null){
                    System.out.print(" <-> ");
                }
                curr=curr.prev;
            }while (curr!=tail);
            System.out.println(curr.value);
        }
    }

    public static void main(String[] args) {
        CircularLinkedList list=new CircularLinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.displayForward();
        list.displayBackward();
        list.prepend(-1);
        list.prepend(-2);
        list.displayForward();
        list.displayBackward();
        list.insert(3,0);
        list.displayForward();
        list.displayBackward();
        /*list.deleteFirst();
        list.deleteFirst();
        list.deleteFirst();
        list.deleteFirst();
        list.deleteFirst();
        list.deleteFirst();
        list.deleteLast();
        list.deleteLast();
        list.deleteLast();
        list.deleteLast();
        list.deleteLast();
        list.deleteLast();*/
        list.deleteAtIndex(3);
        list.displayForward();
        list.displayBackward();

    }
}
