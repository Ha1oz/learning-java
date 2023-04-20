package org.example;

import java.util.ArrayList;
import java.util.List;

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
    }

    public static void Ex1() {
        byte aByte = 10;
        short bShort = 250;
        int cInt = 2345698;
        long dLong = 230230402L;
        float eFloat = 2.4f;
        double fDouble = 229450295.1234856f;

        System.out.printf("The value of the variable aByte with type byte is %d\n", aByte);
        System.out.printf("The value of the variable bShort with type short is %d\n", bShort);
        System.out.printf("The value of the variable cInt with type int is %d\n", cInt);
        System.out.printf("The value of the variable dLong with type long is %d\n", dLong);
        System.out.printf("The value of the variable eFloat with type float is %f\n", eFloat);
        System.out.printf("The value of the variable fDouble with type double is %f\n", fDouble);
    }
    public static void Ex2() {
        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;

        System.out.printf("%.2f - %d - %f - %d - %d - %d - %d\n", a,b,c,d,e,f,g);
    }
    public static void Ex3() {
        System.out.printf("There are %d sheets of paper per student.\n", 480 / (23+27+30));
    }
    public static void Ex4() {
        float productivity = 16f/2f;

        System.out.printf("For 20 minutes the machine produced %.0f pieces of bottles\n", productivity * 20);
        System.out.printf("For day the machine produced %.0f pieces of bottles\n", productivity * 24*60);
        System.out.printf("For 3 day the machine produced %.0f pieces of bottles\n", productivity * 3*24*60);
        System.out.printf("For month the machine produced %.0f pieces of bottles\n", productivity * 30*24*60);
    }
    public static void Ex5() {
        System.out.printf("A school with %d classes needs %d cans of white paint and %d cans of brown paint\n",
                120/(2+4), 120/(2+4) * 2, 120/(2+4) * 4);
    }
    public static void Ex6() {
        float totalWeight = 5f * 80f + 2f * 105f + 2f * 100f + 4f * 70f;

        System.out.printf("Total weight of breakfast %.2fg (%.2fkg)\n",
                totalWeight, totalWeight/1000);
    }
    public static void Ex7() {
        System.out.printf("It takes days to lose weight if you drop 250g a day: %.1f\n", 7f * 1000f / 250f);
        System.out.printf("It takes days to lose weight if you drop 500g a day: %.1f\n", 7f * 1000f / 500f);
        System.out.printf("It takes days to lose weight if you drop average a day: %.1f\n", 7f * 1000f / ((500f+250f)/2f));
    }
    public static void Ex8() {
        double salary = 67760f;
        double newSalary = salary * 1.1f;

        System.out.printf("Masha now receives %.2f rubles. Her annual income has increased by %.1f rubles\n",
                newSalary, newSalary*12f - salary*12f);

        salary = 83690f;
        newSalary = salary * 1.1f;

        System.out.printf("Denis now receives %.2f rubles. Her annual income has increased by %.1f rubles\n",
                newSalary, newSalary*12f - salary*12f);

        salary = 76230f;
        newSalary = salary * 1.1f;

        System.out.printf("Kristina now receives %.2f rubles. Her annual income has increased by %.1f rubles\n",
                newSalary, newSalary*12f - salary*12f);
    }

}