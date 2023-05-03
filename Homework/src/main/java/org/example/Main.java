package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Ex1("Ivanov Ivan Ivanovich");
        Ex2("Ivanov Ivan Ivanovich");
        Ex3("Дмитриев Семён Семёнович");
    }
    private static void Ex1(final String fullName) {
        String[] params = fullName.split(" ");
        String firstName = params[1];
        String lastName = params[2];
        String middleName = params[0];

        System.out.printf("The name of the employee is %s %s %s\n",
                middleName, firstName, lastName);
    }
    private static void Ex2(final String fullName) {
        System.out.printf("Employee's full name data to fill out the report - %s\n",
                fullName.toUpperCase());
    }
    private static void Ex3(String fullName) {
        fullName = fullName.replaceAll("ё", "е");
        System.out.printf("The name of the employee is %s\n", fullName);
    }
}