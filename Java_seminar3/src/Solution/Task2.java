package Solution;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task2 {

    /*
    Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
    Вывести название каждой планеты и количество его повторений в списке.
     */
    
    public static void planetsFreq() {

        String[] pl = { "Меркурий", "Венера", "Венера", "Марс", "Земля", "Юпитер", "Сатурн", "Уран", "Нептун" };
        List<String> planetsList = Arrays.asList(pl);
        Set<String> planetsSet = new HashSet<>(planetsList);
        for (String planets : planetsSet) {
            System.out.println(planets + " = " + Collections.frequency(planetsList, planets));
        }
    }
}