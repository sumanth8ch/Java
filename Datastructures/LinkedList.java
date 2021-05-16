public class LinkedList {
    Node head;

    class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    public void insertStart(int x){
        Node newnode = new Node(x);
        newnode.next = head;
        head = newnode;
    }

    public void insertEnd(int x){
        Node newnode = new Node(x);
        if (head == null){
            head = new Node(x);
            return;
        }
        newnode.next = null;
        Node curnode = head;
        while (curnode.next != null)
            curnode = curnode.next;
        curnode.next = newnode;
        return;
    }

    public void insertNext(Node prevnode, int x){
        if (prevnode==null){
            System.out.println("Previous node can't be null");
            return;
        }
        Node newnode = new Node(x);
        newnode.next = prevnode.next;
        prevnode.next = newnode;
    }

    public void delete(int position){
        if (head==null)
            return;
        Node curnode = head;
        if (position==0){
            head = curnode.next;
            return;
        }
        for(int i=0;curnode!=null && i<position-1; i++){
            curnode = curnode.next;    
        }
        if (curnode==null || curnode.next==null)
            return;
        Node nextnode = curnode.next.next;
        curnode.next =nextnode;
    }

    public void displayList(){
        Node curnode = head;
        System.out.println("The LinkedList : ");
        while(curnode!=null){
            System.out.print(curnode.data+" ");
            curnode = curnode.next;
        }
    }

    public static void main(String[] args){
        LinkedList l = new LinkedList();

        l.insertStart(2);
        l.insertStart(5);
        l.insertEnd(8);
        l.insertNext(l.head.next, 46);
        l.displayList();
        l.delete(3);
        System.out.println(" ");
        l.displayList();

    }

}
