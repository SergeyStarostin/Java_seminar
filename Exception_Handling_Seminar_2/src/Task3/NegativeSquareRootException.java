/*
 * Создание пользовательского класса исключения "NegativeSquareRootException" для обработки ситуаций, 
 * когда из отрицательного числа пытаются извлечь квадратный корень.
Описание задачи:
Вы разрабатываете программу, которая должна вычислять квадратные корни чисел. Однако, вы не хотите, 
чтобы программа падала с ошибкой, когда вам передают отрицательное число, поскольку из отрицательного 
числа невозможно извлечь квадратный корень. Вместо этого, вы хотите, чтобы программа выбрасывала 
собственное исключение "NegativeSquareRootException" и сообщала об ошибке.
Класс "NegativeSquareRootException" должен содержать следующие методы:
Конструктор: Создайте конструктор с одним параметром типа String, который принимает сообщение об ошибке. 
Это сообщение будет выводиться при обработке исключения.
Метод getMessage: Создайте метод getMessage, который возвращает сообщение об ошибке, переданное в конструкторе.
Реализуйте метод "calculateSquareRoot" для вычисления квадратного корня из числа. 
Если в метод передается отрицательное число, метод должен выбрасывать исключение 
"NegativeSquareRootException".
 */
package Task3;

public class NegativeSquareRootException extends RuntimeException{

    public NegativeSquareRootException(String message) {
        super(message);
    }

    
}