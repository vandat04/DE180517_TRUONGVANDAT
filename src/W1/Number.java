package W1;

import java.util.ArrayList;
import java.util.List;

public class Number {

    private float a, b, c;

    public Number(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Number(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public List<Float> calculateEquation() {
        List<Float> solutions = new ArrayList<>();
        if (a == 0) {
            if (b == 0) {
                return solutions;
            } else {
                return null;
            }
        } else {
            solutions.add(-b / a);
            return solutions;
        }
    }

    public List<Float> calculateQuadraticEquation() {
        List<Float> solutions = new ArrayList<>();

        if (a == 0) {
            a = b;
            b = c;
            return calculateEquation();
        }

        float denta = b * b - 4 * a * c;

        if (denta < 0) {
            return null;
        } else if (denta == 0) {
            solutions.add(-b / (2 * a));
            return solutions;
        } else {
            float sqrtDiscriminant = (float) Math.sqrt(denta);
            float x1 = (-b + sqrtDiscriminant) / (2 * a);
            float x2 = (-b - sqrtDiscriminant) / (2 * a);
            solutions.add(x1);
            solutions.add(x2);
            return solutions;
        }
    }

    public void checkOddAndEven(List<Float> listNumber) {
        String oddNumber = "Odd Number: ";
        String evenNumber = "Even Number: ";
        for (Float x : listNumber) {
            if (x % 2 == 0) {
                evenNumber += x + " ";
            } else {
                oddNumber += x + " ";
            }
        }
        System.out.println(oddNumber + "\n" + evenNumber);
    }

    public void isPerfectSquare(List<Float> listNumber) {
        String perfectNumber = "Number is perfect number: ";
        for (Float x : listNumber) {
            if (x > 0) {
                int sqrt = (int) Math.sqrt(x);
                if (sqrt * sqrt == x) {
                    perfectNumber += x + " ";
                }
            }
        }
        System.out.println(perfectNumber);
    }
}
