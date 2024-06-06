package az.itbrains.lesson3;

public class ArrayExample2 {
    public static void main(String[] args) {
        int[] firstNumber = {1, 2, 3, 4, 5, 9};
        int[] secondNumber = {1, 2, 3, 4, 5};

        int firstResult = 0;
        int secondResult = 0;
        int result = 0;

        for (int i : firstNumber) {
            firstResult += i;
        }

        for (int i : secondNumber) {
            secondResult += i;
        }

        if (firstResult > secondResult) {
            result = firstResult - secondResult;
        } else {
            result = secondResult - firstResult;
        }

        System.out.println(result);

    }
}
