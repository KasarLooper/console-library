package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Library {
    private ArrayList<Book> books;

    public ArrayList<Book> getBooks() {
        return (ArrayList<Book>) Collections.unmodifiableCollection(books);
    }

    public ArrayList<Book> searchBooks(String prompt) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : books)
            if (book.getAuthorName().equals(prompt))
                result.add(book);
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
