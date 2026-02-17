import java.util.*;
class Student {
    public String studentName ;
    public String registrationNo;
    public String program;
    public int semester;
    
    String [] courses = new String [5];
    public void display(){
        System.out.println("Name: " + studentName + "\nRegistration No. : " + registrationNo + "\nCourse: " + program + "\nSemester: " + semester + "Registered Courses : " );
    }
    

    public void giveExam(){
        System.out.println("Student not registered. Please register yourself for the exam.");
    }

    public void displayCourses(){
        for (int i=0 ; i<courses.length ; i++){
            System.out.println("Course " + (i+1) + "= " + courses[i]);
        }
    }

}
public class StudentTest{
    static Scanner sc = new Scanner (System.in);
    public static void main(String [ ] args){
     Student student1 = new Student();
    System.out.println("Enter your name: ");
    student1.studentName = sc.nextLine();
    System.out.println("Enter your Registration No. : ");
    student1.registrationNo = sc.nextLine();
    System.out.println("Enter Your program: ");
    student1.program = sc.nextLine();
    student1.display();
    System.out.println("Choose one of the courses: \n1. DSA \n2. ISL \n3. Discrete \n4. Sociology \nMaths");
    student1.courses[0]=sc.nextLine();
    student1.courses[1]=sc.nextLine();
    student1.courses[2]=sc.nextLine();
    student1.courses[3]=sc.nextLine();
    student1.courses[4]=sc.nextLine();
    
    student1.displayCourses();

    student1.giveExam();
    }


}
