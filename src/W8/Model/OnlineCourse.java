package W8.Model;

public class OnlineCourse extends Course {

    private String platform, instructors, note;

    public OnlineCourse(String platform, String instructors, String note, String courseID, String courseName, String credits) {
        super(courseID, courseName, credits);
        this.platform = platform;
        this.instructors = instructors;
        this.note = note;
    }

    public OnlineCourse() {
        this.platform = "";
        this.instructors = "";
        this.note = "";
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getInstructors() {
        return instructors;
    }

    public void setInstructors(String instructors) {
        this.instructors = instructors;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return super.toString() + "Platform: "+platform+"\n"
                + "Instructors: "+instructors+"\n"
                + "Note: "+note;
    }

}
