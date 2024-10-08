
package W2;

public class Triangle extends Shape{

    public Triangle(double num1, double num2, double num3) {
        super(num1, num2, num3);
    }

    @Override
    public void printResults() {
        System.out.println("-----Triangle-----");
        System.out.println("Side A: "+num1);
        System.out.println("Side B: "+num2);
        System.out.println("Side C: "+num3);
        System.out.println("Area: "+getArea());
        System.out.println("Perimeter: "+getPerimeter());
    }

    @Override
    public double getPerimeter() {
        return num1+num2+num3;
    }

    @Override
    public double getArea() {
        double p = getPerimeter()/2;
        return Math.sqrt(p*(p-num1)*(p-num2)*(p-num3));
    }
    
}
