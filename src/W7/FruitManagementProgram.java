package W7;

import java.util.ArrayList;
import java.util.Hashtable;

public class FruitManagementProgram extends Menu {
    
    static String title = "FRUIT SHOP SYSTEM";
    static String[] mchon = {"Create Fruit", "View orders", "Shopping (for buyer)", "Exit"};
    static ArrayList<Fruit> fruitList;
    Hashtable<String, ArrayList<Fruit>> shoppingList;
    
    public FruitManagementProgram() {
        super(title, mchon);
        fruitList = new ArrayList<>();
        shoppingList = new Hashtable<>();
    }
    
    @Override
    public void execute(int ch) {
        switch (ch) {
            case 1:
                FruitManagement.createFruit(fruitList);
                break;
            case 2:
                FruitManagement.viewOrders(shoppingList);
                break;
            case 3:
                FruitManagement.shopping(fruitList, shoppingList);
                break;
            case 4:
                System.out.println("Bye");
                break;
            default:
                System.out.println("Enter choice again");
        }
        
    }
}
