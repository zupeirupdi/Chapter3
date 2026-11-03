public class StackEmptyException extends RuntimeException {
    public StackEmptyException(String collection) {
        super("The " + collection + " is empty.");
    }
}
