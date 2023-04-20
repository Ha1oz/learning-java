package org.example;

public class Main {
    public static void main(String[] args) {
        var dog = 8.0f;
        var cat = 3.6f;
        var paper = 763789;
        Ex1(dog, cat, paper);
        Ex2(dog, cat, paper);
        Ex3(dog, cat, paper);
        Ex4();
        Ex5();
        Ex6();
        Ex7();
        Ex8();
    }
    public static void Ex1(Float value1, Float value2, Integer value3) {
        System.out.printf("\ndog: %.1f\ncat: %.1f\npaper: %d\n", value1, value2, value3);
    }

    public static void Ex2(Float value1, Float value2, Integer value3) {
        value1 += 4f;
        value2 += 4f;
        value3 += 4;
        System.out.printf("\ndog: %.1f\ncat: %.1f\npaper: %d\n", value1, value2, value3);
    }
    public static void Ex3(Float value1, Float value2, Integer value3) {
        value1 -= 3.5f;
        value2 -= 1.6f;
        value3 -= 7639;
        System.out.printf("\ndog: %.1f\ncat: %.1f\npaper: %d\n", value1, value2, value3);
    }
    public static void Ex4() {
        var friend = 19;
        System.out.printf("\nfriend: %d", friend);
        friend += 2;
        System.out.printf("\nfriend: %d", friend);
        friend /= 7;
        System.out.printf("\nfriend: %d", friend);
    }
    public static void Ex5() {
        var frog = 3.5f;
        System.out.printf("\n\nfrog: %.1f", frog);
        frog *= 10;
        System.out.printf("\nfrog: %.1f", frog);
        frog /= 3.5f;
        System.out.printf("\nfrog: %.1f", frog);
        frog += 4f;
        System.out.printf("\nfrog: %.1f", frog);
    }
    public static void Ex6() {
        var fighter1 = 78.2f;
        var fighter2 = 82.7f;

        System.out.printf("\n\nTotal weight: %.1f", fighter1 + fighter2);
        System.out.printf("\nWeight difference: %.1f", Math.abs(fighter1 - fighter2));
    }
    public static void Ex7() {
        var fighter1 = 78.2f;
        var fighter2 = 82.7f;

        System.out.printf("\n\nWeight difference: %.1f", fighter2 - fighter1);
        System.out.printf("\nWeight difference: %.1f", fighter2 % fighter1);
    }
    public static void Ex8() {
        var totalHours = 640;
        var hoursPerPerson = 8;

        System.out.printf("\n\nThe total number of employees in the company - %d - persons", totalHours / hoursPerPerson);

        System.out.printf("\nIf a company employs %d people, then a total of %d hours of work can be divided among employees",
                totalHours / hoursPerPerson + 94, totalHours + 94 * hoursPerPerson);
    }
}