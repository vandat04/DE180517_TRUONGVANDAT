package W1;

import java.util.HashMap;
import java.util.Map;

public class ChangeBaseNumberSystem {

    public static Map<Integer, String> mapHexa = new HashMap<>() {
        {
            put(0, "0");
            put(1, "1");
            put(2, "2");
            put(3, "3");
            put(4, "4");
            put(5, "5");
            put(6, "6");
            put(7, "7");
            put(8, "8");
            put(9, "9");
            put(10, "A");
            put(11, "B");
            put(12, "C");
            put(13, "D");
            put(14, "E");
            put(15, "F");
        }
    };

    public static Map<String, Integer> mapHexaReverse = new HashMap<>() {
        {
            for (Map.Entry<Integer, String> entry : mapHexa.entrySet()) {
                put(entry.getValue(), entry.getKey());
            }
        }
    };

    public static boolean checkDecimal(String input) {
        return input.matches("^[0-9]+$");
    }

    public static boolean checkBinary(String input) {
        return input.matches("^[0-1]+$");
    }

    public static boolean checkHexa(String input) {
        return input.matches("^[0-9A-F]+$");
    }

    public static int binaryDecimal(String input) {
        int num = 0, count = input.length() - 1;
        for (char c : input.toCharArray()) {
            num = (int) (num + (c - 48) * Math.pow(2, count));
            count -= 1;
        }
        return num;
    }

    public static String binaryHexa(String input) {
        int num = 0;
        double count = 0;
        String output = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            num = (int) (num + (input.charAt(i) - 48) * Math.pow(2, count));
            count += 1;
            if (count > 3) {
                output = mapHexa.get(num) + output;
                num = 0;
                count = 0;
            }
        }
       output = mapHexa.get(num)   + output;
        return output;
    }

    public static String decimalBinary(String input) {
        String output = "";
        int number = Integer.parseInt(input);
        do {
            output = number % 2 + output;
            number = number / 2;
        } while (number != 0);
        return output;
    }

    public static String decimalHexadecimal(String input) {
        int number = Integer.parseInt(input);
        String output = "";
        do {
            output = mapHexa.get(number % 16) + output;
            number = number / 16;
        } while (number != 0);
        return output;
    }

    public static String hexadecimalBinary(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            String checkLength = decimalBinary("" + mapHexaReverse.get(input.substring(i, i + 1)));
            while (checkLength.length() != 4) {
                checkLength = "0" + checkLength;
            }
            output += checkLength;
        }
        return output;
    }

    public static int hexadecimalDecimal(String input) {
        int output = 0, count = input.length() - 1;
        for (int i = 0; i < input.length(); i++) {
            String num = input.substring(i, i + 1);
            output = (int) (output + mapHexaReverse.get(num) * Math.pow(16, count));
            count -= 1;
        }
        return output;
    }
}
