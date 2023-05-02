package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Ex1();
        Ex2();
        Ex3();
        Ex4();
    }
    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    private static void Ex1() {
        int[] paymentsArray = generateRandomArray();
        System.out.printf("The amount spent during the month was %d rubles.\n",
                Arrays.stream(paymentsArray).sum());
    }
    private static void Ex2() {
        int[] paymentsArray = generateRandomArray();
        System.out.printf("The minimum amount spent per day was %d rubles. The maximum amount spent per day was %d rubles.\n",
                Arrays.stream(paymentsArray).min().orElseThrow(),
                Arrays.stream(paymentsArray).max().orElseThrow());
    }
    private static void Ex3() {
        int[] paymentsArray = generateRandomArray();
        System.out.printf("The average amount spent per month was %.2f rubles.\n",
                Arrays.stream(paymentsArray).sum() / (double) paymentsArray.length);
    }
    private static void Ex4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }

    

}