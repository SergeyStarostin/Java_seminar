import java.util.Scanner;

public class LinkedList {

    private static Node head;

    public static void main(String[] args) {

        // Исходный список
        int n = InputNotNegativeNumber("Введите размер списка: ", 10);
        for (int i = n; i > 0; i--) {
            add(RndInteger(-99, 100));
        }
        System.out.println("\nИсходный список: ");
        PrintLinkedList();

        // Разворот списка
        Reverse();

        // Вывод развернутого списка
        System.out.println("\nРезультат: ");
        PrintLinkedList();
    }

    /**
     * @apiNote Функция ввода неотрицательного числа
     */
    static int InputNotNegativeNumber(String msg, int defaultValue) {
        Scanner iScanner = new Scanner(System.in);
        int num = 0;
        System.out.print(msg);
        if (iScanner.hasNextInt()) {
            num = iScanner.nextInt();
            if (num < 0) {
                num = defaultValue;
            }
        } else {
            num = defaultValue;
        }
        iScanner.close();
        return num;
    }

    /**
     * @apiNote Случайное целое число в диапозоне [a, b)
     */
    static int RndInteger(int a, int b) {
        return (int) (Math.random() * (b - a)) + a;
    }

    /**
     * @apiNote Добавление элемента списка в начало
     */
    static void add(int val) {
        Node node = new Node();
        node.value = val;
        if (head != null) {
            node.next = head;
        }
        head = node;
    }

    /**
     * @apiNote Разворот односвязного списка без рекурсии
     */
    static void Reverse() {
        if (head != null) {
            // Текщий обрабатываемый узел - это следующий за головой
            Node current = head.next;
            // голова станет хвостом, а хвост ссылается в null
            head.next = null;
            // Если текущий стал null, то дошли до хвоста и разворот выполнен
            while (current != null) {
                // запоминаем ссылку на следющий узел списка
                Node next = current.next;
                // у текущего узла поворачиваем ссылку в сторону головы
                current.next = head;
                // сдвигаем голову на текущий узел
                head = current;
                // текущим делаем следующий узел
                current = next;
            }
        }
    }

    /**
     * @apiNote Функция вывода списка на экран
     */
    static void PrintLinkedList() {
        if (head == null) {
            System.out.println("[]");
        } else {
            Node tmp = head;
            System.out.printf("[%d]", tmp.value);
            while (tmp.next != null) {
                tmp = tmp.next;
                System.out.printf(" [%d]", tmp.value);
            }
        }
    }
}

class Node {
    public int value;
    public Node next;
}