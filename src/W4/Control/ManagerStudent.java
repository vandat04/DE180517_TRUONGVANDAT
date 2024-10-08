package W4.Control;

import W4.Model.StudentList;
import W4.View.Menu;

public class ManagerStudent extends Menu {

    static String title = "WELCOME TO STUDENT MANAGEMENT";
    static String[] mchon = {"Create", "Find and Sort", "Update/Delete", "Report", "Exit"};
    static StudentList studentList;
    

    public ManagerStudent() {
        super(title, mchon);
        studentList = new StudentList();
    }

    @Override
    public void execute(int ch) {
        switch (ch) {
            case 1: {
                studentList.createStudent();
            }
            break;
            case 2:
                studentList.findName();
                break;
            case 3:
                studentList.updateDelete();
                break;
            case 4:
                studentList.displayReport();
                break;
            case 5:
                System.out.println("Bye!!");
                break;
            default:
                System.out.println("Enter choice again!");
        }
    }

}
