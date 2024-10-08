package W1;

import Utils_CheckValid.Menu;
import java.util.ArrayList;
import java.util.List;

public class MenuSolvingTheEquation extends Menu {

    static String title = "========= Equation Program =========";
    static String[] arr = {"Calculate Superlative Equation", "Calculate Quadratic Equation", "Exit"};
    List<Float> results;
    List<Float> listNumber;

    public MenuSolvingTheEquation() {
        super(title, arr);
        results = new ArrayList<>();
    }

    @Override
    public void execute(int ch) {
        switch (ch) {
            case 1:{
                float a = Utils_CheckValid.Utils.getNumber("Enter A: ");
                float b = Utils_CheckValid.Utils.getNumber("Enter B: ");
                listNumber = new ArrayList<>();
                listNumber.add(a); listNumber.add(b);
                Number nu = new Number(a, b);
                results = nu.calculateEquation();
                System.out.println("Solution: "+results);
                nu.checkOddAndEven(listNumber);
                nu.isPerfectSquare(listNumber);
            }
                break;
            case 2:{
                float a = Utils_CheckValid.Utils.getNumber("Enter A: ");
                float b = Utils_CheckValid.Utils.getNumber("Enter B: ");
                float c = Utils_CheckValid.Utils.getNumber("Enter C: ");
                listNumber = new ArrayList<>();
                listNumber.add(a); listNumber.add(b); listNumber.add(c);
                Number nu = new Number(a, b, c);
                results = nu.calculateQuadraticEquation();
                System.out.println("Solution: "+results);
                nu.checkOddAndEven(listNumber);
                nu.isPerfectSquare(listNumber);
            }
                break;
            case 3:
                System.out.println("Bye");
                break;
            default:
                System.out.println("Enter choose again");
        }
    }

}
