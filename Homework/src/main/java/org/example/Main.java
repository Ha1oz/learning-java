package org.example;


import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] numbers = {1,2,3,4,5,6,7,8,9};
        System.out.println("numbers = " + Arrays.toString(numbers));
        System.out.println("difNumbers2(numbers) = " + Arrays.toString(difNumbers2(numbers)));
        System.out.println("difNumbers3(numbers) = " + Arrays.toString(difNumbers3(numbers)));


        Person person1 = new Person("John", "SPB");
        Person person2 = new Person("Mike", "Moscow");

        Person person3 = new Person("John", "SPB");
        Person person4 = person1;


        Set<Person> set = new HashSet<>();
        set.add(person1);
        set.add(person2);
        set.add(person3);


        System.out.println("person1.equals(person2) = " + person1.equals(person2));
        System.out.println("person1.equals(person3) = " + person1.equals(person3));
        System.out.println("person1.equals(person1) = " + person1.equals(person4));

        System.out.println("person1.hashCode() = " + person1.hashCode());
        System.out.println("person2.hashCode() = " + person2.hashCode());
        System.out.println("person3.hashCode() = " + person3.hashCode());
        System.out.println("person4.hashCode() = " + person4.hashCode());

        System.out.println("set = " + set);


        if (set.size() == 3) {
            throw new IOException();
        }
    }

    private static int[] difNumbers2(int[] numbers) {
        int[] res = new int[5];
        int j=0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                numbers[i]++;
            }
            if (i >= 2 && i <= 6) {
                res[j] = numbers[i];
                j++;
            }
        }
        return res;
    }
    private static int[] difNumbers3(int[] numbers) {
        int[] res = new int[5];

        for (int i = 0; i < res.length; i++)
            res[i] = numbers[i + 2] % 2 == 0 ? numbers[i+2]+1 : numbers[i+2];

        return res;
    }
}