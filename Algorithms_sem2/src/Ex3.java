import java.util.Arrays;
import java.util.Date;

public class Ex3 {
    public static void main(String[] args) {
        int size = 100000;
        int min = 0;
        int max = 100;
        
        int[] array = Ex1.getRandomArr(size, min, max);
        long start = new Date().getTime();
        System.out.print("Рандомное число: ");
        
        Ex1.bubbleSort(array.clone());
        long end = new Date().getTime();
        System.out.println(end - start);
        System.out.print("bubbleSort: ");

        long start2 = new Date().getTime();
        Ex2.quickSort(array.clone());
        long end2 = new Date().getTime();
        System.out.println(end2 - start2);

        System.out.print("quickSort: ");
        long start3 = new Date().getTime();
        Arrays.sort(array.clone());
        long end3 = new Date().getTime();
        System.out.println(end3 - start3);
    }
}