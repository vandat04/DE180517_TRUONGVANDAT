package W3;

public class BinarySearchAlgorithm {

    static int size,search;

    public static void binarySearch() {
        size = Utils_CheckValid.Utils.getNumberIntPositive("Enter the number of array: ");
        Array arr = new Array(size);
        arr.fillArray();
        arr = BubbleSortAlgorithm.bubbleSort(arr, size);
        search = Utils_CheckValid.Utils.getNumber("Enter search value: ");
        System.out.print("\nSorted: ");
        arr.displayArray();
        recursive(arr, 0, size - 1, search, 0);
    }

    public static void recursive(Array array, int first, int last, int x, int c) {
        if (last >= first) {
            int mid = first + (last - first) / 2;

            if (array.getEachArr(mid) == x) {
                c += 1;
                recursive(array, first, mid - 1, array.getEachArr(mid), c);
                recursive(array, mid + 1, last, array.getEachArr(mid), c);
                System.out.print("Found " + x + " index: " + mid + "        ");
            } else if (array.getEachArr(mid) > x) {
                recursive(array, first, mid - 1, x, c);
            } else {
                recursive(array, mid + 1, last, x, c);
            }
        }
        if (c == 0 && first > last) {
            System.out.println("\nFound: " + x + " Not exist!");
        }
    }
}
