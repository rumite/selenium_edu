package org.example.string;

public class StringMethodPt2 {
    public static void main(String[] args) {
        String text = "Ученье свет";
        String text2 = "Ученье Свет";
        System.out.println(text.equals(text2));
        System.out.println(text.equalsIgnoreCase(text2));
        System.out.println(text.indexOf("е"));
        System.out.println(text.lastIndexOf("е"));
        System.out.println(text.length());
    }
}
