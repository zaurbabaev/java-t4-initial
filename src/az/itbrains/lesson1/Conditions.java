package az.itbrains.lesson1;

import java.util.Scanner;

/*
F Qeyri-kafi 51-dən aşağı
E Qənaətbəxş 51-60
D Kafi 61-70
C Yaxşı 71-80
B Çox yaxşı 81-90
A Əla 91-100
 */
public class Conditions {
    public static void main(String[] args) {
        System.out.println("Bal daxil edin");
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                String line = scanner.nextLine();
                if ("exit".equalsIgnoreCase(line)) {
                    break;
                }
                if (Integer.parseInt(line) <= 50 || Integer.parseInt(line) > 100) {
                    System.out.println("Minimal 51 maximal 100 bal daxil edin");
                } else if (Integer.parseInt(line) <= 51) {
                    System.out.println("Qeyri-kafi \"F\"");
                } else if (Integer.parseInt(line) <= 60) {
                    System.out.println("Qənaətbəxş \"E\"");
                } else if (Integer.parseInt(line) <= 70) {
                    System.out.println("Kafi \"D\"");
                } else if (Integer.parseInt(line) <= 80) {
                    System.out.println("Yaxşı \"C\"");
                } else if (Integer.parseInt(line) <= 90) {
                    System.out.println("Çox yaxşı \"B\"");
                } else if (Integer.parseInt(line) <= 100) {
                    System.out.println("Əla \"A\"");
                }
            }
        }
    }
}
