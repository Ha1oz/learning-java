package org.example.utility;

public class DataChecker {
    public static boolean isDataCorrect(String... data) {
        for (String s : data) {
            if (s.isBlank() || s.isEmpty()) {
                return false;
            }
        }
        return true;
    }
}
