package az.itbrains.lesson4;

public class DecimalToHexedecimal {
    public static void main(String[] args) {


        int[] rgb = {230, 126, 34}; // e67e22

        int hex = 0;
        int remainder = 0;

        for (int i : rgb) {
            hex = i % 16;
            remainder = i / 16;


                        System.out.println(switch (remainder) {
                        case 10 -> String.valueOf("A");
                        case 11 -> String.valueOf("B");
                        case 12 -> String.valueOf("C");
                        case 13 -> String.valueOf("D");
                        case 14 -> String.valueOf("E");
                        case 15 -> String.valueOf("F");

                        default -> throw new IllegalStateException("Unexpected value: " + remainder);
                    }
            );

            System.out.println(remainder + "" + hex);

        }


        for (int i : rgb) {

            String hexString = Integer.toHexString(i);
            System.out.print(hexString);
        }


    }
}
