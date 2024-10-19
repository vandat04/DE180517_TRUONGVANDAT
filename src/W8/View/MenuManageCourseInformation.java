package W8.View;

import W8.Control.ManageCourseInformationFunction;
import W8.Model.Course;
import java.util.ArrayList;

public class MenuManageCourseInformation extends Menu {
    
    static String title = "*** Course Management ***";
    static String[] mchon = {"Add online course/ offline course", "Update course", "Delete course", "Print all / online course / offline course", "Search information base on course name", "Exit"};
    static ArrayList<Course> list;
    static ManageCourseInformationFunction fn;
    
    public MenuManageCourseInformation() {
        super(title, mchon);
        list = new ArrayList<>();
        fn = new ManageCourseInformationFunction();
    }
    
    @Override
    public void execute(int ch) {
        switch (ch) {
            case 1:
                fn.addNewCourse(list);
                break;
            case 2:
                fn.updateCourse(list);
                break;
            case 3:
                fn.deleteCourse(list);
                break;
            case 4:
                fn.print(list);
                break;
            case 5:
                fn.search(list);
                break;
            case 6:
                System.out.println("Bye");
                break;
            
            default:
                System.out.println("Choice again");
        }
    }
}
