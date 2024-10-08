package W5.Model;

public class Person {

    private String id;
    private String fullName;
    private String phoneNumber;
    private String yearOfBirth;
    private String major;

    public Person() {
    }

    public Person(String id, String fullName, String phoneNumber, String yearOfBirth, String major) {
        this.id = id;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.yearOfBirth = yearOfBirth;
        this.major = major;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void displayTitle() {
        System.out.print("# - ID - Fullname - Phone number - Year of birth - Major");
    }

    public void display() {
        System.out.print("\n" + id + " - " + fullName + " - " + phoneNumber + " - " + yearOfBirth + " - " + major);
    }

}
