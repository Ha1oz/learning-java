package org.example;

import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Ex1();
        Ex2();
        Ex3();
        Ex4();
    }
    private static void Ex1() {
        int[] arrayInt = new int[3];
        for (int i = 1; i < 4; i++) {
            arrayInt[i-1] = i;
        }

        float[] arrayFloat = {1.57f, 7.654f, 9.986f};

        String[] arrayString = {"AAAA", "BBBB", "CCCC"};
    }
    private static void Ex2() {
        int[] arrayInt = new int[3];
        for (int i = 1; i < 4; i++) {
            arrayInt[i-1] = i;
        }

        float[] arrayFloat = {1.57f, 7.654f, 9.986f};

        String[] arrayString = {"AAAA", "BBBB", "CCCC"};

        for (int v : arrayInt) {
            System.out.print(v);

            if (v != arrayInt[2]) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (float v : arrayFloat) {
            System.out.print(v);

            if (v != arrayFloat[2]) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (String v : arrayString) {
            System.out.print(v);

            if (v != arrayString[2]) {
                System.out.print(", ");
            }
        }
        System.out.println();

    }
    private static void Ex3() {
        int[] arrayInt = new int[3];
        for (int i = 1; i < 4; i++) {
            arrayInt[i-1] = i;
        }

        float[] arrayFloat = {1.57f, 7.654f, 9.986f};

        String[] arrayString = {"AAAA", "BBBB", "CCCC"};

        for (int i = 2; i >= 0; i--) {
            System.out.print(arrayInt[i]);

            if (arrayInt[i] != arrayInt[0]) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 2; i >= 0; i--) {
            System.out.print(arrayFloat[i]);

            if (arrayFloat[i] != arrayFloat[0]) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 2; i >= 0; i--) {
            System.out.print(arrayString[i]);

            if (!Objects.equals(arrayString[i], arrayString[0])) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    private static void Ex4() {
        int[] arrayInt = new int[3];
        for (int i = 1; i < 4; i++) {
            arrayInt[i-1] = i;
        }

        System.out.println(Arrays.toString(arrayInt));

        for (int i = 0; i < 3; i++) {
            if (arrayInt[i] % 2 != 0) {
                arrayInt[i]++;
            }
        }

        System.out.println(Arrays.toString(arrayInt));
    }
    

}