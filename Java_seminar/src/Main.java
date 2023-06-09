import java.time.LocalTime;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) throws Exception 
    {
        task1();
        task2();
        task3();
        task4();
    }

    private static void task1() 
    {

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

    private static void task2() 
    {
        //Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
        //максимальное количество подряд идущих 1.
        
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

    private static void task3() 
    {
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
    // Напишите метод, который находит самую длинную строку общего префикса среди
    // массива строк.
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
}


