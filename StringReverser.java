import java.util.Stack;

public class StringReverser {
    public static void main(String[] args) {
        String input = "JAVA";
        Stack<Character> stack = new Stack<Character>();

        // push every character onto the stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // pop every character: the last one pushed comes out first
        String output = "";
        while (!stack.isEmpty()) {
            output = output + stack.pop();
        }

        System.out.println("Input :  " + input);
        System.out.println("Output:  " + output);
    }
}
