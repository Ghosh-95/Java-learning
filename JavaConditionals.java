import java.util.Scanner;

public class JavaConditionals {
    public static void main(String[] args) {
        int age = 24;

        if (age >= 18) {
            System.out.println("Eligible to Drive.");
        } else {
            System.out.println("Not old enugh to drive.");
        }

        int time = 8;

        if (time <= 10) {
            System.out.println("Good morning!");
        } else if (time > 10 && time < 18) {
            System.out.println("Good day!");
        } else {
            System.out.println("Good evening!");
        }

        String isEligibleToVote = age >= 21 ? "Eligible to Vote" : "Not eligible";

        System.out.println(isEligibleToVote);

        try (Scanner input = new Scanner(System.in)) {
            int day = input.nextInt();
            switch (day) {
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
                default:
                    System.out.println("Weekend");
            }
        }
    };
}
