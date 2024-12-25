public class Q706 {
    static class hashMap{
        hashMap next;
        int key,value;
        hashMap(int key,int value){
            this.key=key;
            this.value=value;
        }
    }
    static class MyHashMap{
        hashMap head;
        public MyHashMap() {
            head=null;
        }

        public void put(int key, int value) {
            hashMap toAdd=new hashMap(key,value);
            if(head==null){
                head=toAdd;
            }else{
                if(get(key)==-1){
                    toAdd.next=head;
                    head=toAdd;
                }else{
                    hashMap curr=head;
                    while (curr!=null){
                        if(curr.key==key){
                            curr.value=value;
                            return;
                        }
                        curr=curr.next;
                    }
                }
            }
        }

        public int get(int key) {
            hashMap curr=head;
            while (curr!=null){
                if(curr.key==key){
                    return curr.value;
                }
                curr=curr.next;
            }
            return -1;
        }

        public void remove(int key) {
            if(head==null || head.key==key){
                head=null;
                return;
            }
            hashMap dummy=new hashMap(-1,-1);
            dummy.next=head;
            while (dummy!=null){
                if(dummy.next.key==key){
                    dummy.next=dummy.next.next;
                    return;
                }
                dummy=dummy.next;
            }

        }
    }

    public static void main(String[] args) {
        MyHashMap map=new MyHashMap();
        map.put(1,1);
        map.put(2,2);
        System.out.println("map.get(1):"+map.get(1));
        System.out.println("map.get(3):"+map.get(3));
        map.put(2,1);
        System.out.println("map.get(2):"+map.get(2));
        map.remove(2);
        System.out.println("map.get(2):"+map.get(2));

    }
}
