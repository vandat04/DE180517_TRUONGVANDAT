
package W3;

public class QuickSortAlgorithm {
    static Array arr;
    static int size, temp;
    static boolean check;
    
    
    public static void quickSort(){
        size = Utils_CheckValid.Utils.getNumberIntPositive("Enter the number of array: ");

        arr = new Array(size);
        arr.fillArray();
        System.out.print("Unsorted: " ); arr.displayArray();
        recursive(arr, 0, size - 1);
        System.out.print("\nSorted: " ); arr.displayArray();
        
    }
    
    public static int sort(Array array, int left, int right) {
        int pivot = array.getEachArr(left);
        int temp;
        int i = left + 1;
        int j = right;

        do {
            while (i <= j && array.getEachArr(i) <= pivot) {
                i++;
            }
            while (i <= j && array.getEachArr(j) > pivot) {
                j--;
            }
            if (i < j) {
                temp = array.getEachArr(i);
                array.setArr(i, array.getEachArr(j));
                array.setArr(j, temp);
                i++;
                j--;
            }

        } while (i <= j);
        temp = array.getEachArr(left);
        array.setArr(left, array.getEachArr(j));
        array.setArr(j, temp);
        return j;
    }

    public static void recursive(Array array, int left, int right) {
        int k;
        if (left < right) {
            k = sort(array, left, right);
            recursive(array, left, k - 1);
            recursive(array, k + 1, right);
        }
    }
}
