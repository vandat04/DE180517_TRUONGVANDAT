package W3;

import Utils_CheckValid.Menu;

public class MenuStack extends Menu {

    static String title = "Stack";
    static String[] mchon = {"Push", "Pop", "Get", "Exit"};
    static Stack stackValues;

    public MenuStack() {
        super(title, mchon);
        stackValues = new Stack();
    }

    @Override
    public void execute(int ch) {
        switch (ch) {
            case 1: {
                int value = Utils_CheckValid.Utils.getNumber("Enter numvber: ");
                stackValues.push(value);
                stackValues.displayStack();
            }
            break;
            case 2: {
                System.out.println(stackValues.pop());
                stackValues.displayStack();
            }
            break;
            case 3: {
                System.out.println(stackValues.get());
                stackValues.displayStack();
            }
            break;
            case 4:
                System.out.println("Bye");
                break;
            default:
                System.out.println("Enter choice again");
        }
    }

}
