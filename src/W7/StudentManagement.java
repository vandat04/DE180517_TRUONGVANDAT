package W7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StudentManagement {

    public static void createStudent(ArrayList<Student> studentList) {
        String studentName, className, math, physical, chemistry, check = "Y";
        while (check.equalsIgnoreCase("Y")) {
            studentName = GetInformation.getStringAndNormalize("Name: ");
            className = GetInformation.getValue("Class: ");
            while (true) {
                math = GetInformation.getValue("Maths: ");
                if (CheckValid.checkDoubleRange(math, 0, 10)) {
                    break;
                }
            }
            while (true) {
                physical = GetInformation.getValue("Physical: ");
                if (CheckValid.checkDoubleRange(math, 0, 10)) {
                    break;
                }
            }
            while (true) {
                chemistry = GetInformation.getValue("Chemistry: ");
                if (CheckValid.checkDoubleRange(math, 0, 10)) {
                    break;
                }
            }
            studentList.add(new Student(studentName, className, Double.parseDouble(math), Double.parseDouble(physical), Double.parseDouble(chemistry)));
            check = "";
            while (!check.equalsIgnoreCase("Y") && !check.equalsIgnoreCase("N")) {
                check = GetInformation.getValue("Do you want to enter more student information(Y/N): ");
            }
        }
    }

    public static void studentClassification(ArrayList<Student> studentList) {
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println("------ Student" + (i + 1) + " Info ------");
            studentList.get(i).display();
        }
    }

    public static void statisticsCourse(ArrayList<Student> studentList) {
        Map<String, Double> statistics = new HashMap<>();
        statistics.put("A",0.0);
        statistics.put("B",0.0);
        statistics.put("C",0.0);
        statistics.put("D",0.0);
        for (Student x : studentList) {
            statistics.compute(x.getType(), (key, value) -> (value == null) ? 1 : value + 1);
        }
        for (Map.Entry<String, Double> entry : statistics.entrySet()) {
            System.out.println(entry.getKey() + ": " + GetInformation.getDecimal((entry.getValue() / studentList.size() * 100)) + "%");
        }
    }

}
