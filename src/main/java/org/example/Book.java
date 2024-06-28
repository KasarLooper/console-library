package org.example;

import java.util.ArrayList;

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
        return isThere = true;
    }
    public boolean setBorrowBook(){
        return false;
    }
}
