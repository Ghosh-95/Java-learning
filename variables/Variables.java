package variables;

public class Variables {
    // Static variable
    static int number = 100;

    public static void main(String[] args) {

        // instance variable
        int number = 300;

        System.out.println(number);
    }

    void method() {
        // local variable
        int num = 200;

        System.out.println(num);
    }
}
