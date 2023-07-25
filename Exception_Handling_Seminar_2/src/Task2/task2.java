package Task2;

import java.util.Scanner;

public class task2 {
     public static void negativeNumber(int number) {
        if (number < 0) {
            throw new NegativeNumberException("Число меньше нуля");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        System.out.println("Введите число");
        
        try {
            negativeNumber(number);
        
        } catch (NegativeNumberException e) {
            System.out.println("Сработал catch, число меньше нуля");
            
        }
    }
}