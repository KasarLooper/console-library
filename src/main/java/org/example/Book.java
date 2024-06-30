package org.example;

import java.io.Serial;
import java.io.Serializable;

public class Book implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private boolean isThere;
    private String name;
    private String authorName;
    Book(String name, String authorName){
        this.name = name;
        this.authorName = authorName;
    }
    String getName(){
        return name;
    }
    String getAuthorName(){
        return  authorName;
    }
    boolean getIsThere(){
        return isThere;
    }
    public void setBorrowBook(boolean isThere) {
        this.isThere = isThere;
    }

    @Override
    public String toString() {
        return String.format("%s by %s", name, authorName);
    }
}