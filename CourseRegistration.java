import java.util.Stack;

public class CourseRegistration {
    private String studentName;
    private Stack<String> courses = new Stack<>();
    public CourseRegistration(String studentName) {
        this.studentName = studentName;
    }
    public void addCourse(String code) {
        courses.push(code);
        System.out.println("Added " + code + " -> " + courses);
    }
    public void undoLastCourse() {
        if (courses.isEmpty()) {
            System.out.println("Nothing to undo");
            return;
        }
        String removed = courses.pop();
        System.out.println("Removed " + removed + " -> " + courses);
    }
}
