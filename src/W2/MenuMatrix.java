package W2;

import Utils_CheckValid.Menu;

public class MenuMatrix extends Menu {

    static int rows, cols;
    static Matrix m1, m2;
    static CalculateMatrix re;
    static String title = "=======Calculator program=======";
    static String[] mchon = {"Addition Matrax", "Subtraction Matrix", "Multiplication", "Quit"};

    public MenuMatrix() {
        super(title, mchon);
    }

    @Override
    public void execute(int ch) {
        switch (ch) {
            case 1: {
                rows = Utils_CheckValid.Utils.getNumberIntPositive("Enter rows matrix1: ");
                cols = Utils_CheckValid.Utils.getNumberIntPositive("Enter rows matrix1: ");
                m1 = new Matrix(rows, cols);
                m1.fillMatrix(1);
                rows = Utils_CheckValid.Utils.getNumberIntPositive("Enter rows matrix2: ");
                cols = Utils_CheckValid.Utils.getNumberIntPositive("Enter rows matrix2: ");
                m2 = new Matrix(rows, cols);
                m2.fillMatrix(2);
                m1.display();
                System.out.println("+");
                m2.display();
                System.out.println("=");
                re = new CalculateMatrix();
                re.add(m1, m2).display();
            }
            break;
            case 2:
                {
                rows = Utils_CheckValid.Utils.getNumberIntPositive("Enter rows matrix1: ");
                cols = Utils_CheckValid.Utils.getNumberIntPositive("Enter rows matrix1: ");
                m1 = new Matrix(rows, cols);
                m1.fillMatrix(1);
                rows = Utils_CheckValid.Utils.getNumberIntPositive("Enter rows matrix2: ");
                cols = Utils_CheckValid.Utils.getNumberIntPositive("Enter rows matrix2: ");
                m2 = new Matrix(rows, cols);
                m2.fillMatrix(2);
                m1.display();
                System.out.println("-");
                m2.display();
                System.out.println("=");
                re = new CalculateMatrix();
                re.sub(m1, m2).display();
            }
                break;
            case 3:
                {
                rows = Utils_CheckValid.Utils.getNumberIntPositive("Enter rows matrix1: ");
                cols = Utils_CheckValid.Utils.getNumberIntPositive("Enter rows matrix1: ");
                m1 = new Matrix(rows, cols);
                m1.fillMatrix(1);
                rows = Utils_CheckValid.Utils.getNumberIntPositive("Enter rows matrix2: ");
                cols = Utils_CheckValid.Utils.getNumberIntPositive("Enter rows matrix2: ");
                m2 = new Matrix(rows, cols);
                m2.fillMatrix(2);
                m1.display();
                System.out.println("*");
                m2.display();
                System.out.println("=");
                re = new CalculateMatrix();
                re.multiply(m1, m2).display();
            }
                break;
            case 4:
                System.out.println("Bye!!!");
                break;
            default:
                System.out.println("Enter choice again!!!");
                break;
        }
    }

}
