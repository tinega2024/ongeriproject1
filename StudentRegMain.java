
class Course {
    String courseCode;
    String courseName;
    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
    }
    public String getCourseDetails() {
        return "Course Code: " + courseCode + ", Course Name: " + courseName;
    }
}
class StudentCourse {
    String regNumber;
    String studentName;
    Course course;
    public StudentCourse(String regNumber, String studentName, Course course) {
        this.regNumber = regNumber;
        this.studentName = studentName;
        this.course = course;
    }
    public String printT() {
        return "Student Registration Number: " + regNumber + "\n" +
               "Student Name: " + studentName + "\n" +
               "Course Enrolled: " + course.getCourseDetails();
    }
    public String printD() {
        return "Student Registration Number: " + regNumber + "\n" +
               "Student Name: " + studentName + "\n" +
               "Course Enrolled: " + course.getCourseDetails();
    }
}
public class StudentRegMain {
    public static void main(String[] args) {
        System.out.println("\n=========using new Course==========");
        StudentCourse Tok = new StudentCourse("H148/1662/2023", "Tinega Ongeri", new Course("SCI220", "Programming in python"));
        StudentCourse dan = new StudentCourse("H148/1663/2023", "Daniel Ongeri", new Course("SCS200", "Web Programming"));

        System.out.println("\n---------------\n");
        System.out.println(Tok.printT());
        System.out.println("-------------");
        System.out.println(dan.printD());

        System.out.println("\n===================\n");
        System.out.println("=====CREATE OBJECT FIRST=======");
        Course a = new Course("SCI220", "Programming in python");
        Course b = new Course("SCS200", "Web programming");

        System.out.println(Tok.printT());
        System.out.println("------------------");
        StudentCourse kipp = new StudentCourse("H148/1663/2023", "Daniel Ongeri", b);
        System.out.println(dan.printD());
        
        System.out.println("=======================");
    }
}
