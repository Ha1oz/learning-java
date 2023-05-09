package org.example;

import org.example.entities.Author;
import org.example.entities.Book;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Lev", "Tolstoy");
        Author author2 = new Author("Mikhail", "Bulgakov");

        Book book1 = new Book("The war and peace", author1, 2003);
        Book book2 = new Book("The Master and Margarita", author2, 2014);


        System.out.println(book1);
        System.out.println(book2);
        System.out.println(author1);
        System.out.println(author2);

        book1.setProductionYear(2010);
        System.out.println(book1.getProductionYear());

        System.out.println(book1.hashCode());
        System.out.println(author1.hashCode());

        System.out.println(book1.equals(book2));
        System.out.println(book2.equals(new Book("The Master and Margarita", author2, 2014)));
    }
}