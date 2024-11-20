package org.example.map;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("length", 18);
        linkedHashMap.put("width", 21);

        // Добавляет значение только если ключа не существовало
        linkedHashMap.putIfAbsent("length", 33);
        System.out.println(linkedHashMap);
    }
}
