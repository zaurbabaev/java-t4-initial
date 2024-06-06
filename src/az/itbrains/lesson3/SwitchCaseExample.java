package az.itbrains.lesson3;

import java.util.Scanner;

public class SwitchCaseExample {
    public static void main(String[] args) {

        System.out.println("Please enter day number");
        Scanner scanner = new Scanner(System.in);
        int daysOfWeek = scanner.nextInt();

        switch (daysOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Please enter valid day");
        }
    }
}
