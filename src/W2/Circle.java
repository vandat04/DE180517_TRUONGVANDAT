package W2;

public class Circle extends Shape {

    final double PI = Math.PI;

    public Circle(double num1) {
        super(num1);
    }

    @Override
    public void printResults() {
        System.out.println("-----Circle-----");
        System.out.println("Radius: "+num1);
        System.out.println("Area: "+getArea());
        System.out.println("Perimeter: "+getPerimeter());
    }

    @Override
    public double getPerimeter() {
        return 2*num1*PI; 
    }

    @Override
    public double getArea() {
        return Math.pow(num1, 2)*PI;
    }

}
