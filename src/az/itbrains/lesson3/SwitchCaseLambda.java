package az.itbrains.lesson3;

import java.util.Scanner;

public class SwitchCaseLambda {

    public static void main(String[] args) {
        System.out.println("Please enter day number");
        Scanner scanner = new Scanner(System.in);
        int daysOfWeek = scanner.nextInt();

        switch (daysOfWeek) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Please enter valid day");
        }
    }
}
