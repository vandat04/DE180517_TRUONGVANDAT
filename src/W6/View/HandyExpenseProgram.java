/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W6.View;

import W6.Control.HandyExpenseManager;
import W6.Model.Expense;
import java.util.ArrayList;

/**
 *
 * @author dattr
 */
public class HandyExpenseProgram extends Menu {

    static String title = "=======Handy Expense program======";
    static String[] mchon = {"Add an expense", "Display all expenses", "Delete an expense", "Quit"};
    static ArrayList<Expense> handyList;

    public HandyExpenseProgram() {
        super(title, mchon);
        handyList = new ArrayList<>();
    }

    @Override
    public void execute(int ch) {
        switch (ch) {
            case 1:
                HandyExpenseManager.addExpense(handyList);
                break;
            case 2:
                HandyExpenseManager.displayAll(handyList);
                break;
            case 3:
                HandyExpenseManager.delete(handyList);
                break;
            case 4:
                System.out.println("Bye");
                break;
            default:
                System.out.println("Enter choice again!!!");
        }
    }

}
