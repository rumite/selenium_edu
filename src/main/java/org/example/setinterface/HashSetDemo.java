package org.example.setinterface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("Timur");
        set.add("Bakhtiiarov");
        set.add("GE");
        set.add("Tbilisi");

        System.out.println(set);

        // Remove an element
        set.remove("GE");
        System.out.println(set);

        // Contains
        System.out.println(set.contains("Timur"));
        System.out.println(set.contains("Nail"));

        // Iterator
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Clear hashset
        set.clear();
        System.out.println(set);

    }
}
