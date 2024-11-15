package org.example.string;

public class StringMethodPt3 {
    public static void main(String[] args) {
        // Replace
        String text = "Hello World!";
        String newText = text.replace("!", "");
        System.out.println(newText);

        // Split
        String[] splittedString = text.split(" ");
        for (String s : splittedString) {
            System.out.println(s);
        }

        // Starts With
        boolean startsOrNot = splittedString[0].startsWith("H");
        System.out.println(startsOrNot);
    }
}
