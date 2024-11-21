package org.example.iterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorSample {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        for (int i = 0; i < 10; i++)
            list.add(i);

        ListIterator listIterator = list.listIterator();

        while (listIterator.hasNext()) {
            int i = (Integer) listIterator.next();
            System.out.print(i + " ");
            System.out.println();

            if (i % 2 == 0) {
                i++;
                listIterator.set(i);
            }
        }
        System.out.println("Elements after mod: " + list);
    }
}
