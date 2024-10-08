package Utils_CheckValid;

import java.util.Scanner;

public class Utils {

    static public String getValue(String input) {
        System.out.print(input);
        return new Scanner(System.in).nextLine();
    }

    static public String getValueTrueFalse(String input) {
        String check;
        while (true) {

            check = Utils.getValue(input);
            if (check.equals("Y") || check.equals("N") || check.equals("U") || check.equals("D")) {
                break;
            } else {
                System.out.println("Please enter Y/N");
            }
        }
        return check;
    }

    static public int getNumber(String input) {
        int num;
        while (true) {
            try {
                num = Integer.parseInt(Utils.getValue(input));
                break;
            } catch (Exception e) {
                System.out.println("Please enter number. Number is digit");
            }
        }
        return num;
    }

    static public double getNumberPositive(String input) {
        double num;
        while (true) {
            try {
                num = Double.parseDouble(Utils.getValue(input));
                if (num > 0) {
                    break;
                } else {
                    System.out.println("Number should greater than 0!");
                }

            } catch (Exception e) {
                System.out.println("Please enter number. Number is digit");
            }
        }
        return num;
    }

    static public int getNumberIntPositive(String input) {
        int num;
        while (true) {
            try {
                num = Integer.parseInt(Utils.getValue(input));
                if (num > 0) {
                    break;
                } else {
                    System.out.println("Number should greater than 0!");
                }

            } catch (Exception e) {
                System.out.println("Please enter number. Number is digit");
            }
        }
        return num;
    }

    static public String getOpearator(String input) {
        String defaultOperator = "+-*/^=";
        String operator;
        while (true) {
            operator = Utils.getValue(input);
            if (defaultOperator.contains(operator)) {
                return operator;
            } else {
                System.out.println("Please input (+, -, *, /, ^)");
            }
        }
    }
}
