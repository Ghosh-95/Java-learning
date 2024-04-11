import java.util.*;

public class Input {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String greetings = sc.next();
            String name = sc.next();

            int age = sc.nextInt();
            float height = sc.nextFloat();

            System.out.println(greetings + ", " + name + ". I am " + height + " tall and " + age + " years old.");
        }
    }
}
