package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        isLeapYear(2021);
        isLeapYear(2024);
        isLeapYear(1900);

        whichVersionNeeds(0, 2023);
        whichVersionNeeds(1, 2023);
        whichVersionNeeds(0, 2021);
        whichVersionNeeds(1, 2020);

        System.out.println("Delivery time: " + checkDeliveryTime(19));
        System.out.println("Delivery time: " + checkDeliveryTime(60));
        System.out.println("Delivery time: " + checkDeliveryTime(100));
    }
    private static void isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " is a leap year");
            return;
        }

        System.out.println(year + " is not a leap year");
    }

    private static void whichVersionNeeds(int clientOS, int productionYear) {
        String version = "";

        if (needLightVersion(productionYear)) {
            version += "light ";
        }

        switch (clientOS) {
            case 0 -> version += "android";
            case 1 -> version += "IOS";
            default -> throw new RuntimeException("Incorrect OS type.");
        }

        System.out.printf("Install the %s version of the app here.\n", version);
    }

    private static boolean needLightVersion(int productionYear) {
        int currentYear = LocalDate.now().getYear();

        if (productionYear > currentYear) {
            throw new RuntimeException("The production year cannot be greater than the current year.");
        }

        return productionYear < currentYear;
    }

    private static int checkDeliveryTime(Integer deliveryDistance) {
        if (deliveryDistance < 0) {
            throw new RuntimeException("Delivery distance cannot be negative.");
        }
        if (deliveryDistance > 100) {
            throw new RuntimeException("No delivery. Delivery distance is too much.");
        }

        int deliveryTime = 1;

        if (deliveryDistance > 20) {
            deliveryTime++;
        }

        if (deliveryDistance > 60) {
            deliveryTime++;
        }

        return deliveryTime;
    }
}