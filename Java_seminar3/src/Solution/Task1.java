package Solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task1 {
    
    /*
    Заполнить список десятью случайными числами. Отсортировать список методом sort() и вывести его на экран.
    */
    
    public static void SortArray(){
        Random rnd = new Random();
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            array.add(rnd.nextInt(100));
        }
        System.out.println(array);
        Collections.sort(array);
        System.out.println(array);
    }
}
