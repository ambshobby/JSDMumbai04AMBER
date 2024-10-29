public class App 
{
    public static void main(String[] args) throws Exception 
    {
        System.out.println("Hello, World!");
        // Create some Student instances
        Student student1 = new Student("John", "Doe", 1, 75, 1);
        Student student2 = new Student("Jane", "Smith", 2, 50, 1);
        Student student3 = new Student("Alice", "Johnson", 3, 85, 1);
        
        // Create a Course instance
        Course course1 = new Course("Computer Science", "Dr. Brown", 2023);
        Course course2 = new Course("ISC", "Dr. Black", 2023);
        
        // Enroll students
        course1.enroll(student1);
        course1.enroll(student2);
        course2.enroll(student3);
        
        // Overloaded enroll method
        Student[] moreStudents = { new Student("Bob", "Davis", 4, 65, 1),
                                    new Student("Charlie", "Garcia", 5, 90, 1) };
        course1.enroll(moreStudents);
        
        Student[] moreStudents1 = { new Student("Bobby", "Davis", 44, 65, 1),
                                    new Student("Chingi", "Garcia", 55, 90, 1) };
        course2.enroll(moreStudents1);
        // Print full names of enrolled students
        for (Student student : course1.enrolledStudents) {
            student.printFullName();
        }
        
        // Check best grade
        System.out.println("Best Grade: " + course1.bestGrade());
        System.out.println("Best Grade: " + course2.bestGrade());
        
        // Check average grade
        System.out.println("Average Grade: " + course1.averageGrade());
        System.out.println("Average Grade: " + course2.averageGrade());
        
        
        // Rank students
        System.out.println("Ranking of Students of c1:");
        course1.rankStudents();
        System.out.println("Ranking of Students of c2:");
        course1.rankStudents();
        
        // Check if above average
        course1.checkAboveAverage();
        course2.checkAboveAverage();
    }
    }

