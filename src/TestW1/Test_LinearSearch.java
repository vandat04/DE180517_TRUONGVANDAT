
package TestW1;

import W1.LinearSearch;
import Utils_CheckValid.Utils;

public class Test_LinearSearch {
    public static void main(String[] args) {
        String size = Utils.getValue("Enter number of array: ");
        String searchValue = Utils.getValue("Enter search value: ");
        LinearSearch ls = new LinearSearch(Integer.parseInt(size), Integer.parseInt(searchValue) );
        ls.findValue();
    }
}
