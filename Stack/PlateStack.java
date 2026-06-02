public class PlateStack {
    private String[] plates;
    private int capacity;
    private int top;
    public PlateStack(int capacity){
        this.capacity=capacity;
        plates=new String[capacity];
        top=-1;
    }
    public void push(String plate){
        if(top==capacity-1){
            System.out.println("Stack is full cannot add plates");
            return;
        }
        plates[++top]=plate;
        System.out.println("Added plate: "+plate);
    }
    public String pop(){
        if(top==-1){
            System.out.println("Stack is empty cannto remove plates");
            return null;
        }
        String
        popedplate=plates[top--];
        return popedplate;
    }
    public String peek(){
        if(top==-1){
            System.out.println("Stack is emppty");
            return null;
        }
        return plates[top];
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public static void main(String args[]){
        PlateStack stack =new PlateStack(3);
        stack.push("pancakeplate");
        stack.push("dinnerplate");
        stack.push("saladplate");
        stack.push("dessertplate");
        System.out.println("Top plate: "+stack.peek());
        System.out.println("Removing plate: "+stack.pop()); 
        System.out.println(stack.isEmpty());
        System.out.println(stack);
    }
}
