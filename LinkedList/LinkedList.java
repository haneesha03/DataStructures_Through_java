// Basic structure of a Node for an integer linked list
class Node {
    int data;      // The actual data stored in this node
    Node next;     // Reference to the next node in the sequence

    // Constructor to initialize a new node
    public Node(int data) {
        this.data = data;
        this.next = null; // Initially, the next node is null
    }
}
// A simple Linked List class to manage the nodes
class SimpleLinkedList {
    Node head; // Reference to the first node in the list
    // Node tail;
    // Constructor for an empty list
    public SimpleLinkedList() {
        this.head = null;
        // this.tail = null;
    }
    

    // Method to add a new node to the beginning of the list
    public void addFirst(int data) {
        Node newNode = new Node(data); // Create a new node
        newNode.next = head;           // New node's next points to the current head
        head = newNode;                // Update the head to be the new node
        // if(tail==null){
        //     tail=newNode;
        // }
    }
    public void addLast(int data){
    //     Node newNode=new Node(data);
    //     if(head==null){
    //         head=newNode;

    //     }
    //     else{
    //         tail.next=newNode;
    //     }
    //     tail=newNode;
        Node newNode = new Node(data); // Create a new node
        if (head == null) {
            head = newNode; // If list is empty, new node becomes the head
            return;
        }
        Node current = head;
        // Traverse to the last node
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode; // Last node's next points to the new node
    }
    // Method to display the contents of the list (traversal)
    public void displayList() {
        Node current = head; // Start from the head
        while (current != null) { // Continue until we reach the end (null)
            System.out.print(current.data + " -> ");
            current = current.next; // Move to the next node
        }
        System.out.println("null"); // Indicate the end of the list
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
        if(curr==nul){
            addLast(node);
            return; 
        }
        newNode.next=curr.next;
        curr.next=newNode;

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