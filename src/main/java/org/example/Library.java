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
    }

    public void returnBook(String name, String author) {
    }
}
