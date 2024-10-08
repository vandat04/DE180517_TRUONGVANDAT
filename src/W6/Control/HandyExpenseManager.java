package W6.Control;

import W6.Model.CheckValid;
import W6.Model.Expense;
import W6.Model.GetInformation;
import java.util.ArrayList;

public class HandyExpenseManager {

    public static void addExpense(ArrayList<Expense> handyList) {
        System.out.println("-------- Add an expense--------");
        int id = handyList.size() + 1;
        String date;
        while (true) {
            date = GetInformation.getValue("Enter Date: ");
            if (CheckValid.checkDate(date)) {
                break;
            } else {
                System.out.println("Enter date again!!!");
            }
        }
        double amount;
        while (true) {
            String number;
            try {
                number = GetInformation.getValue("Enter Amount: ");
                if (CheckValid.checkSalary(number)) {
                    amount = Double.parseDouble(number);
                    break;
                } else {
                    System.out.println("Enter again");
                }
            } catch (Exception e) {
                System.out.println("Enter amount again");
            }
        }

        String content = GetInformation.getValue("Enter Content: ");
        handyList.add(new Expense(id, date, amount, content));
    }

    public static void displayAll(ArrayList<Expense> handyList) {
        double total = 0;
        System.out.println("---------Display all expenses------------");
        System.out.printf("%-5s     %-15s       %-5s        %-10s%n", "ID", "Date", "Amount", "Content");
        for (Expense x : handyList) {
            x.display();
            total += x.getNumber();
        }
        System.out.println("Total: " + total);
    }

    public static void delete(ArrayList<Expense> handyList) {
        System.out.println("--------Delete an expense------");
        int id = Integer.parseInt(GetInformation.getValue("Enter ID: "));
        boolean check = false;
        for (Expense x : handyList) {
            if (x.getId() == id) {
                handyList.remove(x);
                check = true;
                break;
            }
        }
        if (check == false) {
            System.out.println("Delete an expense fail");
        } else {
            System.out.println("Delete an expense successful");
        }
    }
}
