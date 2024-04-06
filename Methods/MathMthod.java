package Methods;

public class MathMthod {
    public static void main(String[] args) {

        double x = -4.2;
        System.out.println(Math.abs(x));

        System.out.println("Maximum number between 28 and 2987798 is " + Math.max(28, 2987798)); // 2987798
        System.out.println("Minimum number between 28 and 2987798 is " + Math.max(28, 2987798)); // 28

        System.out.println("Square root of 81 is " + (int) Math.sqrt(81)); // 9
        System.out.println("Cube root of 81 is " + Math.round(Math.cbrt(27))); // 9

        System.out.println((int) Math.floor(9.62));
        System.out.println(Math.ceil(9.62));

        int random = (int) Math.floor(Math.random() * 10) + 1;
        System.out.println(random);
    }
}
