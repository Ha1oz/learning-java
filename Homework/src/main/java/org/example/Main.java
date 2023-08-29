package org.example;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9};
        System.out.println("numbers = " + Arrays.toString(numbers));
        System.out.println("difNumbers(numbers) = " + Arrays.toString(difNumbers2(numbers)));
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
}