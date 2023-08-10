package Task2;

/*
 * Задача: Создание пользовательского класса исключения "NegativeNumberException", 
 * который будет выбрасываться, когда в метод передается отрицательное число.
 * Класс "NegativeNumberException" должен содержать следующие методы:
 * Конструктор: Создайте конструктор с одним параметром типа String, который принимает сообщение об ошибке. 
 * Это сообщение будет выводиться при обработке исключения.
 */

public class NegativeNumberException extends RuntimeException{
//String  message
    public NegativeNumberException (String message) {
        super(message);
    }
}