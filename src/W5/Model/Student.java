package W5.Model;

public class Student extends Person {

    private String yearOfAdmission;
    private String entranceEnglishScore;

    public Student() {
    }

    public Student(String id, String fullName, String phoneNumber, String yearOfBirth, String major,String yearOfAdmission, String entranceEnglishScore) {
        super(id, fullName, phoneNumber, yearOfBirth, major);
        this.yearOfAdmission = yearOfAdmission;
        this.entranceEnglishScore = entranceEnglishScore;
    }

    public String getYearOfAdmission() {
        return yearOfAdmission;
    }

    public void setYearOfAdmission(String yerOfAdmission) {
        this.yearOfAdmission = yerOfAdmission;
    }

    public String getEntranceEnglishScore() {
        return entranceEnglishScore;
    }

    public void setEntranceEnglishScore(String entranceEnglishScore) {
        this.entranceEnglishScore = entranceEnglishScore;
    }

    @Override
    public void displayTitle(){
        System.out.print("# - ID - Fullname - Phone number - Year of birth - Major - Year of admission -Entrance English score");
    }
    
    @Override
    public void display() {
        super.display();
        System.out.print(" - " + yearOfAdmission + " - " + entranceEnglishScore);
    }

}
