
package W4.Model;

public class Student {
    private int studentID;
    private String studentName;
    private int semester; 
    private String courseName;
    private int count;

    public Student(String studentName, String courseName, int count) {
        this.studentName = studentName;
        this.courseName = courseName;
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    
    public Student(int studentID, String studentName, int semester, String courseName) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.semester = semester;
        this.courseName = courseName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
    public void displayTitle(){
        System.out.printf("%-10s  | %-8s  | %-10s%n","Student Name", "Semester", "Course Name");
    }
    public void displayStudent(){
        System.out.printf("%-10s  | %-8d  | %-10s%n",studentName, semester, courseName);
    }
    
}
