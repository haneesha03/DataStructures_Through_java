class RideManagementSystem {
    private String requests[];
    private int rear,front,capacity,size;
    public RideManagementSystem(int capacity){
        this.capacity = capacity;
        requests = new String[capacity];
        rear = -1;
        front = 0;
        size = 0;
    }
    public void enqueue(String request){
        if(size==capacity){
            System.out.println("Queue is full ,try again later");
            return;
        }
        rear=(rear+1)%capacity;
        requests[rear]=request;
        size++;
        System.out.println("Request added: "+request);
    }
    public String dequeue(){
        if(size==0){
            System.out.println("No pending requests");
            return null;
        }
        String servedrequest=requests[front];
        front=(front+1)%capacity;
        size--;
        System.out.println("Request served: "+servedrequest);
        return servedrequest;

    }
    public String peek(){
        if(size==0){
            System.out.println("no pending request");
            return null;
        }
        return requests[front];
    }
    public boolean isEmpty(){
        return size==0;
    }
    public static void main(String args[]){
        RideManagementSystem rideSystem = new RideManagementSystem(5);
        rideSystem.enqueue("Request 1: John to Airport");
        rideSystem.enqueue("Request 2: Alice to Downtown");
        rideSystem.dequeue();
        System.out.println(rideSystem.isEmpty());
        rideSystem.dequeue();
        System.out.println(rideSystem.peek());
    }
}