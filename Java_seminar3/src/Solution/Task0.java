package Solution;

import java.util.ArrayList;
import java.util.List;

public class Task0 {
    public static void StringTest(){
    
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[] { 'h', 'e', 'l', 'l', 'o' });
//        String s7 = "hello";
//        String s8 = new String(new char[] { 'h', 'e', 'l', 'l', 'o' });
        List<String> stringList1 = new ArrayList<>();
        stringList1.add(0, s1);

        if (s1 == s2) System.out.println("Test1 OK");
        if (s3 == s4) System.out.println("Test2 OK");
        if (s5.equals(s6)) System.out.println("Test3 OK");
        System.out.println(s5);
        System.out.println(s6);
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        s2 = "new value";





    }
}
