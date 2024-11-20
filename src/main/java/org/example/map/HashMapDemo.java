/*
    - HashMap implements Map interface
    - HashMap allows null key and values
    - HashMap doesn't contain the insertion order
    - Hashing is a technique that converts a large string into a small one
 */

package org.example.map;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("Timur", 30);
        hashMap.put("Polina", 28);

        System.out.println(hashMap);

        if(hashMap.containsKey("Timur")) {
            System.out.println("Age: " + hashMap.get("Timur"));
        }

        System.out.println("Size of hashMap: " + hashMap.size());

        System.out.println("Is hashMap empty: " + hashMap.isEmpty());

        hashMap.clear();
        System.out.println("Is hashMap empty: " + hashMap.isEmpty());
    }
}
