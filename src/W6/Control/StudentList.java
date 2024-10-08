package W6.Control;

import W6.Model.CheckValid;
import W6.Model.GetInformation;
import W6.Model.Student;
import java.util.ArrayList;
import java.util.Collections;

public class StudentList {

    public static void addStudent(ArrayList<Student> studentList) {
        String name;
        float mark;
        String classes;
        String check;
        do {
            System.out.println("Please input student information");
            while (true) {
                name = GetInformation.getValue("Name: ");
                if (CheckValid.checkFullName(name)) {
                    break;
                } else {
                    System.out.println("Enter Name Again!!!");
                }
            }
            classes = GetInformation.getValue("Classes: ");
            while (true) {
                try {
                    mark = Float.parseFloat(GetInformation.getValue("Mark: "));
                    if (mark >= 0 && mark <= 100) {
                        break;
                    } else {
                        System.out.println("Enter mark again!!!");
                    }
                } catch (Exception e) {
                    System.out.println("Enter mark again!!!");
                }
            }
            studentList.add(new Student(name, mark, classes));

            while (true) {
                check = GetInformation.getValue("Do you want to enter more student information?(Y/N): ");
                if (check.equalsIgnoreCase("Y") || check.equalsIgnoreCase("N")) {
                    break;
                }
            }
        } while (check.equalsIgnoreCase("Y"));
    }

    public static void display(ArrayList<Student> studentList) {
        Collections.sort(studentList, (Student o1, Student o2) -> o1.getName().compareTo(o2.getName()));
        int i=0;
        for(Student x:studentList){
            i+=1;
            System.out.println("-------------Student "+i+"-------------");
            x.display();
        }
    }
}
