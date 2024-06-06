package az.itbrains.lesson3;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        String[] students = {"Zaur", "Sebuhi", "Ayxan", "Rehman"};

        for (int i = 0; i < students.length; i++) {
            System.out.println("student = " + students[i]);
        }

        System.out.println();

        for (String student : students) {
            System.out.println(student);
        }

        System.out.println();

        Arrays.stream(students).forEach(System.out::println);
    }
}
