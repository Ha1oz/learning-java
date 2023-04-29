package org.example;

public class Main {
    public static void main(String[] args) {
        Ex1();
        Ex2();
        Ex3();
        Ex4(7.0);
        Ex5(7.0);
        Ex6(7.0);
        for (int i = 1; i < 8; i++) {
            Ex7(i);
        }
        Ex8(2023);
    }
    private static void Ex1() {
        int balance = 0;
        int month = 0;

        while (balance < 2_459_000) {
            month++;
            balance += 15_000;
            System.out.printf("Month %d, the amount of savings equals %d rubles.\n", month,  balance);
        }

        System.out.println();
    }
    private static void Ex2() {
        int i = 0;
        StringBuilder stringBuilder = new StringBuilder();

        while (i < 10) {
            i++;
            stringBuilder.append(i).append(" ");
        }

        stringBuilder.append("\n");

        for (i = 10; i > 0; i--) {
            stringBuilder.append(i).append(" ");
        }

        System.out.println(stringBuilder);
        System.out.println();
    }
    private static void Ex3() {
        long population = 12_000_000;
        final int YEAR = 2023;

        for (int i = 1; i < 11; i++) {
            long birthrate = population/1000*17, mortality = population/1000*8;
            population += (birthrate - mortality);

            System.out.printf("The year is %d, the population is %d\n", YEAR + i, population);
        }

        System.out.println();
    }
    private static void Ex4(double depositPercent) {
        double balance = 0.0;
        int month = 0;

        while (balance < 12_000_000) {
            month++;
            balance += 15_000.0 / 100.0 * (100.0 + depositPercent);

            System.out.printf("Month %d, the amount of savings equals %.2f rubles.\n", month,  balance);
        }

        System.out.println();
    }

    private static void Ex5(double depositPercent) {
        double balance = 0.0;
        int month = 0;

        while (balance < 12_000_000.0 || month % 6 != 0) {
            month++;
            balance += 15_000.0 / 100.0 * (100.0 + depositPercent);

            if (month % 6 != 0) {
                continue;
            }

            System.out.printf("Month %d, the amount of savings equals %.2f rubles.\n", month,  balance);
        }
        
        System.out.println();
    }

    private static void Ex6(double depositPercent) {
        double balance = 0.0;
        int month = 0;

        while (month < 9 * 12) {
            month++;
            balance += 15_000.0 / 100.0 * (100.0 + depositPercent);

            if (month % 6 != 0) {
                continue;
            }

            System.out.printf("%d year, %d month, the amount of savings equals %.2f rubles.\n", month / 12, month % 12, balance);
        }

        System.out.println();
    }

    private static void Ex7(final int firstFriday) {
        if (firstFriday < 1 || firstFriday > 7) {
            throw new RuntimeException("Wrong first friday day number. Must be from 1 to 7.");
        }

        for (int day = 1; day <= 31; day++) {
            if (day % 7 == firstFriday || (day % 7 == 0 && firstFriday == 7)) {
                System.out.printf("Today is Friday, the %dth day. You need to prepare a report!\n", day);
            }
        }

        System.out.println();
    }

    private static void Ex8(final int currentYear) {
        final int periodOfTime = 79;
        final int upperLimitTimeline = currentYear + 100;
        int lowerLimitTimeline = currentYear - 200;

        for (int i = lowerLimitTimeline; i < lowerLimitTimeline + periodOfTime; i++) {
            if (i % periodOfTime == 0) {    //To get smaller iterations of the cycle,
                lowerLimitTimeline = i;     // I find the first year in which the comet flies over.
                break;
            }
        }

        for (int year = lowerLimitTimeline; year <= upperLimitTimeline; year+=periodOfTime) {   //After that, without checking,
            System.out.println(year); // I find all the years in a certain time interval when the comet flies over.
        }

        System.out.println();
    }
}