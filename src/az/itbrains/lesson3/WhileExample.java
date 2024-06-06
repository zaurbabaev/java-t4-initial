package az.itbrains.lesson3;

import java.util.Random;

public class WhileExample {
    public static void main(String[] args) {

        int[] numbers = {2, 5, 18};
        Random random = new Random();

        int count = 0;
        int randomNumber = 0;
        for (int number : numbers) {
            while (number != randomNumber) {

                randomNumber = random.nextInt(1, 100);
//                System.out.println(randomNumber);
                count++;

            }
            System.out.printf("%d ədədi %d gedişdən sonra tapıldı \n", number, count);
            count = 0;
        }

    }
}
