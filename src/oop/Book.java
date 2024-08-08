package oop;

import java.util.ArrayList;

public class Book {
    private final String title;
    private final String author;
    private ArrayList<String> collection;

    public Book(String title, String author, ArrayList<String> collection) {
        this.title = title;
        this.author = author;
        this.collection = collection;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public ArrayList<String> getCollection() {
        return this.collection;
    }

    public void addToCollection(String item) {
        this.collection.add(item);
    }
}
