/*
 * Напишите программу, которая запрашивает у пользователя его возраст.
 * Если возраст меньше 0 или больше 120, программа должна выбросить исключение InvalidAgeExeption
 * с сообщением "Некорректный возраст".  Если пользователь вводит не число, программа должна выбросить
 * исключение NumberFormatExeption с сообщением "Некорректный формат числа".
 * В остальных случаях программа должна вывести сообщение "Ваш возраст: [возраст]".
 */
public class InvalidAgeExeption extends RuntimeException{
    public InvalidAgeExeption(String message){
            super(message);
    }
    @Override
    public String toString(){
        return "InvalidAgeExeption []";
    }
}



