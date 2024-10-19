package W8.Control;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CheckValid {

    public static String getValues(String input) {
        System.out.print(input);
        return new Scanner(System.in).nextLine();
    }

    public static boolean checkType(String type, String type1, String type2) {
        if (type.equalsIgnoreCase(type1) || type.equalsIgnoreCase(type2) || type.equalsIgnoreCase(type1.substring(0, 1)) || type.equalsIgnoreCase(type2.substring(0, 1))) {
            return true;
        }
        System.err.println("Data input is invalid");
        return false;
    }

    public static boolean checkNotEmpty(String input) {
        if (input.trim().equals("")) {
            System.err.println("Data input is invalid");
            return false;
        }
        return true;
    }

    public static boolean checkDate(String input) {
        LocalDate now = LocalDate.now();
        LocalDate current;
        try {
            current = LocalDate.parse(input, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            if (current.isBefore(now)) {
                System.err.println("Data input is invalid");
                return false;
            }
        } catch (Exception e) {
            System.err.println("Data input is invalid");
            return false;
        }
        return true;
    }

    public static boolean checkNumberRange(String input, int check) {
        int number;
        try {
            number = Integer.parseInt(input);
            if (number < 1) {
                System.err.println("Data input is invalid");
                return false;
            }
        } catch (Exception e) {
            System.err.println("Data input is invalid");
            return false;
        }
        return true;
    }

    public static boolean checkFormDate(String input) {
        LocalDate current;
        try {
            current = LocalDate.parse(input, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        } catch (Exception e) {
            System.err.println("Data input is invalid");
            return false;
        }
        return true;
    }
    
    public static boolean checkDateEnd(String num1, String num2) {
        LocalDate begin, end;
        begin = LocalDate.parse(num1, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        end = LocalDate.parse(num2, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        if (end.isBefore(begin)){
            System.err.println("Data input is invalid, end must be after begin");
                return false;
        }
        return true;
    }
}
