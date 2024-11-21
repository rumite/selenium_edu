package org.example.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorSample {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        for (int i = 0; i < 10; i++)
            list.add(i);

        Iterator itr = list.iterator();

        while (itr.hasNext()) {
            int i = (Integer) itr.next();

            System.out.println(i);

            if (i % 2 != 0) {
                itr.remove();
            }
        }

        System.out.println(list);
    }
}
