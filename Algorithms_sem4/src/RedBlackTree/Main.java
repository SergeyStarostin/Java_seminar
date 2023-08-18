import java.util.Random;

public class Main {
    public static void main(String[] args) {
        RedBlackTree myTree = new RedBlackTree();
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            myTree.add(random.nextInt(100));
        }
        System.out.println(myTree);
    }
}