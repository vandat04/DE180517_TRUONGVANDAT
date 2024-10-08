/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W6.View;

import W6.Control.StudentList;
import W6.Model.Student;
import java.util.ArrayList;

/**
 *
 * @author dattr
 */
public class StudentManager extends Menu{
    static public String title = "Student Manager";
    static public String[] mchon ={"Add Student","Display","Exit"};
    static public ArrayList<Student> studentList;

    public StudentManager() {
        super(title, mchon);
        studentList = new ArrayList();
    }

    
    @Override
    public void execute(int ch) {
        switch (ch) {
            case 1:
                StudentList.addStudent(studentList);
                break;
            case 2:
                StudentList.display(studentList);
                break;
            case 3:
                System.out.println("Bye");
                break;    
            default:
                System.out.println("Enter Again");
        }
    }
    
}
