package org.example.setinterface;

import java.util.LinkedHashSet;


// LinkedHashSet поддерживает очередность элементов

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("234");
        linkedHashSet.add("Tim");
        linkedHashSet.add("Georgia");
        linkedHashSet.add("Earth");

        System.out.println(linkedHashSet);
    }
}
