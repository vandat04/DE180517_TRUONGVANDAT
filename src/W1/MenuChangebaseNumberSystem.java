package W1;

import Utils_CheckValid.Menu;
import Utils_CheckValid.Utils;


public class MenuChangebaseNumberSystem extends Menu {

    static String title = "Enter input type of number: ";
    static String[] arr = {"Binary", "Decimal", "Hexadecimal", "Exit"};

    public MenuChangebaseNumberSystem() {
        super(title, arr);
    }

    @Override
    public void execute(int ch) {
        switch (ch) {
            case 1:
                toType(ch);
                break;
            case 2:
                toType(ch);
                break;
            case 3:
                toType(ch);
                break;
            case 4:
                System.out.println("Bye!");
                break;
            default:
                System.out.println("Enter choose again!");
        }

    }

    public void toType(int i) {
        String[] sub = {"Binary", "Decimal", "Hexadecimal", "Exit"};
        Menu subMenu = new Menu("Enter output type of number:", sub) {
            @Override
            public void execute(int n) {
                switch (n) {
                    case 1: {
                        if (i == 1) {
                            System.out.println("Binary --> Binary");
                            String input = Utils.getValue("Enter number: ");
                            if (ChangeBaseNumberSystem.checkBinary(input)) {
                                System.out.println("---> " + input);
                            } else {
                                System.err.println("Wrong type number");
                            }
                        }
                        if (i == 2) {
                            System.out.println("Decimal --> Binary");
                            String input = Utils.getValue("Enter number: ");
                            if (ChangeBaseNumberSystem.checkDecimal(input)) {
                                System.out.println("--> " + ChangeBaseNumberSystem.decimalBinary(input));
                            } else {
                                System.err.println("Wrong type number");
                            }
                        }
                        if (i == 3) {
                            System.out.println("HexaDecimal --> Binary");
                            String input = Utils.getValue("Enter number: ");
                            if (ChangeBaseNumberSystem.checkHexa(input)) {
                                System.out.println("--> " + ChangeBaseNumberSystem.hexadecimalBinary(input));
                            } else {
                                System.err.println("Wrong type number");
                            }
                        }
                        break;
                    }
                    case 2: {
                        if (i == 1) {
                            System.out.println("Binary --> Decimal");
                            String input = Utils.getValue("Enter number: ");
                            if (ChangeBaseNumberSystem.checkBinary(input)) {
                                System.out.println("--> " + ChangeBaseNumberSystem.binaryDecimal(input));;
                            } else {
                                System.err.println("Wrong type number");
                            }
                            
                        }
                        if (i == 2) {
                            System.out.println("Decimal --> Decimal");
                            String input = Utils.getValue("Enter number: ");
                            if (ChangeBaseNumberSystem.checkDecimal(input)) {
                                System.out.println("---> " + input);
                            } else {
                                System.err.println("Wrong type number");
                            }
                        }
                        if (i == 3) {
                            System.out.println("HexaDecimal --> Decimal");
                            String input = Utils.getValue("Enter number: ").toUpperCase();
                            if (ChangeBaseNumberSystem.checkHexa(input)) {
                                System.out.println("--> " + ChangeBaseNumberSystem.hexadecimalDecimal(input));
                            } else {
                                System.err.println("Wrong type number");
                            }
                        }
                        break;
                    }
                    case 3: {
                        if (i == 1) {
                            System.out.println("Binary --> HexaDecimal");
                            String input = Utils.getValue("Enter number: ");
                            if (ChangeBaseNumberSystem.checkBinary(input)) {
                                System.out.println("--> " + ChangeBaseNumberSystem.binaryHexa(input));
                            } else {
                                System.err.println("Wrong type number");
                            }              
                        }
                        if (i == 2) {
                            System.out.println("Decimal --> HexaDecimal");
                            String input = Utils.getValue("Enter number: ");
                            if (ChangeBaseNumberSystem.checkDecimal(input)) {
                                System.out.println("--> " + ChangeBaseNumberSystem.decimalHexadecimal(input));
                            } else {
                                System.err.println("Wrong type number");
                            }    
                        }
                        if (i == 3) {
                            System.out.println("HexaDecimal --> HexaDecimal");
                            String input = Utils.getValue("Enter number: ");
                            if (ChangeBaseNumberSystem.checkHexa(input)) {
                                System.out.println("---> " + input);
                            } else {
                                System.err.println("Wrong type number");
                            }
                        }
                        break;
                    }
                    case 4:
                        System.out.println("Bye!");
                        break;
                    //...
                    default: {
                        System.out.println("Enter choose again !!");
                        break;
                    }
                }
            }
        };
        subMenu.run();
    }


}
