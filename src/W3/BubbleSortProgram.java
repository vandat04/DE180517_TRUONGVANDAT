
package W3;

import Utils_CheckValid.Menu;

public class BubbleSortProgram extends Menu {
    static String title = "\n========= Bubble Sort program =========";
    static String[] mchon = {"Input Element", "Sort Ascending", "Sort Descending", "Exit"};
    static Array list;
    static int size;

    public BubbleSortProgram() {
        super(title, mchon);
    }

    @Override
    public void execute(int ch) {
        switch (ch) {
            case 1:
                System.out.println("----- Input Element -----");
                size = Utils_CheckValid.Utils.getNumberIntPositive("Input Length Of Array\nInput number: ");
                list = new Array(size);
                list.fillArrayByHand();
                break;
            case 2:
                BubbleSortAlgorithm.bubbleSort(list, size);
                list.displayIncreArray();
                break;
            case 3:
                BubbleSortAlgorithm.bubbleSort(list, size);
                list.displayDecreArray();
                break;
            case 4:
                System.out.println("bye");
                break;
            default:
                System.out.println("Enter choice again!!!");
        }
    }
}
