package az.itbrains.lesson2;

import java.util.Random;

public class WhileExample {
    public static void main(String[] args) {

        int[] number = {2, 5, 7};


        int count = 0;
        Random random = new Random();
        for (int i = 0; i < number.length; i++) {
            int randomNumber = 0;
            int myNumber = number[i];
            while (myNumber != randomNumber) {
                randomNumber = random.nextInt(1, 100);
                count++;
                break;
            }
            System.out.println(number[i] + " ededi "+count+" defeye tapildi ");
        }
    }
}
