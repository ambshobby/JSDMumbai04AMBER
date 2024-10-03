package StudentPack1;

public class Student {
    private String firstName;
      private  String lastName;
      private int registration;
      private int grade;
      private int year;
    //Constructors

    public Student(String firstName, int grade, String lastName, int registration, int year) {
        this.firstName = firstName;
        this.grade = grade;
        this.lastName = lastName;
        this.registration = registration;
        this.year = year;
    }

   

    public Student(String lastName) {
        this.lastName = lastName;
    }

    
    

    //Methods 
    public void printFullName(){
        //TODO implement
     }
  
     public void isApproved(){
         //TODO implement: should return true if grade >= 60
     }
  
     public int changeYearIfApproved(){
         //TODO implement: the student should advance to the next year if he/she grade is >= 60
         // Make year = year + 1, and print "Congragulations" if the student has been approved
         return 0;
     }

}
