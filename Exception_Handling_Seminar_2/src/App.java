// пример класса пользовательского исключения, наследующегося от Exeption
class CustomException extends Exception{
    // конструктор с сообщением об ошибке
    public CustomException(String messag){
        super(messag);
    }
}
public class App {
    public static void main(String[] args) {
        try {
            int result = divideNumbers(10, 0);
            System.out.println("Result: " + result);
        } catch (CustomException ex) {
            System.out.println("Caught CustomException: " + ex.getMessage());
        }
    }
    public static int divideNumbers(int dividend, int divisor) throws CustomException {
        if (divisor == 0) {
            throw new CustomException("Division by zero is not allowed.");
        }
        return dividend / divisor; // делимое делим на делитель
    }
}