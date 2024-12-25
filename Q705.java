public class Q705 {
    static class MyHashSet{
        SingleLinkedListNode head;
        public MyHashSet(){
            head=null;
        }

        public void add(int key) {
            SingleLinkedListNode toAdd=new SingleLinkedListNode(key);
            if(head==null){
                head=toAdd;
                head.next=null;
            }else{
                if(!contains(key)){
                    toAdd.next=head;
                    head=toAdd;
                }
            }
        }

        public void remove(int key) {
            SingleLinkedListNode dummyHead=new SingleLinkedListNode(-1);
            dummyHead.next=head;
            SingleLinkedListNode curr=dummyHead;
            while (curr.next!=null){
                if(curr.next.value==key){
                    curr.next=curr.next.next;
                }else{
                    curr=curr.next;
                }
            }
            head=dummyHead.next;
        }

        public boolean contains(int key) {
            SingleLinkedListNode curr=head;
            while (curr!=null){
                if(curr.value==key){
                    return true;
                }
                curr=curr.next;
            }
            return false;
        }
    }
    public static void main(String[] args) {
        SingleLinkedList list=new SingleLinkedList();
        MyHashSet set=new MyHashSet();
        list.display();
        set.add(1);
        set.add(2);
        set.add(1);
        set.add(3);
        list.display();
        System.out.println("set.contains(2):"+set.contains(2));
        set.remove(2);
    }
}
