package taskLesson2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Collections {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(27);
        list.add(45);
        list.add(60);
        list.add(90);
        list.add(1233);
        list.add(35);

        System.out.println("-- вывод --");
        for (Integer s : list) {
            System.out.println(s);
        }

        list.forEach(s -> System.out.println(" число = " + s));

        System.out.println("-- фильтрация --");
        list.stream().filter(s -> s.intValue() < 50).forEach(s -> System.out.println("число = " + s));

        System.out.println("-------");
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "январь");
        map.put(2, "февраль");
        map.put(3, "март");
        map.put(4, "апрель");
        System.out.println(map.get(3));

        //перебор ключей
        Set<Integer> set;
        set = map.keySet(); //возвращает заданное представление ключей
        set.forEach(s -> System.out.println("ключ " + s));

        for (Integer s : set) {
            System.out.println("Значения ключа " + s + " - " + map.get(s));
        }

        System.out.println("----------");
        for (Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println("ключ - " + m.getKey());
            System.out.println("значение - " + m.getValue());
        }
    }
}