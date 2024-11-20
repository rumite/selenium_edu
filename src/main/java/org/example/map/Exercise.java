package org.example.map;

import java.util.*;

public class Exercise {

    // Класс Book с атрибутами ISBN, title и author
    public static class Book {
        private final Integer isbn;
        private final String title;
        private final String author;

        public Book(Integer isbn, String title, String author) {
            this.isbn = isbn;
            this.title = title;
            this.author = author;
        }

        public Integer getIsbn() {
            return isbn;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        @Override
        public String toString() {
            return "ISBN: " + isbn + ", Title: " + title + ", Author: " + author;
        }
    }

    // Класс Library с методами для управления библиотекой
    public static class Library {
        private final HashMap<Integer, Book> bookMap = new HashMap<>(); // Для хранения и поиска
        private final LinkedHashMap<Integer, Book> bookOrderMap = new LinkedHashMap<>(); // Для порядка добавления

        // Добавить книгу
        public void addBook(Integer isbn, String title, String author) {
            Book book = new Book(isbn, title, author);
            bookMap.put(isbn, book);
            bookOrderMap.put(isbn, book);
        }

        // Найти книгу по ISBN
        public Book getBookByIsbn(Integer isbn) {
            return bookMap.get(isbn);
        }

        // Показать все книги в порядке добавления
        public void displayBooksInOrder() {
            System.out.println("Books in insertion order:");
            for (Book book : bookOrderMap.values()) {
                System.out.println(book);
            }
        }

        // Показать все книги, отсортированные по названию
        public void displayBooksSortedByTitle() {
            System.out.println("Books sorted by title:");
            List<Book> books = new ArrayList<>(bookMap.values());
            books.sort(Comparator.comparing(Book::getTitle));
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    // Основной метод программы
    public static void main(String[] args) {
        Library library = new Library();

        // Добавление книг
        library.addBook(12345, "Norwegian Wood", "Haruki Murakami");
        library.addBook(67890, "1984", "George Orwell");
        library.addBook(11112, "Brave New World", "Aldous Huxley");
        library.addBook(54321, "The Catcher in the Rye", "J.D. Salinger");

        // Получение книги по ISBN
        System.out.println("Retrieve book by ISBN 67890:");
        System.out.println(library.getBookByIsbn(67890));
        System.out.println();

        // Показать все книги в порядке добавления
        library.displayBooksInOrder();
        System.out.println();

        // Показать все книги, отсортированные по названию
        library.displayBooksSortedByTitle();
    }
}