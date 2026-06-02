import java.util.Stack;
public class CallSimulator {
    public static void main(String args[]){
        Stack<String> callStack = new Stack<>();
        callStack.push("main()");
        callStack.push("calculateSum(5, 10)");
        callStack.push("readInput()");
        System.out.println("Current Call Stack: " + callStack.peek());
        callStack.pop();
        callStack.pop();
        System.out.println(callStack);
    }
}
