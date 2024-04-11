public class Loops {
    public static void main(String[] args) {

        // While loop
        int i = 0;
        while (i < 6) {
            System.out.println(i);
            i++;
        }

        System.out.println('\n');

        // Do-while loop
        int j = 10;
        do {
            System.out.println(j);
            j++;
        } while (j < 20);

        System.out.println('\n');

        // for loop
        for (int k = 20; k <= 30; k++) {
            System.out.println(k);
        }

        System.out.println('\n');

        for (int a = 0; a < 5; a++) {
            System.out.println("Parent Executes " + (a + 1) + " times");

            for (int b = 1; b <= 8; b++) {
                System.out.println("Child Executes " + b);
            }
        }

        System.out.println('\n');

        String[] fruits = { "Mango", "Apple", "Banana", "Pineapple" };

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        for (int p = 0; p < 10; p++) {
            if (p == 5) {
                break;
            }

            System.out.println(p);
        }

        for (int c = 0; c < 10; c++) {
            if (c == 7) {
                continue;
            }

            System.out.println(c);
        }
    }
}
