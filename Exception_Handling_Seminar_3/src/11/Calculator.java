public class Calculator {

    public double divide(double a, double b) {
        if (b == 0) throw new ArithmeticException("Division by zero");
        return a / b;
    }

    public double multiply(double a, double b) {
        if(a > Double.MAX_VALUE / b) throw new ArithmeticException("Double type overflow");
        return a * b;
    }

    public double subtract(double a, double b) {
        if (a < b) throw new ArithmeticException("Первое число меньше второго!");
        return a - b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        try {
            System.out.println(calculator.divide(10, 0));
        } catch (Exception e) {
            System.out.println("Вышла ошибка: " + e.getMessage());
        }

        try {
            System.out.println(calculator.multiply(10, 0));
        } catch (Exception e) {
            System.out.println("Вышла ошибка: " + e.getMessage());
        }

        try {
            System.out.println(calculator.subtract(0, 10));
        } catch (Exception e) {
            System.out.println("Вышла ошибка: " + e.getMessage());
        }
    }
}