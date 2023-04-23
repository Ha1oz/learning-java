package org.example;

public class Main {
    public static void main(String[] args) {
        Ex1((byte) 19);
        Ex2((byte) 10);
        Ex3((short) 30);
        Ex4((byte) 19);
        Ex5((byte) 18);
        Ex6((short) 102);
        System.out.println(Ex7(200, 120, 1000));
    }
    public static void Ex1(byte age) {
        System.out.print("If a person's age is " +  age + ", ");
        if (age < 18) {
            System.out.println("the age of majority is not yet reached and we have to wait a little longer.");
            return;
        }
        System.out.println("person's 18 years old or older");
    }
    public static void Ex2(byte temperature) {
        System.out.print("It's " + temperature + " degrees outside, ");
        if (temperature < 5) {
            System.out.println("you have to wear a wool cap.");
            return;
        }
        System.out.println("you can go without a wool cap.");
    }
    public static void Ex3(short speed) {
        System.out.print("If the speed is " + speed + ", then ");
        if (speed > 60) {
            System.out.println("you have to pay a fine.");
            return;
        }
        System.out.println("you can drive safely.");
    }
    public static void Ex4(byte age) {
        System.out.print("If a person's age is " + age + ", he should go ");
        if (age < 2) {
            System.out.println("nowhere.");
            return;
        }
        if (age <= 6) {
            System.out.println("to kindergarten.");
            return;
        }
        if (age <= 18) {
            System.out.println("to school.");
            return;
        }
        if (age <= 24) {
            System.out.println("to university.");
            return;
        }
        System.out.println("to work.");
    }
    public static void Ex5(byte age) {
        System.out.print("If a child's age is " + age + ", then he or she ");
        if (age < 5) {
            System.out.println("cannot ride the attraction.");
            return;
        }
        if (age < 14) {
            System.out.println("can ride only when accompanied by an adult. If there is no adult present, he cannot ride.");
            return;
        }
        System.out.println("can ride unaccompanied by an adult.");

    }
    public static void Ex6(short countOfPeople) {
        if (countOfPeople >= 102) {
            System.out.println("The wagon is already completely full.");
            return;
        }
        if (countOfPeople >= 60) {
            System.out.println("There is a standing place in the wagon.");
            return;
        }
        System.out.println("There is a seat in the wagon.");
    }
    public static int Ex7(Integer one, Integer two, Integer three) {
        if (one > two && one > three) {
            return one;
        }
        if (two > one && two > three) {
            return two;
        }
        return three;
    }

}