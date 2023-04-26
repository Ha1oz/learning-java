package org.example;

public class Main {
    public static void main(String[] args) {
        Ex1();
        Ex2();
        Ex3();
        Ex4();
        Ex5();
        Ex6();
        Ex7();
        Ex8();
        Ex9();
        Ex10();
    }
    private static void Ex1() {
        for (int i = 1; i < 11; i++) {
            System.out.println("i : " + i);
        }
        System.out.println();
    }
    private static void Ex2() {
        for (int i = 10; i > 0; i--) {
            System.out.println("i : " + i);
        }
        System.out.println();
    }
    private static void Ex3() {
        for (int i = 0; i < 18; i+=2) {
            System.out.println("i : " + i);
        }
        System.out.println();
    }
    private static void Ex4() {
        for (int i = 10; i > -11; i--) {
            System.out.println("i : " + i);
        }
        System.out.println();
    }

    private static void Ex5() {
        for (int i = 1904; i < 2097; i+=4) {
            System.out.println("The year is a leap year : " + i);
        }
        System.out.println();
    }
    private static void Ex6() {
        for (int i = 1; i < 15; i++) {
            System.out.print(i * 7 + " ");
        }
        System.out.println();
    }
    private static void Ex7() {
        for (int i = 0; i < 10; i++) {
            System.out.print((int) Math.pow(2, i) + " ");
        }
        System.out.println();
    }
    private static void Ex8() {
        for (int i = 1; i < 13; i++) {
            System.out.printf("Month %d, the amount of savings equals %d rubles.\n", i,  i * 29000);
        }
        System.out.println();
    }
    private static void Ex9() {
        for (int i = 1; i < 13; i++) {
            System.out.printf("Month %d, the amount of savings equals %.2f rubles.\n", i,  i * 29000 * 1.01f);
        }
        System.out.println();
    }
    private static void Ex10() {
        for (int i = 1; i < 11; i++) {
            System.out.println("2*" + i + "=" + 2*i);
        }
        System.out.println();
    }
    

}