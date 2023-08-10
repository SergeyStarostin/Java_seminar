public class Calculator {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) throw new ArithmeticException("Devision by zero not allowed");
        return a / b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        try {
            System.out.println(calculator.divide(10, 0));
        } catch (Exception e) {
            System.out.println("произошла ошибка: " + e.getMessage());
        }
    }
}