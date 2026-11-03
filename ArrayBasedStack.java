import java.util.Arrays;

public class ArrayBasedStack<T> {
    private static final int DEFAULT_CAPACITY = 2;
    private int top;
    private T[] stack;

    // Creates an empty stack using the default capacity.
    public ArrayBasedStack() {
        this(DEFAULT_CAPACITY);
    }

    // Creates an empty stack using the specified capacity.
    @SuppressWarnings("unchecked")
    public ArrayBasedStack(int initialCapacity) {
        top = 0;
        stack = (T[]) (new Object[initialCapacity]);
    }

    // Adds the element to the top, expanding the array if necessary.
    public void push(T element) {
        if (size() == stack.length) {
            expandCapacity();
        }
        stack[top] = element;
        top++;
    }

    // Creates a new array with twice the capacity of the old one.
    private void expandCapacity() {
        stack = Arrays.copyOf(stack, stack.length * 2);
    }

    // Removes and returns the element at the top.
    public T pop() {
        if (isEmpty()) {
            throw new StackEmptyException("stack");
        }
        top--;
        T result = stack[top];
        stack[top] = null;
        return result;
    }

    // Returns the element at the top without removing it.
    public T peek() {
        if (isEmpty()) {
            throw new StackEmptyException("stack");
        }
        return stack[top - 1];
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public int size() {
        return top;
    }

    // Number of cells in the underlying array.
    public int capacity() {
        return stack.length;
    }
}
