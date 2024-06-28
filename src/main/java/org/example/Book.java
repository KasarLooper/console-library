package org.example;

public class Book {
    boolean isThere;
    String name;
    String authorName;

    Book(String name, String autorName){
        this.name = name;
        this.authorName = autorName;
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
