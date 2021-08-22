package lesson8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Phonebook {

    Map<String, ArrayList<String>> map;

    public Phonebook() {
        map = new HashMap<>();
    }

    public void add(String lastname, String number) {
        if (map.get(lastname) != null) {
            map.get(lastname).add(number);
        } else {
            map.put(lastname, new ArrayList<String>());
            map.get(lastname).add(number);
        }
    }

    public void get(String lastname) {
        for (String str : map.get(lastname)) {
            System.out.println(lastname + " " + str);
        }
    }
}