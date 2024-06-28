package org.example;

import java.util.ArrayList;

public class Library {
    Book book;
    ArrayList<Book> books;
    public ArrayList<Book> getBooks() {
        return books;

    }

    public ArrayList<Book> searchBooks() {
        return new ArrayList<>();
    }

    public void addBook(String name, String author) {
    }

    public void borrowBook(String name, String author) {
        for (Book book : books) {
            if (book.getName().equals(name) && book.getAuthorName().equals(author)) {
                if (!book.getIsThere()) {
                book.setBorrowBook();
                System.out.println("Книга " + name + " автора " + author + " успешно выдана.");
            } else {
                System.out.println("Книга " + name + " автора " + author + " занята.");
            }
            return;
        }
    }
        System.out.println("Книги " + name + " автора " + author + " нет в библиотеке.");
    }

    public void returnBook(String name, String author) {
        for (Book book : books) {
        if (book.getName().equals(name) && book.getAuthorName().equals(author)) {
            if (book.getIsThere()) {
                book.setBorrowBook();
                System.out.println("Книга " + name + " автора " + author + " возвращена.");
            }
            return;
        }
        }
        System.out.println("Книги " + name + " автора " + author + " нет в библиотеке.");
    }
}
