package W7;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class FruitManagement {
    
    public static void createFruit(ArrayList<Fruit> fruitList) {
        String check = "Y", fruitID = "", fruitName, origin;
        double price;
        
        while (check.equalsIgnoreCase("Y")) {
        boolean checkID = true;    
            while (checkID) {
                fruitID = GetInformation.getValue("Fruit ID: ");
                checkID = false;
                for (Fruit x : fruitList) {
                    if (x.getFruitID().equals(fruitID)) {
                        checkID = true;
                        System.out.println("Fruit ID exist");
                        break;
                    }
                }
            }
            
            fruitName = GetInformation.getValue("Fruit Name: ");
            origin = GetInformation.getValue("Origin: ");
            price = Double.parseDouble(GetInformation.getValue("Price: "));
            
            fruitList.add(new Fruit(fruitID, fruitName, price, origin));
            check = "";
            while (!check.equalsIgnoreCase("Y") && !check.equalsIgnoreCase("N")) {
                check = GetInformation.getValue("Do you want to continue (Y/N)?: ");
            }
        }
    }
    
    public static void shopping(ArrayList<Fruit> fruitList, Hashtable<String, ArrayList<Fruit>> shoppingList) {
        
        System.out.println("List of Fruit:");
        System.out.printf("| ++ %-5s  ++ | ++ %-5s ++ | ++ %-5s ++ | ++ %-5s ++ |%n", "Item", "Fruit Name", "Origin", "Price");
        for (Fruit x : fruitList) {
            x.displayView();
        }
        
        String check = "Y", fruitID, customer;
        int quantity;
        boolean checkID;
        Fruit item = null ;
        customer = GetInformation.getValue("Enter Customer: ");
        ArrayList<Fruit> order = new ArrayList<>();
        
        while (check.equalsIgnoreCase("Y")) {
            while (true) {
                fruitID = GetInformation.getValue("Enter item: ");
                checkID = false;
                for (Fruit x : fruitList) {
                    if (x.getFruitID().equalsIgnoreCase(fruitID)) {
                        checkID = true;
                        item = x;
                        System.out.println("You selected: " + x.getFruitName());
                        break;
                    }
                }
                if (checkID == true) {
                    break;
                } else {
                    System.out.println("The item not exist");
                }
            }
            quantity = Integer.parseInt(GetInformation.getValue("Please input quantity: "));
            
            order.add(new Fruit(fruitID,item.getFruitName() , item.getPrice(), quantity));
            check = "";
            while (!check.equalsIgnoreCase("Y") && !check.equalsIgnoreCase("N")) {
                check = GetInformation.getValue("Do you want to order now (Y/N)?: ");
            }
        }
        shoppingList.put(customer, order);
    }
    
    public static void viewOrders(Hashtable<String, ArrayList<Fruit>> shoppingList){
        Iterator<Map.Entry<String, ArrayList<Fruit>>> iterator = shoppingList.entrySet().iterator();
        double total;
        while (iterator.hasNext()) {
            total =0;
            Map.Entry<String, ArrayList<Fruit>> entry = iterator.next();
            System.out.println("Customer: "+entry.getKey() );
            System.out.printf("| %-5s   |  %-5s  |  %-5s  |  %-5s  |%n", "Product" , "Quantity", "Price", "Amount");       
            for(Fruit x: entry.getValue()){
                x.displayPro();
                total += x.getAmount();
            }
            System.out.println("Total: "+total+"$");
        }
        
    }
}
