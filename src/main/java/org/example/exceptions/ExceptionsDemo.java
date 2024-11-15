package org.example.exceptions;

public class ExceptionsDemo {
    public static void main(String[] args) {
        try {
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally");
        }
    }
}
