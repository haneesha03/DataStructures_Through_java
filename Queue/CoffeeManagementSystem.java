import java.util.*;
public class CoffeeManagementSystem {
    public static void main(String args[]){
        Queue<String> orders=new LinkedList<>();
        orders.offer("Alice");
        orders.offer("Bob");
        orders.offer("Charlie");
        System.out.println(orders);
        System.out.println("Serving: "+orders.poll());
        orders.offer("david");
        System.out.println("the person in queue:"+orders.peek());
        System.out.println(orders);
    }
}
