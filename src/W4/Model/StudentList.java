package W4.Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

public class StudentList implements Comparator<Student> {

    static ArrayList<Student> studentList = new ArrayList<>();

    //Create;
    public void createStudent() {
        while (true) {
            int studentID = studentID = Utils_CheckValid.Utils.getNumber("Enter Student ID: ");
            String studentName = Utils_CheckValid.Utils.getValue("Enter Student Name: ");
            int semester = Utils_CheckValid.Utils.getNumberIntPositive("Enter Semester: ");
            String courseName = Utils_CheckValid.Utils.getValue("Enter Course Name: ");
            studentList.add(new Student(studentID, studentName, semester, courseName));
            if (studentList.size() >= 3) {
                String check = Utils_CheckValid.Utils.getValueTrueFalse("Do you want to continue (Y/N)?");
                if (check.equals("N")) {
                    break;
                }
            }
        }
    }

    //Find/Sort
    public void findName() {
        Collections.sort(studentList, new StudentList());
        String searchName = Utils_CheckValid.Utils.getValue("Enter Name Want To Find: ");
        System.out.printf("%-10s  | %-8s  | %-10s%n", "Student Name", "Semester", "Course Name");
        for (Student x : studentList) {
            if (x.getStudentName().contains(searchName)) {
                x.displayStudent();
            }
        }
    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getStudentName().compareTo(o2.getStudentName());
    }

    //UpdateOrDelete
    public void updateDelete() {
        int studentID = Utils_CheckValid.Utils.getNumberIntPositive("Enter ID Want To Find: ");
        int checkIndex = -1;

        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getStudentID() == studentID) {
                checkIndex = i;
            }
        }
        if (checkIndex == -1) {
            System.out.println("Not Found Student ID");
        } else {
            String choose = Utils_CheckValid.Utils.getValueTrueFalse("Do you want to update (U) or delete (D) student: ");
            switch (choose) {
                case "U":
                    studentList.get(checkIndex).setSemester(Utils_CheckValid.Utils.getNumberIntPositive("Enter New Seamester: "));
                    studentList.get(checkIndex).setCourseName(Utils_CheckValid.Utils.getValue("Enter New Course Name: "));
                    break;
                case "D":
                    studentList.remove(checkIndex);
                    break;
            }
        }
    }

    public Map<String, Integer> statisticsCourse() {
        Map<String, Integer> statistics = new LinkedHashMap<>();
        for (Student x : studentList) {
            String name_course_Student = x.getStudentID() + " " + x.getStudentName() + " | " + x.getCourseName();
            statistics.compute(name_course_Student, (key, value) -> (value == null) ? 1 : value + 1);
        }
        return statistics;
    }

    public void displayReport() {
        Map<String, Integer> report = statisticsCourse();
        for (Map.Entry<String, Integer> entry : report.entrySet()) {
            String key = entry.getKey().substring(entry.getKey().indexOf(" "));
            System.out.println(key + "| " + entry.getValue());
        }
    }
}
