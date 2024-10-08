package W2;

public class CalculatePerimeterAndArea {

    static double num1, num2, num3;

    static public void calculate() {
        num1 = Utils_CheckValid.Utils.getNumberPositive("Please input side width of Rectangle: ");
        num2 = Utils_CheckValid.Utils.getNumberPositive("Please input length of Rectangle: ");
        Shape rect = new Rectangle(num1, num2);
        num1 = Utils_CheckValid.Utils.getNumberPositive("Please input radius of Circle: ");
        Shape cir = new Circle(num1);
        num1 = Utils_CheckValid.Utils.getNumberPositive("Please input side A of Triangle: ");
        num2 = Utils_CheckValid.Utils.getNumberPositive("Please input side B of Triangle: ");
        num3 = Utils_CheckValid.Utils.getNumberPositive("Please input side B of Triangle: ");
        Shape tria = new Triangle(num1, num2, num3);
        rect.printResults();
        cir.printResults();
        tria.printResults();
    }
}
