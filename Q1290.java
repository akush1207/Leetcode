public class Q1290 {
    public static void main(String[] args) {
        SingleLinkedList list=new SingleLinkedList();
        list.add(1);
        list.add(0);
        list.add(1);
        list.display();
        System.out.println("Decimal Value:"+getDecimalValue(list.head));
    }
    public static int getDecimalValue(SingleLinkedListNode head){
        int decimal=0,pow=getSize(head)-1;
        while (head!=null){
            decimal+=(int)Math.pow(2,pow--)*head.value;
            head=head.next;
        }
        return decimal;

    }
    public static int getSize(SingleLinkedListNode head){
        int size=0;
        while (head!=null){
            size++;
            head=head.next;
        }
        return size;
    }
}
