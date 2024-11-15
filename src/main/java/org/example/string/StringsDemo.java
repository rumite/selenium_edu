package org.example.string;

public class StringsDemo {
    public static void main (String[] args) {
        String name = "Timur";
        String name1 = "timur";

        // Сравнение строк без учета регистра
        System.out.println(name.equalsIgnoreCase(name1));

        // StringBuffer
        StringBuffer nameMutable = new StringBuffer("Timur");
        nameMutable.append(" Bakhtiyarov");
        name.concat(" Bakhtiyarov");


        System.out.println(nameMutable); // в отличии от вывода далее StringBuffer можно модифицировать
        System.out.println(name);

        nameMutable.reverse();
        System.out.println(nameMutable);// Крутим
    }
}
