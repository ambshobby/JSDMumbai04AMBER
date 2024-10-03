import StudentPack1.Course;
import StudentPack1.Student;


public class App {
    public static void main(String[] args) throws Exception {
         // Create Students
         Student student1 = new Student("John", "Doe", 12345, 75, 1);
         Student student2 = new Student("Jane", "Smith", 54321, 85, 1);
         Student student3 = new Student("Bob", "Brown", 67890, 50, 1);
         
         // Print full names
         student1.printFullName();
         student2.printFullName();
         student3.printFullName();
 
         // Check if students are approved
         System.out.println("Is " + student1.firstName + " approved? " + student1.isApproved());
         System.out.println("Is " + student2.firstName + " approved? " + student2.isApproved());
         System.out.println("Is " + student3.firstName + " approved? " + student3.isApproved());
 
         // Change year if approved
         student1.changeYearIfApproved();
         student2.changeYearIfApproved();
         student3.changeYearIfApproved();
 
         // Create a Course and enroll students
         Course course = new Course("Math", "Dr. Smith", 2023);
         course.enroll(student1);
         course.enroll(student2);
 
         // Enroll an array of students
         Student[] newStudents = {student3};
         course.enroll(newStudents);
 
         // Print the number of students and best grade
         System.out.println("Total students enrolled: " + course.countStudents());
         System.out.println("Best grade in course: " + course.bestGrade());
    }
}
