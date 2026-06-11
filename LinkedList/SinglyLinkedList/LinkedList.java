class Node {
    int data;      
    Node next;     
    public Node(int data) {
        this.data = data;
        this.next = null; 
    }
}
class SimpleLinkedList {
    Node head; 
    public SimpleLinkedList() {
        this.head = null;   
    }
    public void addFirst(int data) {
        Node newNode = new Node(data); 
        newNode.next = head;           
        head = newNode;                
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; 
            return;
        }
        Node current = head;
        // Traverse to the last node
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode; 
    }
    public void displayList() {
        Node current = head;
        while (current != null) { 
            System.out.print(current.data + " -> ");
            current = current.next; 
        }
        System.out.println("null"); 
    }
    public boolean contains(int key){
        Node curr=head;
        while(curr!=null){
            if(curr.data==key){
                return true;
            }
            curr=curr.next;
        }
        return false;

    }
    public void insertPostion(int data,int position){
        if(position<0){
             System.out.println("Invalid Position");
            return;
        }
        if(position==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        Node curr=head;
        int count=0;
        while(curr!=null && count<position-1){
            curr=curr.next;
            count++;
        }
        if(curr==null){
            addLast(data);
            return; 
        }
        newNode.next=curr.next;
        curr.next=newNode;
    }
    public void deleteFirst(){
        if(head==null){
            return;
        }
        head=head.next;
    }
    public void deleteLast(){
        if(head==null){
            return;
        }
        Node curr=head;
        while(curr.next.next!=null){
            curr=curr.next;
        }
        curr.next=null;
    }
}
public class LinkedList{
    public static void main(String args[]){
        SimpleLinkedList list=new SimpleLinkedList();
        list.addFirst(20);
        list.addFirst(2);
        list.addFirst(7);
        list.addLast(5);
        list.addLast(4);
        list.addLast(4);
        list.addFirst(5);
        list.displayList();
        System.out.println(list.contains(10));
        System.out.println(list.contains(2));
    }
}