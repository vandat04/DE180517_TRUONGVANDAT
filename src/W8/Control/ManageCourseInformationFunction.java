package W8.Control;

import W8.Model.Course;
import W8.Model.OfflineCourse;
import W8.Model.OnlineCourse;
import java.util.ArrayList;

public class ManageCourseInformationFunction {

    public void addNewCourse(ArrayList<Course> list) {
        System.out.println("*** Add new course ***");
        String checkType;
        while (true) {
            checkType = CheckValid.getValues("Online (O) or Offline (F): ");
            if (CheckValid.checkType(checkType, "O", "F")) {
                break;
            }
        }
        String credits, courseID, courseName, platform, instructors, note, begin, end, campus;

        while (true) {
            boolean checkID = false;
            courseID = CheckValid.getValues("Course ID: ");
            if (CheckValid.checkNotEmpty(courseID)) {
                checkID = true;
                for (Course x : list) {
                    if (courseID.equals(x.getCourseID())) {
                        System.err.println("Data input is invalid, ID must be unique");
                        checkID = false;
                        break;
                    }
                }
            }
            if (checkID == true) {
                break;
            }
        }

        courseName = CheckValid.getValues("Course Name: ");

        while (true) {
            try {
                credits = CheckValid.getValues("Credits: ");
                if (CheckValid.checkNumberRange(credits, 1)) {
                    break;
                }
            } catch (Exception e) {
                System.err.println("Data input is invalid");
            }
        }

        if (checkType.equalsIgnoreCase("O")) {
            while (true) {
                platform = CheckValid.getValues("Platforms: ");
                if (CheckValid.checkNotEmpty(platform)) {
                    break;
                }
            }
            instructors = CheckValid.getValues("Instructors: ");
            while (true) {
                note = CheckValid.getValues("Note: ");
                if (CheckValid.checkNotEmpty(note)) {
                    break;
                }
            }
            list.add(new OnlineCourse(platform, instructors, note, courseID, courseName, credits));
        } else {
            while (true) {
                begin = CheckValid.getValues("Begin: ");
                if (CheckValid.checkFormDate(begin)) {
                    break;
                }
            }
            while (true) {
                end = CheckValid.getValues("End: ");
                if (CheckValid.checkFormDate(end)) {
                    if (CheckValid.checkDateEnd(begin, end)) {
                        break;
                    }
                }
            }
            campus = CheckValid.getValues("Campus: ");
            list.add(new OfflineCourse(begin, end, campus, courseID, courseName, credits));
        }
    }

    public void updateCourse(ArrayList<Course> list) {
        System.out.println("*** Update course ***");
        String checkContinue = "Y";
        String courseID;
        boolean checkID = true;

        while (checkContinue.equalsIgnoreCase("Y")) {
            courseID = CheckValid.getValues("Course ID: ");
            for (Course x : list) {
                if (x.getCourseID().equals(courseID)) {
                    System.out.println("*** Search results ***");
                    System.out.println(x.toString());
                    System.out.println("*** Updating ***\n"
                            + "Note: Enter empty if you don't want to change it.");

                    String id = CheckValid.getValues("Course ID: ");
                    if (!id.trim().equals("")) {
                        x.setCourseID(id);
                    }
                    String name = CheckValid.getValues("Course Name: ");
                    if (!name.trim().equals("")) {
                        x.setCourseName(name);
                    }
                    String credit;
                    while (true) {
                        credit = CheckValid.getValues("Credits: ");
                        if (CheckValid.checkNumberRange(credit, 1)) {
                            x.setCredits(credit);
                            break;
                        }
                        if (credit.trim().equals("")) {
                            break;
                        }
                    }
                    if (x instanceof OnlineCourse) {
                        String plat = CheckValid.getValues("Platform: ");
                        if (!plat.trim().equals("")) {
                            ((OnlineCourse) x).setPlatform(plat);
                        }
                        String ins = CheckValid.getValues("Instructors: ");
                        if (!ins.trim().equals("")) {
                            ((OnlineCourse) x).setInstructors(ins);
                        }
                        String not = CheckValid.getValues("Note: ");
                        if (!not.trim().equals("")) {
                            ((OnlineCourse) x).setNote(not);
                        }
                        System.out.println("Updated successfully");
                    }
                    if (x instanceof OfflineCourse) {
                        String begin = CheckValid.getValues("Begin: ");
                        if (!begin.trim().equals("")) {
                            ((OfflineCourse) x).setBegin(begin);
                        }
                        String end = CheckValid.getValues("End: ");
                        if (!end.trim().equals("")) {
                            ((OfflineCourse) x).setEnd(end);
                        }
                        String campus = CheckValid.getValues("Campus: ");
                        if (!campus.trim().equals("")) {
                            ((OfflineCourse) x).setCampus(campus);
                        }
                        System.out.println("Updated successfully");
                    }
                    break;
                } else {
                    checkID = false;
                }
            }

            if (checkID == false) {
                while (true) {
                    checkContinue = CheckValid.getValues("No data found, do you want to find again? (Y/N): ");
                    if (CheckValid.checkType(checkContinue, "Y", "N")) {
                        break;
                    }
                }
            } else {
                checkContinue = "N";
            }
        }
    }

    public void deleteCourse(ArrayList<Course> list) {
        System.out.println("*** Delete course ***");
        String courseID;
        boolean checkID;
        String checkContinue;
        do {
            checkID = false;
            courseID = CheckValid.getValues("Course ID: ");
            for (Course x : list) {
                if (x.getCourseID().equals(courseID)) {
                    checkID = true;
                    list.remove(x);
                    break;
                }
            }
            if (checkID == false) {
                while (true) {
                    checkContinue = CheckValid.getValues("No data found, do you want to find again? (Y/N): ");
                    if (CheckValid.checkType(checkContinue, "Y", "N")) {
                        break;
                    }
                }
            } else {
                break;
            }
        } while (checkContinue.equalsIgnoreCase("y"));

    }

    public void print(ArrayList<Course> list) {
        String choice = CheckValid.getValues("Do you want to print all (A), online course (O) or offline course (F): ");
        if (choice.equalsIgnoreCase("A")) {
            System.out.println("Course ID-Course name-Credits");
            for (Course x : list) {
                System.out.println(x.getCourseID() + "-" + x.getCourseName() + "-" + x.getCredits());
            }
        }
        if (choice.equalsIgnoreCase("O")) {
            System.out.println("Course ID-Course name-Credits-Platform-Instructors-Note");
            for (Course x : list) {
                if (x instanceof OnlineCourse) {
                    System.out.println(x.getCourseID() + "-" + x.getCourseName() + "-" + x.getCredits() + "-" + ((OnlineCourse) x).getPlatform() + "-" + ((OnlineCourse) x).getInstructors() + "-" + ((OnlineCourse) x).getNote());
                }
            }
        }
        if (choice.equalsIgnoreCase("F")) {
            System.out.println("Course ID-Course name-Credits-Begin-End-Campus");
            for (Course x : list) {
                if (x instanceof OfflineCourse) {
                    System.out.println(x.getCourseID() + "-" + x.getCourseName() + "-" + x.getCredits() + "-" + ((OfflineCourse) x).getBegin() + "-" + ((OfflineCourse) x).getEnd() + "-" + ((OfflineCourse) x).getCampus());
                }
            }
        }
    }

    public void search(ArrayList<Course> list) {
        System.out.println("*** Searching ***");
        String courseID;
        boolean checkID;
        String checkContinue;
        do {
            checkID = false;
            courseID = CheckValid.getValues("Course ID: ");
            for (Course x : list) {
                if (x.getCourseID().equals(courseID)) {
                    checkID = true;
                    System.out.println(x.toString());
                    break;
                }
            }
            if (checkID == false) {
                while (true) {
                    checkContinue = CheckValid.getValues("No data found, do you want to find again? (Y/N): ");
                    if (CheckValid.checkType(checkContinue, "Y", "N")) {
                        break;
                    }
                }
            } else {
                break;
            }
        } while (checkContinue.equalsIgnoreCase("y"));
    }
}
