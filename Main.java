
public class Main {

    public static void main(String[] args) {
        Calculator calculator = new BasicCalculator();

        ComplexNumber num1 = new ComplexNumber(1, 2);
        ComplexNumber num2 = new ComplexNumber(3, 4);

        ComplexNumber sum = calculator.add(num1, num2);
        MyLogger.log("Sum: " + sum);

        ComplexNumber product = calculator.multiply(num1, num2);
        MyLogger.log("Product: " + product);

        ComplexNumber quotient = calculator.divide(num1, num2);
        MyLogger.log("Quotient: " + quotient);
    }
}
