package ru.netology.javaqamvn.catalog.domain;

public class Book extends Product {
    private String author;
    private String name;

    public Book(int id, String name, String author, int price) {
        super(id, name, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
