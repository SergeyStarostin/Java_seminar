import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите возраст");
        Scanner scan = new Scanner(System.in);
        try {
            int age = Integer.parseInt(scan.nextLine());
            if (age > 120 || age < 0) {
                throw new InvalidAgeExeption("Возраст вне диапазона");
            }
            System.out.println("Ваш возраст: " + age);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Некорректный формат ввода: " + e.getMessage());
        }
        catch (InvalidAgeExeption e) {
            throw new NumberFormatException(e.getMessage());
        }
    }
}
