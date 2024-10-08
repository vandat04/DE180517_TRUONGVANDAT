package W5.Model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckValid {

    public static String getValue(String input) {
        System.out.print(input);
        return new Scanner(System.in).nextLine();
    }

    public static boolean checkID(String input) {
        if(!Pattern.matches("\\d{6}", input)){
            System.err.println("Please. Enter ID Again. It must be 6 digits");
            return false;
        }
        return true;
    }
    
    public static boolean checkPhoneNumber(String input) {
        if(!Pattern.matches("\\d{12}", input)){
            System.err.println("Please. Enter Phone Number Again. It must be 12 digits");
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
        if(!Pattern.matches("^[a-zA-Z\\s]+$", input)){
            System.err.println("Please. Enter Phone Full Name Again. Data input is invalid");
            return false;
        }
        return true;
    }

    public static boolean checkYear(String input) {
        int year;
        try {
            year = Integer.parseInt(input);
            if (year > LocalDate.now().getYear() || year < 0) {
                System.err.println("Please. Enter Again. Year Should Less Than Current Year or Greater Than 0");
                return false;
            }
        } catch (Exception e) {
            System.err.println("Please. Enter Year Again. Wrong Format");
            return false;
        }
        return true;
    }

    public static boolean checkMajor(String input) {
        if(input.length() > 30){
            System.err.println("Please. Enter Again. It must be less than 30 characters");
            return false;
        }
        return true;
    }

    public static boolean checkYearProfession(String yearOfBirth, String input) {
        int yearBirth = Integer.parseInt(yearOfBirth);
        double yearProfe;
        try {
            yearProfe = Double.parseDouble(input);
            if (LocalDate.now().getYear() - yearBirth < yearProfe || yearProfe < 0) {
                System.err.println("Please. Enter Again. Year Of Profession Should Be Less Than Age or Greater Than 0");
                return false;
            }
        } catch (Exception e) {
            System.err.println("Please. Enter Year Of Profession Again!");
            return false;
        }
        return true;
    }

    public static boolean checkContactType(String input) {
        if (!input.equals("Long") && !input.equals("Short")) {
            System.err.println("Please. Enter Again. Just Long or Short");
            return false;
        }
        return true;
    }
    
    public static boolean checkYandN(String input) {
        if (!input.equalsIgnoreCase("Y") && !input.equalsIgnoreCase("N")) {
            System.err.println("Please. Enter Again. Just Y or N");
            return false;
        }
        return true;
    }

    public static boolean checkPositiveNumber(String input) {
        try {
            double number = Double.parseDouble(input);
            if (number <= 0) {
                System.err.println("Please. Enter Number Again. It Should Be Greater Than 0");
                return false;
            }
        } catch (Exception e) {
            System.err.println("Please. Enter Number Again. Wrong format");
            return false;
        }
        return true;
    }

    public static boolean checkYearAdmission(String yearOfBirth, String input) {
        if (!checkYear(input)) {
            return false;
        }
        int yearBirth = Integer.parseInt(yearOfBirth);
        int yearAdmission = Integer.parseInt(input);
        if (yearBirth >= yearAdmission){
            System.err.println("Please. Enter Again. Year Admission Should Be Greater Than Year Of Birth");
            return false;
        }
        return true;
    }
    
    public static boolean checkEnglishScore(String input){
        if (!CheckValid.checkPositiveNumber(input)) return false; 
        if (Double.parseDouble(input)>100) {
            System.err.println("Please. Enter Again. Score Should Be Less Than 100");
            return false;
        }
        return true;
    }
    
    public static boolean checkRoomNumbers(String input){
        if(!Pattern.matches("\\d{1,4}", input)){
            System.err.println("Please. Enter Phone Number Again. It just 1 - 4 digits");
            return false;
        }
        return true;
    }
    
    public static boolean checkDateForBooking(String input){
        LocalDateTime currentDate = LocalDateTime.now();
        LocalDateTime output; 
        try {
            output = LocalDateTime.parse(input, DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mma"));
            if (output.compareTo(currentDate) < 0 ) {
                System.err.println("Please. Enter Again. Date must be after present");
                return false;
            } 
        } catch (Exception e) {
            System.err.println("Please. Enter Again. Date wrong format(dd/MM/yyyy hh:mma)");
            return false;
        }
        return true;
    }
    
    public static boolean checkPickUpTime(String bookingDate, String input){
        LocalDateTime currentDate = LocalDateTime.now();
        LocalDateTime bookingTime = LocalDateTime.parse(bookingDate, DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mma"));
        LocalDateTime output; 
        try {
            output = LocalDateTime.parse(input, DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mma"));
            if (output.compareTo(currentDate) < 0 || output.compareTo(bookingTime) > 0) {
                System.err.println("Please. Enter Again. Date must be after present and before booking date");
                return false;
            } 
        } catch (Exception e) {
            System.err.println("Please. Enter Again. Date wrong format(dd/MM/yyyy hh:mma)");
            return false;
        }
        return true;
    }
}
