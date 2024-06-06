package az.itbrains.lesson2;

import java.util.Random;

public class WhileExample2 {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 7};

        Random random = new Random();
        int count = 0;

        int randomNumber = 0;
        for (int i = 0; i < numbers.length; i++) {
            while (numbers[i] != randomNumber) {
                randomNumber = random.nextInt(1, 100);
                count++;
            }
            System.out.println(numbers[i] + " ededini " + count + " defeye tapdi ");
            count = 0;
        }

    }

}
