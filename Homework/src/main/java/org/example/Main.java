package org.example;

public class Main {
    public static void main(String[] args) {
        Ex1("ios");
        Ex2("android", (short) 2013);
        Ex3((short) 200);
        Ex4(21);
        Ex5((byte) 5);
    }

    private static boolean Ex1Logic(String OS) {
        boolean clientOS;

        switch (OS) {
            case "android" -> {
                clientOS = true;
            }
            case "ios" -> {
                clientOS = false;
            }
            default -> {
                throw new RuntimeException("Incorrect OS type. It can be only ios/android");
            }
        }

        return clientOS;
    }
    private static void Ex1(String OS) {
        if (Ex1Logic(OS)) {
            System.out.println("Install the Android version of the app here");
            return;
        }
        System.out.println("Install the iOS version of the app here");
    }

    private static void Ex2(String OS, short productionYear) {
        if (Ex1Logic(OS) && productionYear < 2015) {
            System.out.println("Install the light version of the Android app here");
            return;
        }
        if (!Ex1Logic(OS) && productionYear < 2015) {
            System.out.println("Install the light version of the iOS app here");
        }
        Ex1(OS);
    }

    private static void Ex3(Short year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " is a leap year");
            return;
        }
        System.out.println(year + " is not a leap year");
    }

    private static void Ex4(Integer deliveryDistance) {
        if (deliveryDistance > 100) {
            System.out.println("No delivery");
            return;
        }

        byte deliveryTime = 0;

        if (deliveryDistance > 20) {
            deliveryTime++;
        }

        if (deliveryDistance > 60) {
            deliveryTime++;
        }
        deliveryTime++;

        System.out.println("It will take days: " + deliveryTime);

    }

    private static void Ex5(byte monthNumber) {

        String season = switch (monthNumber) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default -> throw new RuntimeException("Incorrect month number.");
        };

        System.out.println(season);
    }

}