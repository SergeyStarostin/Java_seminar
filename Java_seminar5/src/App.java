import java.util.HashMap;

public class App {

    public static void main(String[] args) throws Exception{
        HashMap<Integer,String> map =  HashMapTest.Test.fill();
        HashMapTest.Test.printHashMap(map,"Иванов");
    }
}