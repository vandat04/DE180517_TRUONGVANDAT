package W2;

import Utils_CheckValid.Menu;

public class MenuCalculateNormalAndBMI extends Menu {

    static String title = "========= Calculator Program =========";
    static String[] mchon ={"Normal Calculator","BMI Calculator","Exit"};

    public MenuCalculateNormalAndBMI() {
        super(title, mchon);
    }
   
     @Override
    public void execute(int ch) {
        switch (ch) {
            case 1:
                CalculateNormalAndBMI.normalCalculator();
                break;
            case 2:
                CalculateNormalAndBMI.bmiCalculator();
                break;
            case 3:
                System.out.println("Bye!!!");
                break;
            default:
                System.out.println("Enter choice again!!!");
        }
    }
}
