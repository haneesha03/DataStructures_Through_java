class Node{
    int data;
    Node next;
    Node prev;
    public Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
class DoublyLinkedList{
    Node head;
    Node tail;
    public DoublyLinkedList(){
        this.head=null;
        this.tail=null;
    }
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null && tail==null){
            head=newNode;
            tail=newNode;
        }
        else{
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
        }
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null && tail==null){
            head=newNode;
            tail=newNode;
        }
        else{
            newNode.prev=tail;
            tail.next=newNode;
            tail=newNode;
        }
    }
    public void displayFromFirst(){
        Node curr=head;
        System.out.print("null <-->");
        while(curr!=null){
            System.out.print(curr.data+"<-->");
            curr=curr.next;
        }
        System.out.println("null");
    }
    public void displayFromLast(){
        Node curr=tail;
        System.out.print("null <-->");
        while(curr!=null){
            System.out.print(curr.data+"<-->");
            curr=curr.prev;
        }
        System.out.println("null");
    

    }
}
public class DoubleListImplementation{
    public static void main(String args[]){
        DoublyLinkedList dbl=new DoublyLinkedList();
        dbl.addFirst(20);
        dbl.addFirst(40);
        dbl.addFirst(70);
        dbl.addFirst(80);
        dbl.addFirst(10);
        dbl.addFirst(30);
        dbl.displayFromFirst();
        dbl.displayFromLast();

    }
}
