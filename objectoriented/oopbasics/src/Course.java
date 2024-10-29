import java.util.ArrayList;
import java.util.List;

public class Course {
    String courseName;
    String professorName;
    int year;
    List<Student> enrolledStudents;

    // Constructor
    public Course(String courseName, String professorName, int year) {
        this.courseName = courseName;
        this.professorName = professorName;
        this.year = year;
        this.enrolledStudents = new ArrayList<>();
    }

    // Method to enroll a student
    public void enroll(Student student) {
        enrolledStudents.add(student);
    }

    // Overloaded method to enroll multiple students
    public void enroll(Student[] students) {
        for (Student student : students) {
            enroll(student);
        }
    }

    // Method to unenroll a student
    public void unEnroll(Student student) {
        enrolledStudents.remove(student);
    }

    // Method to count students
    public int countStudents() {
        return enrolledStudents.size();
    }

    // Method to find the best grade
    public int bestGrade() {
        int best = 0;
        for (Student student : enrolledStudents) {
            if (student.grade > best) {
                best = student.grade;
            }
        }
        return best;
    }

    // Method to calculate the average grade
    public double averageGrade() {
        if (enrolledStudents.isEmpty()) {
            return 0;
        }
        int total = 0;
        for (Student student : enrolledStudents) {
            total += student.grade;
        }
        return (double) total / enrolledStudents.size();
    }

    // Method to rank students by grade
    public void rankStudents() {
        enrolledStudents.sort((s1, s2) -> Integer.compare(s2.grade, s1.grade)); // Descending order
        for (Student student : enrolledStudents) {
            System.out.println(student.firstName + " " + student.lastName + ": " + student.grade);
        }
    }

    // Method to check if students are above average
    public void checkAboveAverage() {
        double average = averageGrade();
        for (Student student : enrolledStudents) {
            System.out.println(student.firstName + " " + student.lastName + " is " +
                               (student.grade > average ? "above" : "below") + " average.");
        }
    }
}
