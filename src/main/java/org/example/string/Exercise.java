package org.example.string;

public class Exercise {
    public static void main(String[] args) {
        String before = "The quick brown fox jumps over the lazy dog";
        String[] reversedString = before.split(" ");
        for (int i = reversedString.length - 1; i > 0; i--) {
            System.out.print(reversedString[i] + " ");
        }
        System.out.print(reversedString[0]);
    }
}
