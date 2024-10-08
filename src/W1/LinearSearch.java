package W1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LinearSearch {

    private Integer size;
    private Integer searchValue;
    private List<Integer> arr;

    public LinearSearch(Integer size, Integer searchValue) {
        this.size = size;
        this.searchValue = searchValue;
        setArr();
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public List<Integer> getArr() {
        return arr;
    }

    public void setArr() {
        arr = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arr.add(new Random().nextInt(100));
        }
    }

    public void findValue() {
        System.out.print("The array: ");
        System.out.println(arr.toString());
        String index = "";
        for (Integer x : arr) {
            if (x == searchValue) { 
                index = arr.indexOf(x) + " ";
            }
        }
        if (index.equals("")) {
            index += "-1";
        }
        System.out.println("Found " + searchValue + " at index " + index);
    }

}
