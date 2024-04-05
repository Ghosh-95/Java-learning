package variables;

public class Variables {
    // Static variable
    static int number = 100;

    public static void main(String[] args) {

        // instance variable
        int number = 300;

        System.out.println(number);

        int x, y = 5;
        x = 23;
        System.out.println(x + y);

        x = 90;
        y = 10;
        System.out.println(x + y);

        // final variable
        final int a = 250;
        // a = 22;
        System.out.println(a);

        final String name = "Sushovan";
        // name = "Sujata";
        System.out.println(name);
    }

    void method() {
        // local variable
        int num = 200;

        System.out.println(num);
    }
}
