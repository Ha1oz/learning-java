package org.example.entities;

import org.example.utility.DataChecker;

public record Author(String name, String surname) {
    public Author {
        if (!DataChecker.isDataCorrect(name, surname)) {
            throw new RuntimeException("Invalid author data.");
        }
    }

}
