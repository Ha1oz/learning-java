package org.example;

public class Main {
    public static void main(String[] args) {
        Ex1();
        Ex2();
        Ex3();
        Ex4();
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
    private static void Ex4() {
        
    }
    

}