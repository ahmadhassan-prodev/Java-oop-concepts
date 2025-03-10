import java.util.Scanner;

class Student
{
    private String st_name;
    private String roll_no;
    private int sem_no;
    private String course_name;
    private int marks;
    private char grade;

    Student()
    {
        st_name = null;
        roll_no = null;
        sem_no = 0;
        course_name = null;
        marks = 0;
        grade = 'N';
    }

    Student(String n, String rn, int sn, String cn,int m)
    {
        st_name = n;
        roll_no = rn;
        sem_no = sn;
        course_name = cn;
        marks = m;
        calculateGrade();
    }

    void calculateGrade()
    {
        if(marks >= 9)
            grade = 'A';
        else if(marks >= 7)
            grade = 'B';
        else if(marks >= 5)
           grade = 'C';
        else
            grade = 'F';
    }

    void display_quiz_grade()
    {
        System.out.println("Name = " + st_name);
        System.out.println("Roll no = " + roll_no);
        System.out.println("Course name = " + course_name);
        System.out.println("Semester no = " + sem_no);
        System.out.println("Your marks are " + marks);
        System.out.println("Your grade is " + grade);
    }

    void get_student_data()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Student 1 Data");
        System.out.print("Enter student name = ");
        st_name = s.nextLine();
        System.out.print("Enter roll no. = ");
        roll_no = s.nextLine();
        System.out.print("Enter course name = ");
        course_name = s.nextLine();
        System.out.print("Enter semester no. = ");
        sem_no = s.nextInt();
        System.out.print("Enter marks = ");
        marks = s.nextInt();
        calculateGrade();
    }

}

public class studentclass {
    public static void main(String[] args) {
        Student S1 = new Student();
        S1.get_student_data();
        System.out.println("\nStudent 1 Data");
        S1.display_quiz_grade();
        Student S2 = new Student("Naeem","SP25-BSE-056",3,"PF",7);
        System.out.println("\nStudent 2 Data");
        S2.display_quiz_grade();
        Student S3 = new Student("Ali","FA24-BSE-045",2,"PF",4);
        System.out.println("\nStudent 3 Data");
        S3.display_quiz_grade();
    }
}
