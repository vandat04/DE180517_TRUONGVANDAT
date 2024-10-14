package W7;

import java.util.ArrayList;

public class StudentManagementProgram extends Menu {
    
    static String title = "====== Management Student Program ======";
    static String[] mchon = {"createStudent", "averageStudent", "getPercentTypeStudent", "quit"};
    static ArrayList<Student> studentList;
    
    public StudentManagementProgram() {
        super(title, mchon);
        studentList = new ArrayList<>();
    }
    
    @Override
    public void execute(int ch) {
        switch (ch) {
            case 1:
                System.out.println("====== Management Student Program ======");
                StudentManagement.createStudent(studentList);
                break;
            case 2:
                StudentManagement.studentClassification(studentList);
                break;
            case 3:
                System.out.println("--------Classification Info -----");
                StudentManagement.statisticsCourse(studentList);
                break;
            case 4:
                System.out.println("Bye");
                break;
            default:
                System.out.println("Enter choice again");
        }
    }
    
}
