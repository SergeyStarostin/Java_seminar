import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class Main 
{
    public static void main(String[] args) throws Exception {
        
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("1) Ввод имени с консоли");
            System.out.println("2) Вывод максимального количества 1 подряд");
            System.out.println("3) Вывод заданного числа в конец массива");
            System.out.println("4) Вывод самой длинной строки префикса");
            System.out.println("5) Переставить слова в преждложении в обратном порядке");
            System.out.println("6) Возведение числа А в степень В");
            System.out.println("7) Набор команд для переведения числа А в В");
            System.out.println("Ввыедите номер задачи: ");
            int tasks = in.nextInt();
            
            switch(tasks){
                case 1:
                    task1();
                    break;
                case 2:
                    task2();
                    break;
                case 3:
                    task3();
                    break;
                case 4:
                    task4();
                    break;
                case 5:
                    task5();
                    break;
                case 6:
                    task8();
                    break;
                case 7:
                    task9();
                    break;
            }
        }
    }
    
    private static void task1() {

    // Написать программу, которая запросит пользователя ввести <Имя> в консоли.
    // Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”

    Scanner iScanner = new Scanner(System.in);
    System.out.printf("Enter your name: ");
    String name = iScanner.nextLine();

    // System.out.printf("Hello, %s!\n", name);
    Depends(name);
    //System.out.println("Hello, " + name);
    }

    //В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида 
    //"Доброе утро, <Имя>!", если время от 05:00 до 11:59
    //"Добрый день, <Имя>!", если время от 12:00 до 17:59;
    //"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
    //"Доброй ночи, <Имя>!", если время от 23:00 до 4:59

    public static void Depends(String name)
    {
        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        if (lt.getHour() >= 18 && lt.getHour() < 23) 
        {
            System.out.printf("Good evening, %s!\n", name);
        } else if (lt.getHour() >= 23 && lt.getHour() < 5) {
            System.out.printf("Good night, %s!\n", name);
        } else if (lt.getHour() >= 5 && lt.getHour() < 12) {
            System.out.printf("Good morning, %s!\n", name);
        } else if (lt.getHour() >= 12 && lt.getHour() < 18) {
            System.out.printf("Good afternoon, %s!\n", name);
        }
    }

    private static void task2() {

    //Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
        
        int[] arr = {1,1,0,1,1,1};
        int count = 0;
        int max_count=0;
        for (int i=0; i<arr.length; i++)
        {
            if(arr[i]==1) count++;
            else count = 0;
            if(count > max_count) max_count = count;
        }
        System.out.println(max_count);
    }

    private static void task3() {

    //Дан массив nums = [3,2,2,3] и число val = 3.
    //Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
    //Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
    
        int[] arr = new int[] {1,1,0,3,1,1,3,0,1};
        int val = 3;
    
        for (int i = 0; i < arr.length; i++) 
        {
            if(arr[i]==val)
            {
                for (int j = i; j < arr.length-1; j++) arr[j] = arr[j+1];
                arr[arr.length-1] = val;
            }
        }
    
        for (int item : arr) System.out.printf("%d\t", item);
    }

    private static void task4() 
    {
    // Напишите метод, который находит самую длинную строку общего префикса среди массива строк.
    // Если общего префикса нет, вернуть пустую строку "".

        String[] lines = { "dom", "domovoy", "domashniy" };
        System.out.println(findPfx(lines));
        System.out.println(lines[0].substring(0, findPfx(lines)));
    }

    private static int findPfx(String[] lines) 
    {
        int res = 0;
        boolean pfxExist = true;
        while (pfxExist) 
        {
            res++;
            for (int i = 0; i < (lines.length - 1); i++) 
            {
                if (res <= lines[i].length() && res <= lines[i + 1].length()) 
                {
                    if (lines[i].substring(0, res).compareTo(lines[i + 1].substring(0, res)) != 0) 
                    {
                        res--;
                        pfxExist = false;
                        break;
                    }
                } 
                else 
                {
                    res--;
                    pfxExist = false;
                    break;
                }
            }
        }
        return res;
    }

    private static void task5() {

        //Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.

        String sourceLn = "Welcome To Java Cource";
        String[] splitLn = sourceLn.split(" ");
        String outLn = "";
        for (int i = splitLn.length - 1; i >= 0; i--) {
            outLn = outLn + splitLn[i] + " ";
        }
        System.out.println(sourceLn);
        System.out.println(outLn);
    }

    private static void task8() {

    //Задан массив, например, nums = [1,7,3,6,5,6]. Написать программу, которая найдет индекс i для этого массива
    //такой, что сумма элементов с индексами < i равна сумме элементов с индексами > i. 

        int[] nums = {1, 7, 3, 6, 5, 6};
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < nums.length; i++) {
            rightSum += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            rightSum -= nums[i];
            if (leftSum == rightSum) {
                System.out.println("Индекс: " + i);
                return;
            }
            leftSum += nums[i];
        }
        System.out.println("Такой индекс не найден");
    }

    private static void task9() { 
        
    //Записать в файл следующие данные:
    //Name Surname Age
    //Kate Smith 20
    //Paul Green 25
    //Mike Black 23
        
        try {
        FileWriter fileWriter = new FileWriter("data.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Name Surname Age");
        bufferedWriter.newLine();
        bufferedWriter.write("Kate Smith 20");
        bufferedWriter.newLine();
        bufferedWriter.write("Paul Green 25");
        bufferedWriter.newLine();
        bufferedWriter.write("Mike Black 23");
        bufferedWriter.newLine();
        bufferedWriter.close();
        fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}