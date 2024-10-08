
package W3;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    private List<Integer> stackValues;

    public Stack() {
        this.stackValues = new ArrayList<>();
    }

    public ArrayList<Integer> getStackValues() {
        return (ArrayList<Integer>) stackValues;
    }
    
    public void displayStack(){
        System.out.println(stackValues);
    }

    public void setStackValues(ArrayList<Integer> stackValues) {
        this.stackValues = stackValues;
    }
    
    public void push(int value){
        this.stackValues.add(value);
    }
    
    public int pop(){
        int lastValue = stackValues.get(stackValues.size()-1);
        stackValues.remove(stackValues.size()-1);
        return lastValue;
    }
    
    public int get(){
        return stackValues.get(stackValues.size()-1);
    }
}
