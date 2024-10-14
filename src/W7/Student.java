
package W7;

public class Student {

    private String studentName;
    private String className;
    private double math, physical, chemistry;

    public Student(String studentName, String className, double math, double physical, double chemistry) {
        this.studentName = studentName;
        this.className = className;
        this.math = math;
        this.physical = physical;
        this.chemistry = chemistry;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getPhysical() {
        return physical;
    }

    public void setPhysical(double physical) {
        this.physical = physical;
    }

    public double getChemistry() {
        return chemistry;
    }

    public void setChemistry(double chemistry) {
        this.chemistry = chemistry;
    }
    
}
