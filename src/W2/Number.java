package W2;

public class Number {

    private double num1, num2;
    private String operator;

    public Number(double num1, double num2, String operator) {
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
    }

    public Number(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
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

    public double calculateNormal() {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            case "^":
                return Math.pow(num1, num2);
        }
        return 0;
    }

    public double calculateBMI() {
        return num1 / (Math.pow(num2 / 100, 2));
    }

    public status statusBMI() {
        Double bmi = calculateBMI();
        System.out.printf("BMI Number: %.2f%n",bmi);
        if (bmi<19) return status.Under_standard;
        if (bmi>19 && bmi<25) return status.Standard;
        if (bmi>25 && bmi<30) return status.Overweight;
        if (bmi<30 && bmi<40) return status.Fat_should_lose_weight;
        return status.Very_fat_should_lose_weight_immediately;       
    }

    public enum status {
        Under_standard,
        Standard,
        Overweight,
        Fat_should_lose_weight,
        Very_fat_should_lose_weight_immediately;
    }
}
