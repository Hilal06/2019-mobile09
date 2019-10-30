package com.example.project2.models;

public class Book {
    private int bookCover;
    private String title;
    private String isbn;
    private String publisher;
    private String pubDate;
    private String author;
    private double price;

    public Book() {
    }

    public Book(int bookCover, String title, String isbn, String publisher, String pubDate, String author, double price) {
        this.bookCover = bookCover;
        this.title = title;
        this.isbn = isbn;
        this.publisher = publisher;
        this.pubDate = pubDate;
        this.author = author;
        this.price = price;
    }

    public int getBookCover() {
        return bookCover;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getPubDate() {
        return pubDate;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
}
