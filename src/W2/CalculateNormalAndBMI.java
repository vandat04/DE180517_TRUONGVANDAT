package W2;

public class CalculateNormalAndBMI {

    static double num1 ,num2;
    
    static public void normalCalculator() { 
        String operator ="+"; 
        num1 = Utils_CheckValid.Utils.getNumber("Enter number: ");
        do {
            operator = Utils_CheckValid.Utils.getOpearator("Enter operator: ");
            if (operator.equals("=")) break;
            num2 = Utils_CheckValid.Utils.getNumber("Enter number: ");
            Number num = new Number( num1, num2, operator);
            num1 = num.calculateNormal();
            System.out.printf("Memory: %.2f%n",num1);

        } while (!operator.equals("="));
        System.out.printf("Results: %.2f%n",num1);
    }

    static public void bmiCalculator() {
        num1 = Utils_CheckValid.Utils.getNumberPositive("Enter Weight(kg): ");
        num2 = Utils_CheckValid.Utils.getNumberPositive("Enter Height(cm): ");   
        Number num = new Number(num1, num2);
        System.out.println("BMI Status: "+num.statusBMI());
    }
}
