package org.gustavo.pointer;

import java.util.HashMap;

public class Pointer {
    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        map1.put("value", 10);
        map2 = map1;

        System.out.println(map1);
        System.out.println(map2);
    }
}
