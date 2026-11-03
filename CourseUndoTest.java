public class CourseUndoTest {
    public static void main(String[] args) {
        CourseRegistration reg =
            new CourseRegistration("Hodan");
        reg.addCourse("CA314");
        reg.addCourse("CA301");
        reg.addCourse("MA210");
        reg.undoLastCourse();
    }
}
