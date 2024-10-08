package W5.Control;

import W5.Model.CheckValid;
import W5.Model.Person;
import W5.Model.Student;
import W5.Model.Teacher;
import W5.View.Menu;
import java.util.ArrayList;

public class StudentAndTeacherManager extends Menu {

    static String title = "*** Information Management ***";
    static String[] mchon = {"Teacher", "Student", "Person", "Exit"};
    static ArrayList<Person> listManagement;

    public StudentAndTeacherManager() {
        super(title, mchon);
        this.listManagement = new ArrayList<>();
    }

    @Override
    public void execute(int ch) {
        switch (ch) {
            case 1:
                teacher(1);
                break;
            case 2:
                student(2);
                break;
            case 3:
                person(3);
                break;
            case 4:

                break;
            default:
                System.out.println("Enter choice again!!!");
        }
    }

    public void teacher(int choice) {
        String[] sub = {"Input", "Print", "Exit"};
        Menu subMenu = new Menu("\n*** Teacher Management ***", sub) {
            @Override
            public void execute(int n) {
                switch (n) {
                    case 1: {
                        inputPerson(1);
                        break;
                    }
                    case 2: {
                        printPerson(1);
                        break;
                    }
                    case 3: {
                        System.out.println("Bye!!!");
                        break;
                    }
                    //...
                    default: {
                        System.out.println("Please. Enter Choice Again!!");
                        break;
                    }
                }
            }
        };
        subMenu.run();
    }

    public void student(int choice) {
        String[] sub = {"Input", "Print", "Exit"};
        Menu subMenu = new Menu("\n*** Student Management ***", sub) {
            @Override
            public void execute(int n) {
                switch (n) {
                    case 1: {
                        inputPerson(2);
                        break;
                    }
                    case 2: {
                        printPerson(2);
                        break;
                    }
                    case 3: {
                        System.out.println("Bye!!!");
                        break;
                    }
                    //...
                    default: {
                        System.out.println("Please. Enter Choice Again!!");
                        break;
                    }
                }
            }
        };
        subMenu.run();
    }

    public void person(int choice) {
        String[] sub = {"Search", "Print All", "Exit"};
        Menu subMenu = new Menu("\n*** Person Management ***", sub) {
            @Override
            public void execute(int n) {
                switch (n) {
                    case 1: {
                        searchPerson();
                        break;
                    }
                    case 2: {
                        printPerson(3);
                        break;
                    }
                    case 3: {
                        System.out.println("Bye!!!");
                        break;
                    }
                    //...
                    default: {
                        System.out.println("Please. Enter Choice Again!!");
                        break;
                    }
                }
            }
        };
        subMenu.run();
    }

    public static void inputPerson(int choice) {
        String id, fullName, phoneNumber, yearOfBirth, major, yearInTheProfession, contactType, salaryCoefficient, yearOfAdmission, entranceEnglishScore;
        while (true) {
            id = CheckValid.getValue("ID: ");
            if (CheckValid.checkID(id)) {
                break;
            }
        }
        while (true) {
            fullName = CheckValid.getValue("Fullname: ");
            if (CheckValid.checkFullName(fullName)) {
                fullName = CheckValid.normalizeName(fullName);
                break;
            }
        }
        while (true) {
            phoneNumber = CheckValid.getValue("Phone Number: ");
            if (CheckValid.checkPhoneNumber(phoneNumber)) {
                break;
            }
        }
        while (true) {
            yearOfBirth = CheckValid.getValue("Year Of Birth: ");
            if (CheckValid.checkYear(yearOfBirth)) {
                break;
            }
        }
        while (true) {
            major = CheckValid.getValue("Major: ");
            if (CheckValid.checkMajor(major)) {
                break;
            }
        }

        switch (choice) {
            case 1: {
                while (true) {
                    yearInTheProfession = CheckValid.getValue("Year In The Profession: ");
                    if (CheckValid.checkYearProfession(yearOfBirth, yearInTheProfession)) {
                        break;
                    }
                }
                while (true) {
                    contactType = CheckValid.getValue("Contact Type: ");
                    if (CheckValid.checkContactType(contactType)) {
                        break;
                    }
                }
                while (true) {
                    salaryCoefficient = CheckValid.getValue("Salary Coefficient: ");
                    if (CheckValid.checkPositiveNumber(salaryCoefficient)) {
                        break;
                    }
                }
                listManagement.add(new Teacher(id, fullName, phoneNumber, yearOfBirth, major, yearInTheProfession, contactType, salaryCoefficient));
            }
            break;
            case 2: {
                while (true) {
                    yearOfAdmission = CheckValid.getValue("Year Of Admission: ");
                    if (CheckValid.checkYearAdmission(yearOfBirth, yearOfAdmission)) {
                        break;
                    }
                }
                while (true) {
                    entranceEnglishScore = CheckValid.getValue("Entrance English Score: ");
                    if (CheckValid.checkEnglishScore(entranceEnglishScore)) {
                        break;
                    }
                }
                listManagement.add(new Student(id, fullName, phoneNumber, yearOfBirth, major, yearOfAdmission, entranceEnglishScore));
            }
            break;
        }
    }

    static public void printPerson(int choice) {
        switch (choice) {
            case 1: {
                new Teacher().displayTitle();
                for (Person x : listManagement) {
                    if (x instanceof Teacher) {
                        x.display();
                    }
                }
            }
            break;
            case 2: {
                new Student().displayTitle();
                for (Person x : listManagement) {
                    if (x instanceof Student) {
                        x.display();
                    }
                }
            }
            break;
            case 3: {
                new Person().displayTitle();
                for (Person x : listManagement) {
                    x.display();
                }
            }
            break;
        }
    }

    static public void searchPerson() {
        String searchName;
        while (true) {
            searchName = CheckValid.getValue("Fullname: ");
            if (CheckValid.checkFullName(searchName)) {
                searchName = CheckValid.normalizeName(searchName);
                break;
            }
        }
        new Person().displayTitle();
        for (Person x : listManagement) {
            if (x.getFullName().contains(searchName)) {
                x.display();
            }
        }
    }
}
