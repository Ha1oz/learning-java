package org.example.entities;

import org.example.utility.DataChecker;

import java.util.Objects;

public record Author(String name, String surname) {
    public Author {
        if (!DataChecker.isDataCorrect(name, surname)) {
            throw new RuntimeException("Invalid author data.");
        }
    }
    @Override
    public boolean equals(Object o) { //This is unnecessary because class-record
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return name.equals(author.name) && surname.equals(author.surname);
    }
    @Override
    public int hashCode() { //This is unnecessary because class-record
        return Objects.hash(name, surname);
    }
    @Override
    public String toString() { //This is unnecessary because class-record
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
