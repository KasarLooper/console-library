package org.example;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class Library implements Serializable {
    private ArrayList<Book> books = new ArrayList<>();

    public Library() {
    }

    @Serial
    private static final long serialVersionUID = 1L;

    public ArrayList<Book> getBooks() {
        return books;
    }

    public boolean containsBook(String name, String author) {
        for (Book book : books)
            if (book.getName().equals(name) && book.getAuthorName().equals(author))
                return true;
        return false;
    }

    public ArrayList<Book> searchBooks(String prompt) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : books)
            if (book.getAuthorName().equals(prompt))
                result.add(book);
        return result;
    }

    public void addBook(String name, String author) {
        books.add(new Book(name, author));
    }

    public void borrowBook(String name, String author) {
        for (Book book : books) {
            if (book.getName().equals(name) && book.getAuthorName().equals(author)) {
                if (!book.getIsThere()) {
                    book.setBorrowBook(true);
                    //System.out.println("Книга " + name + " автора " + author + " успешно выдана.");
                } else {
                    //System.out.println("Книга " + name + " автора " + author + " занята.");
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
                    book.setBorrowBook(false);
                    //System.out.println("Книга " + name + " автора " + author + " возвращена.");
                }
                return;
            }
        }
        //System.out.println("Книги " + name + " автора " + author + " нет в библиотеке.");
    }
}