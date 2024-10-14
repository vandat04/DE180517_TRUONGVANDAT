package W7;

import java.util.Scanner;

public class GetInformation {

    public static String getValue(String input) {
        System.out.print(input);
        return new Scanner(System.in).nextLine();
    }

    public static String getStringAndNormalize(String input) {
        String output;
        while (true) {
            output = getValue(input);
            if (CheckValid.checkFullName(output)) {
                break;
            }
        }
        return CheckValid.normalizeName(output);
    }

    public static String getPhoneNumber(String input) {
        String output;
        while (true) {
            output = getValue(input);
            if (CheckValid.checkPhoneNumber(output)) {
                break;
            }
        }
        return output;
    }
    
    public static String getInteger(String input) {
        String searchID;
        while (true) {
            searchID = getValue(input);
            if (CheckValid.checkInteger(searchID)) {
                break;
            }
        }
        return searchID;
    }
}
