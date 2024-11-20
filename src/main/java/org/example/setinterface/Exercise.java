package org.example.setinterface;

import java.util.*;

public class Exercise {
    HashSet<String> hashSet = new HashSet<>();
    TreeSet<String> treeSet = new TreeSet<>();

    public void addStudent(String name) {
        hashSet.add(name);
        treeSet.add(name);
    }

    public void removeStudent(String name) {
        hashSet.remove(name);
        treeSet.remove(name);
    }

    public void checkStudent(String name) {
        hashSet.contains(name);
        treeSet.contains(name);
    }

    public void displayStudentsOrderAdded() {
        LinkedHashSet<String> linkedHashSetSet = new LinkedHashSet(hashSet);
        System.out.println(linkedHashSetSet);
    }

    public void displayStudentsAlphabetically() {
        TreeSet<String> sortedSet = new TreeSet<>(hashSet);
        System.out.println(sortedSet);
    }

    public static void main(String[] args) {

    }

}
