import java.util.HashMap;

public class App {   
    public static void main(String[] args) throws Exception{
        //HashMap<Integer,String> map =  HashMapTest.Test.fill();
        //HashMapTest.Test.printHashMap(map,"Иванов");

        HashMap<String, Integer> open = new HashMap<>();
        open.put("(", 0);
        open.put("[", 1);
        open.put("{", 2);
        open.put("<", 3);

        HashMap<String, Integer> close = new HashMap<>();
        close.put(")", 0);
        close.put("]", 1);
        close.put("}", 2);
        close.put(">", 3);

        System.out.println(BracketTest.Tester.validation(open, close, "a+(d*3)"));
        System.out.println(BracketTest.Tester.validation(open, close, "[a+(1*3)"));
        System.out.println(BracketTest.Tester.validation(open, close, "[6+(3*3)] "));
        System.out.println(BracketTest.Tester.validation(open, close, "{a}[+]{(d*3)} "));
        System.out.println(BracketTest.Tester.validation(open, close, "<{a}+{(d*3)}>"));
        System.out.println(BracketTest.Tester.validation(open, close, "{a+]}{(d*3)} "));
    }
}