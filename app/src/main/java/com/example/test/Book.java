package com.example.test;

public class Book {
    private String title;
    private String author;
    private int pages;
    private int year;

    public Book(String title, String author, int pages,int year) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
