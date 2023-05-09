package org.example.entities;

import org.example.utility.DataChecker;

public class Book {
    private final String title;
    private final Author author;
    private int productionYear;

    public Book(String title, Author author, int productionYear) {
        if (!DataChecker.isDataCorrect(title)) {
            throw new RuntimeException("Invalid book data.");
        }

        this.title = title;
        this.author = author;
        this.productionYear = productionYear;
    }
    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getProductionYear() {
        return productionYear;
    }
    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }
    @Override
    public String toString() {
        return "Book[" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", productionYear=" + productionYear +
                ']';
    }
}
