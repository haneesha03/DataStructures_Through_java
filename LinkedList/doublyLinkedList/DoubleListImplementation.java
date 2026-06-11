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
    int size;
    public DoublyLinkedList(){
        this.head=null;
        this.tail=null;
        this.size=0;
    }
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(size==0){
            head=newNode;
            tail=newNode;
        }
        else{
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
        }
        size++;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        if(size==0){
            head=newNode;
            tail=newNode;
        }
        else{
            newNode.prev=tail;
            tail.next=newNode;
            tail=newNode;
        }
        size++;
    }
    public void addAtPostion(int data,int position){
        if(position<0 || position-1>size){
            System.out.println("cant add invelid position");
            return;
        }
        if(position==0){
            addFirst(data);
        }
        if(position==size+1){
            addLast(data);
        }
        Node newNode=new Node(data);
        Node curr=head;
        int count=0;
        while(curr.next.next!=null && count<position-1){
            curr=curr.next;
        }
        newNode.next=curr.next;
        curr.next.prev=newNode;
        newNode.prev=curr;
        curr.next=newNode;
        size++;
    }
    public void deleteFirst(){
        if(isEmpty()){
            System.out.println("can't remove from empty list");
            return;
        }
        if(head==tail){
            head=null;
            tail=null;
        }
        else{
            head=head.next;
            head.prev=null;
        }
        size--;
    }
    public void deleteLast(){
        if(isEmpty()){
            System.out.println("cant delete from empty set");
        }
        if(head==tail){
            head=null;
            tail=null;
        }
        else{
            tail=tail.prev;
            tail.next=null;
        }
        size--;
    }
    public void deleteAtPosition(int index){
        if(index<0 || index>=size){
            System.out.println("invalid index");
        }
        if(index==0){
            deleteFirst();
        }
        if(index==size-1){
            deleteLast();
        }
        else{
            Node curr=head;
            for(int i=0;i<index;i++){
                curr=curr.next;
            }
            curr.prev.next=curr.next;
            curr.next.prev=curr.prev;
        }
        size--;
    }
    public void displayForward(){
        Node curr=head;
        System.out.print("null <-->");
        while(curr!=null){
            System.out.print(curr.data+"<-->");
            curr=curr.next;
        }
        System.out.println("null");
    }
    public void displayBackward(){
        Node curr=tail;
        System.out.print("null <-->");
        while(curr!=null){
            System.out.print(curr.data+"<-->");
            curr=curr.prev;
        }
        System.out.println("null");
    }
    public boolean isEmpty(){
        return size==0;
    }
}
public class DoubleListImplementation{
    public static void main(String args[]){
        DoublyLinkedList dbl=new DoublyLinkedList();
        dbl.addFirst(20);
        dbl.addFirst(40);
        dbl.addLast(3);
        dbl.addAtPostion(4,2);
        dbl.addFirst(10);
        dbl.addLast(30);
        dbl.displayForward();
        dbl.deleteLast();
        dbl.deleteFirst();
        dbl.displayForward();
        dbl.deleteAtPosition(3);
        dbl.displayBackward();

    }
}
