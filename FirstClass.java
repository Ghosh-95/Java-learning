public class FirstClass {
    public static void main(String[] args) {
        // Variables
        int myAge = 23;
        String name = "Sushovan Ghosh";
        String description = "Hello, my name is " + name + " and I am " + myAge + " years old.";

        String userName = name;

        // Print Statemetns
        System.out.println("Hello World!!");
        System.out.println(description + userName);
        System.out.println("Code completed");

        System.out.println(34);
        System.out.println(true);
        System.out.println();

        // Calling another function
        another(args);
    }

    public static void another(String[] args) {
        System.out.println("Second function");
    }
}