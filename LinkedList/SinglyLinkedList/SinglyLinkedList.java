class Page {
    String data;      
    Page next;     
    public Page(String data) {
        this.data = data;
        this.next = null; 
    }
}
class BrowsingHistory{
    Page head; 
    public BrowsingHistory() {
        this.head = null;
    }
    public void addFirst(String data) {
        Page newPage = new Page(data); 
        newPage.next = head;           
        head = newPage;               
    }
    public void delete(String data){
        if(head==null){
            System.out.println("the history is empty");
        }
        if(head.data.equals(data)){
            head=head.next;
            System.out.println("deleted page"+data);
        }
        Page curr=head;
        Page prev=null;
        while(curr!=null && !curr.data.equals(data)){
            prev=curr;
            curr=curr.next;
        }
        if(curr==null){
            System.out.println("page not found!!!");
        }
        prev.next=curr.next;
        System.out.println("deleted page"+data);
    }
    public void search(String data){
        Page curr=head;
        while(curr!=null){
            if(head.data.equals(data)){
                System.out.println("founded"+data);
                return;
            }
            curr=curr.next;
        }
        System.out.println("Not found");
    }
    public void displayList() {
        Page current = head; 
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
public class SinglyLinkedList{
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