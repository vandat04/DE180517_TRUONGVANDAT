package W3;

public class BubbleSortAlgorithm {

    static int temp;
    static boolean check;

    static public void inAndOut() {
        int size = Utils_CheckValid.Utils.getNumberIntPositive("Enter the number of array: ");
        Array arr = new Array(size);
        arr.fillArray();
        System.out.print("Unsorted: ");
        arr.displayArray();
        arr= bubbleSort(arr,size);
        System.out.print("\nSorted: ");
        arr.displayArray();
    }

    static public Array bubbleSort(Array arr,int size) {
        for (int i = 0; i < size - 1; i++) {
            check = false;
            for (int j = 0; j < size - i - 1; j++) {
                if (arr.getEachArr(j) > arr.getEachArr(j + 1)) {
                    check = true;
                    temp = arr.getEachArr(j);
                    arr.setArr(j, arr.getEachArr(j + 1));
                    arr.setArr(j + 1, temp);
                }
            }
            if (check == false) {
                break;
            }
        }
        return arr;
    }
}
