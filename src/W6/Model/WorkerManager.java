/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W6.Model;

import W6.View.Menu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author dattr
 */
public class WorkerManager extends Menu {

    private static List<Worker> workerList;
    static String title = "===========Worker Management===========";
    static String[] mchon = {"Add Worker", "Up Salary", "Down Salary", "Display Information salary", "Exit"};

    public WorkerManager() {
        super(title, mchon);
        workerList = new ArrayList<>();
    }
    

    @Override
    public void execute(int ch) {
        switch (ch) {
            case 1:
                System.out.println("--------------Add worker----------------");
                addWoker();
                break;
            case 2:
                System.out.println("--------------Up Salary------------------");
                upSalary();
                break;
            case 3:
                System.out.println("--------------Down Salary------------------");
                downSalary();
                break;
            case 4:
                System.out.println("----------Display Information Salary-----------------");
                displaySalaryHistory();
                break;
            case 5:
                System.out.println("Bye!");
                break;

            default:
                System.out.println("Enter choice again");
        }
    }
    
    public static void addWoker() {
        String idDefault = "W ";
        String id = idDefault + GetInformation.getValue("Enter Code: ");
        String name = GetInformation.getValue("Enter Name: ");
        String age = GetInformation.getValue("Enter Age: ");
        String salary = GetInformation.getValue("Enter Salary: ");
        String workLocation = GetInformation.getValue("Enter Work Location: ");
        boolean check = true;
        if (!CheckValid.checkFullName(name)) {
            check = false;
        }
        if (!CheckValid.checkCode(id, (ArrayList<Worker>) workerList)) {
            check = false;
        }
        if (!CheckValid.checkNumberRange(age,50,18)) {
            check = false;
        }
        if (!CheckValid.checkSalary(salary)) {
            check = false;
        }
        if (check == false) {
            System.err.println("Add worker fail");
        } else {
            workerList.add(new Worker(id, name, age, salary, workLocation, "0"));
            System.out.println("Add successful");
        }
    }
    public static void upSalary() {
        String id = "W " + GetInformation.getValue("Enter Code: ");
        String amount = GetInformation.getValue("Enter Salary: ");
        changeSalary("Up", id, amount);
    }

    public static void downSalary() {
        String id = "W " + GetInformation.getValue("Enter Code: ");
        String amount = GetInformation.getValue("Enter Salary: ");
        changeSalary("Down", id, amount);
    }

    public static boolean changeSalary(String status, String code, String amount) {
        if (!CheckValid.checkSalary(amount)) {
            return false;
        }

        if (status.equals("Up")) {
            for (Worker x : workerList) {
                if (x.getId().equals(code)) {
                    double newSalary = Double.parseDouble(x.getSalary()) + Double.parseDouble(amount);
                    x.setSalary("" + newSalary);
                    x.setStatus(status);
                    x.setDate();
                    System.out.println("Change successful");
                    return true;
                }
            }
            System.err.println("The id not exist");
            return false;
        }
        if (status.equals("Down")) {
            for (Worker x : workerList) {
                if (x.getId().equals(code)) {
                    double newSalary = Double.parseDouble(x.getSalary()) - Double.parseDouble(amount);
                    x.setSalary("" + newSalary);
                    x.setStatus(status);
                    x.setDate();
                    System.out.println("Change successful");
                    return true;
                }
            }
            System.err.println("The id not exist");
            return false;
        }
        return false;
    }

    public static void displaySalaryHistory() {
        System.out.printf("%-5s %-10s %-5s %-10s %-5s %-10s%n", "Code", "Name", "Age", "Salary", "Status", "Date");
        
        Collections.sort(workerList, new Comparator<Worker>() {
            @Override
            public int compare(Worker w1, Worker w2) {
                return w1.getId().compareTo(w2.getId());
            }
        });
        
        for (Worker x : workerList) {
            x.display();
        }
    }
}
