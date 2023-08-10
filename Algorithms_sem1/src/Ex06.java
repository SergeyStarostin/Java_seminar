public class Ex06 {

    public static void main(String[] args) throws Exception {
        // сравнить алгоритмы вычисления числа Фибоначчи по номеру позиции
     
        for (int i = 5; i < 50; i += 5) {
            long t1 = System.currentTimeMillis();
            System.out.println(Ex05.fiboLoop(i));
            long t2 = System.currentTimeMillis();
            System.out.println(Ex04.fiboRecursion(i));
            long t3 = System.currentTimeMillis();

            System.out.println("Loop took: " + i + " -> " + (t2 - t1) + " ms");
            System.out.println("Fibo took: " + i + " -> " + (t3 - t2) + " ms");
        }
    }
}