/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W8.Control;

import W8.Model.Course;
import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class NewClass {
    public static void main(String[] args) {
        ArrayList<Course> l = new ArrayList<>();
        ManageCourseInformationFunction g = new ManageCourseInformationFunction();
        g.addNewCourse(l);
        g.deleteCourse(l);
    }
}
