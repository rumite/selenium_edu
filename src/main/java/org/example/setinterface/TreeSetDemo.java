package org.example.setinterface;

import java.util.Collection;
import java.util.TreeSet;

// Сортирующий сет

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet tSet = new TreeSet();

        //TreeSet convertedSet = new TreeSet(Collection anyCollection);

        tSet.add(18);
        tSet.add(200);
        tSet.add(153);
        tSet.add(3);

        // Return first and last elements
        System.out.println(tSet.first());
        System.out.println(tSet.last());

        // Return elements are LESS than
        System.out.println(tSet.headSet(34));

        // Return elements are MORE than
        System.out.println(tSet.tailSet(34));

        // Return elements between
        System.out.println(tSet.subSet(34, 180));
    }
}
