
package W2;


public class Rectangle extends Shape{

    public Rectangle(double num1, double num2) {
        super(num1, num2);
    }

    @Override
    public void printResults() {
        System.out.println("-----Rectangle-----");
        System.out.println("Width: "+num1);
        System.out.println("Length: "+num2);
        System.out.println("Area: "+getArea());
        System.out.println("Perimeter: "+getPerimeter());
    }

    @Override
    public double getPerimeter() {
        return (num1+num2)*2;
    }

    @Override
    public double getArea() {
        return num1*num2;
    }
    
}
