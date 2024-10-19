package W8.Model;

public class OfflineCourse extends Course {

    private String begin, end, campus;

    public OfflineCourse(String begin, String end, String campus, String courseID, String courseName, String credits) {
        super(courseID, courseName, credits);
        this.begin = begin;
        this.end = end;
        this.campus = campus;
    }

    public OfflineCourse() {
        this.begin = "";
        this.end = "";
        this.campus = "";
    }

    public String getBegin() {
        return begin;
    }

    public void setBegin(String begin) {
        this.begin = begin;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    @Override
    public String toString() {
        return super.toString() + "Begin: " + begin + "\n"
                + "End: " + end + "\n"
                + "Campus: " + campus;
    }

}
