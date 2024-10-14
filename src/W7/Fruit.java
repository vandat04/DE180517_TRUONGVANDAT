package W7;

public class Fruit {

    private String fruitID, fruitName, origin;
    private int quantity;
    private double price, amount;

    public Fruit(String fruitID, String fruitName, double price, String origin) {
        this.fruitID = fruitID;
        this.fruitName = fruitName;
        this.price = price;
        this.origin = origin;
    }

    public Fruit(String fruitID, String fruitName, double price, int quantity) {
        this.fruitID = fruitID;
        this.quantity = quantity;
        this.fruitName = fruitName;
        this.price = price;
        setAmout();
    }

    public String getFruitID() {
        return fruitID;
    }

    public void setFruitID(String fruitID) {
        this.fruitID = fruitID;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setAmout() {
        this.amount = quantity * price;
    }

    public double getAmount() {
        return amount;
    }

    public void displayView() {
        System.out.printf("| ++ %-5s  ++ | ++     %-5s ++ | ++ %-5s ++ | ++ %-5s ++ |%n", fruitID, fruitName, origin, price + "$");
    }

    public void displayPro() {
        System.out.printf("%-1s %-5s    %-5d  %-5s %-5s%n", fruitID, fruitName, quantity, (price + "$"), (amount + "$"));
    }
}
