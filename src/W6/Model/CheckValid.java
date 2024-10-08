package W6.Model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckValid {

    public static boolean checkSizeNumberString(String input, int size) {
        if (!Pattern.matches("\\d{" + size + "}", input)) {
            System.err.println("Please. Enter ID Again. It must be " + size + " digits");
            return false;
        }
        return true;
    }

    public static String normalizeName(String input) {
        String output = "";
        String[] parts = input.trim().toLowerCase().replaceAll("[^a-z A-Z]", "").split("\\s+");
        for (String part : parts) {
            output += part.substring(0, 1).toUpperCase() + part.substring(1) + " ";
        }
        return output.trim();
    }

    public static boolean checkFullName(String input) {
        if (!Pattern.matches("^[a-zA-Z\\s]+$", input)) {
            System.err.println("Please. Enter Full Name Again. Data input is invalid");
            return false;
        }
        return true;
    }

    public static boolean checkPhoneNumber(String input) {
        Matcher matcher1 = Pattern.compile("^123[0-9]*$", Pattern.CASE_INSENSITIVE).matcher(input);
        Matcher matcher2 = Pattern.compile("^123-\\d{3}-\\d{4}$", Pattern.CASE_INSENSITIVE).matcher(input);
        Matcher matcher3 = Pattern.compile("^123.\\d{3}.\\d{4}$", Pattern.CASE_INSENSITIVE).matcher(input);
        Matcher matcher4 = Pattern.compile("^123 \\d{3} \\d{4}$", Pattern.CASE_INSENSITIVE).matcher(input);
        if (!matcher1.find() && !matcher2.find() && !matcher3.find() && !matcher4.find()) {
            System.out.println("Please input Phone flow \n"
                    + "• 1234567890 \n"
                    + "• 123-456-7890  \n"
                    + "• 123-456-7890 x1234 \n"
                    + "• 123.456.7890 \n"
                    + "• 123-456-7890 ext1234 \n"
                    + "• 123 456 7890 ");
            return false;

        }
        return true;
    }

    public static boolean checkInteger(String input) {
        try {
            Integer.parseInt(input);
        } catch (Exception e) {
            System.out.println("Id is digits");
            return false;
        }
        return true;
    }

    public static boolean checkCode(String code, ArrayList<Worker> list) {
        if (!code.trim().equals("W")) {
            for (Worker x : list) {
                if (x.getId().equals(code)) {
                    System.err.println("Code is duplicate");
                    return false;
                }
            }
        } else {
            System.err.println("Code is null");
            return false;
        }
        return true;
    }

    public static boolean checkNumberRange(String age, int max, int min) {
        int output;
        try {
            output = Integer.parseInt(age);
        } catch (Exception e) {
            System.err.println("Wrong format age");
            return false;
        }

        if (output > max || output < min) {
            System.err.println("Age must be in range " + min + " to " + max);
            return false;
        }
        return true;
    }

    public static boolean checkSalary(String salary) {
        double output;
        try {
            output = Double.parseDouble(salary);
        } catch (Exception e) {
            System.err.println("Wrong format ");
            return false;
        }

        if (output < 0) {
            System.err.println("Salary must be greater than 0");
            return false;
        }

        return true;
    }

    public static boolean checkDate(String input) {
        try {
            LocalDate.parse(input, DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
