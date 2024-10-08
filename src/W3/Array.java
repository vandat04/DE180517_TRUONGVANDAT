package W3;

import java.util.ArrayList;
import java.util.Random;

public class Array {

    private int size;
    private ArrayList<Integer> arr;

    public Array(int size) {
        this.size = size;
        this.arr = new ArrayList<>();
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public ArrayList<Integer> getArr() {
        return arr;
    }

    public void setArr(ArrayList<Integer> arr) {
        this.arr = arr;
    }

    public int getEachArr(int index) {
        return arr.get(index);
    }

    public void setArr(int index, int value) {
        arr.set(index, value);
    }

    public void fillArray() {
        for (int i = 0; i < size; i++) {
            arr.add(new Random().nextInt(100));
        }
    }

    public void fillArrayByHand() {
        for (int i = 0; i < size; i++) {
            arr.add(Utils_CheckValid.Utils.getNumberIntPositive("Enter number " + (i+1) + ": "));
        }
    }

    public void displayArray() {
        for (Integer x : arr) {
            System.out.print(x + "\t");
        }
    }

    public void displayIncreArray() {
        for (int i = 0; i < size; i++) {
            System.out.print("[" + arr.get(i) + "]");
            if (i + 1 < size) {
                System.out.print("->");
            }
        }
    }

    public void displayDecreArray() {
        for (int i = size - 1; i >= 0; i--) {
            System.out.print("[" + arr.get(i) + "]");
            if (i - 1 >= 0) {
                System.out.print("<-");
            }
        }
    }

}
