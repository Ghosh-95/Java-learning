package data_types;

public class Primitive {

    public static void main(String[] args) {

        // There are 8 primitive data types in Java

        byte x = 127;
        short a = 32767;
        int b = 2147483647;
        long c = 9223372036854775807L;

        float d = 9.8f;
        double pi = 3.14159265359d;

        char myInitial = 'S';

        System.out.println(x + "\n" + a + "\n" + b + "\n" + c + "\n" + d + "\n" + pi + "\n" + myInitial);

        // MAX_VALUE and MIN_VALUE represents maximum and minimum value, that can be
        // stored in Java as numbers, respectively.
        double maxDouble = Double.MAX_VALUE;
        double minDouble = Double.MIN_VALUE;

        System.out.println("Maximum double number " + maxDouble);
        System.out.println("Min double number " + minDouble);

    }
}
