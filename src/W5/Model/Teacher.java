package W5.Model;

public class Teacher extends Person {

    private String yearInTheProfession;
    private String contractType;
    private String salaryCoefficient;

    public Teacher() {
    }

    public Teacher(String id, String fullName, String phoneNumber, String yearOfBirth, String major,String yearInTheProfession, String contractType, String salaryCoefficient) {
        super(id, fullName, phoneNumber, yearOfBirth, major);
        this.yearInTheProfession = yearInTheProfession;
        this.contractType = contractType;
        this.salaryCoefficient = salaryCoefficient;
    }

    public String getYearInTheProfession() {
        return yearInTheProfession;
    }

    public void setYearInTheProfession(String yearInTheProfession) {
        this.yearInTheProfession = yearInTheProfession;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public String getSalaryCoefficient() {
        return salaryCoefficient;
    }

    public void setSalaryCoefficient(String salaryCoefficient) {
        this.salaryCoefficient = salaryCoefficient;
    }

    @Override
    public void displayTitle() {
        System.out.print("# - ID - Fullname - Phone number - Year of birth - Major - Year in theprofession - Contract type - Salary coefficient");
    }

    @Override
    public void display() {
        super.display();
        System.out.print(" - " + yearInTheProfession + " - " + contractType + " - " + salaryCoefficient);
    }

}
