package org.example.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class Exercise {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a first int:");
        int x = Integer.parseInt(reader.readLine());
        System.out.println("Enter a second int:");
        int y = Integer.parseInt(reader.readLine());

        try {
            int z = x / y;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
