package W2;

public abstract class Shape {

    protected double num1, num2, num3;

    public Shape(double num1, double num2, double num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public Shape(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Shape(double num1) {
        this.num1 = num1;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getNum3() {
        return num3;
    }

    public void setNum3(double num3) {
        this.num3 = num3;
    }

    public abstract void printResults();
    public abstract double getPerimeter();
    public abstract double getArea();
}
