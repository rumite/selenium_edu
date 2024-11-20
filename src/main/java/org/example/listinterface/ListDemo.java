package org.example.listinterface;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List list1 = new ArrayList();

        // Adding elements
        list1.add(12);
        list1.add(1, 34);
        System.out.println(list1);

        // Adding list in list
        List list2 = new ArrayList();
        list2.add(46);
        list2.addAll(0, list1);
        System.out.println(list2);

        // Set an element in the list
        list2.set(2, 56);
        System.out.println(list2);

        // Remove an element in the list
        list2.remove(1);
        System.out.println(list2);

        // Showing an index in the first found element
        System.out.println(list2.indexOf(56));
        // ... and if not found
        System.out.println(list2.indexOf(112));

        // Showing an index in the last found element
        list2.add(12);
        System.out.println(list2);
        System.out.println(list2.lastIndexOf(12));

        // Sublist
        list2.add(678);
        list2.add(453);
        System.out.println(list2);
        List sublist = list2.subList(1, 4);
        System.out.println(sublist);
    }
}
