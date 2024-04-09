package Exercises;

import java.util.*;

class FirstFifteen {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // 1.
            System.out.println("Hello World!");

            // 2.
            System.out.println(25 + 23);

            // 3.
            /*
             * The value will be 16, because Java implicitly converts the reesult to
             * an integer
             */
            System.out.println(50 / 3);

            float a = 50, b = 3;
            System.out.println(a / b); // 16.6666666

            // 4.
            System.out.println(-5 + 8 * 6);
            System.out.println((55 + 9) % 9);
            System.out.println(20 + -3 * 5 / 8);
            System.out.println(5 + 15 / 3 * 2 - 8 % 3);

            // 5.
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println(num1 * num2);

            // 6.
            System.out.println(125 + 24);
            System.out.println(125 - 24);
            System.out.println(125 * 24);
            System.out.println(125 / 24);
            System.out.println(125 % 24);

            // 7.
            int numTable = sc.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.println(numTable + " X " + i + " = " + numTable * i);
            }

            // 8.
            System.out.println("   J    a   v     v   a  ");
            System.out.println("   J   a a   v   v   a a ");
            System.out.println("J  J  aaaaa   v v   aaaaa");
            System.out.println(" JJ  a     a   v   a     a");

            // 9.
            System.out.println((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));

            // 10.
            System.out.println(4.0 * (1 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11)));

            // 11.
            float radius = sc.nextFloat();
            double pi = (float) Math.PI;
            System.out.println("Perimeter of Circle is: " + 2 * pi * radius);
            System.out.println("Area of Circle is: " + Math.pow(radius, 2) * pi);

            // 12.
            float avNum1 = sc.nextFloat();
            float avNum2 = sc.nextFloat();
            float avNum3 = sc.nextFloat();
            float sum = avNum1 + avNum2 + avNum3;
            System.out.println("Average of these three number is: " + sum / 3);

            // 13.
            float width = sc.nextFloat();
            float height = sc.nextFloat();
            System.out.println("Perimeter of rectangle is " + 2 * (width + height));
            System.out.println("Area of rectangle is " + width * height);

            // 14.
            System.out.println("* * * * * * ==================================");
            System.out.println(" * * * * * ==================================");
            System.out.println("* * * * * * ==================================");
            System.out.println("* * * * * * ==================================");
            System.out.println(" * * * * * ==================================");
            System.out.println("* * * * * * ==================================");
            System.out.println(" * * * * * ==================================");
            System.out.println("* * * * * * ==================================");
            System.out.println("==============================================");
            System.out.println("==============================================");
            System.out.println("==============================================");
            System.out.println("==============================================");
            System.out.println("==============================================");
            System.out.println("==============================================");

            // 15.
            int firstVar = 5;
            int secondVar = 10;
            System.out.println("Before swapping, firstVar:" + firstVar + ", secondVar: " + secondVar);

            int temporary = firstVar;
            firstVar = secondVar;
            secondVar = temporary;
            System.out.println("After swapping, firstVar:" + firstVar + ", secondVar: " + secondVar);

        }
    }
}