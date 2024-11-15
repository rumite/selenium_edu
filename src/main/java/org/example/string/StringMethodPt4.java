package org.example.string;

public class StringMethodPt4 {
    public static void main(String[] args) {

        // Substring
        String text = "Polina Nikitina";
        System.out.println(text.substring(0, 6));
        System.out.println(text.substring(7));

        // Convert to char array
        char[] convertedText = text.toCharArray();
        for (char c : convertedText) {
            System.out.println(c);
        }

        // To lower case
        String toLowerCase = text.toLowerCase();
        String toUpperCase = text.toUpperCase();
        System.out.println(toUpperCase + " " + toLowerCase);

        // Trim
        String aLotOfSpaces = "Polina       ";
        System.out.println(aLotOfSpaces.trim());
    }
}
