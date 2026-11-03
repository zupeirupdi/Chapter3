import java.util.Stack;

public class PeekPopDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Original Stack: " + stack);

        int top = stack.peek();
        System.out.println("top element: " + top);
        System.out.println("Stack after accessing top element: " + stack);

        int removed = stack.pop();
        System.out.println("Removed element: " + removed);
        System.out.println("Stack after Pop Operation: " + stack);
    }
}
