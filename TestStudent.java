package Exercise2;

public class TestStudent {
    public static void main(String[] args) {

        Student student = new Student("Sara", 20, 13.5);

        System.out.println(student);

        if (student.isPassed()) {
            System.out.println(student.getName() + " has PASSED.");
        } else {
            System.out.println(student.getName() + " has FAILED.");
        }
    }
}
