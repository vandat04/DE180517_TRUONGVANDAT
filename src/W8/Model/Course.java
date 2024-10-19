package W8.Model;

public class Course {

    protected String courseID, courseName;
    protected String credits;

    public Course(String courseID, String courseName, String credits) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.credits = credits;
    }

    public Course() {
        this.courseID = "";
        this.courseName = "";
        this.credits = "1";
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCredits() {
        return credits;
    }

    public void setCredits(String credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Course ID: " + courseID + "\n"
                + "Course name: " + courseName + "\n"
                + "Credits: " + credits+"\n";
    }

}
