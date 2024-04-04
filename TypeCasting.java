public class TypeCasting {
    public static void main(String[] args) {

        int myAge = 24;
        double floatAge = myAge; // Widening casting

        System.out.println(floatAge);

        double gravity = 9.8d;
        int intGravity = (int) gravity; // Narrowing casting

        System.out.println(intGravity);

        long longNumber = 465465464546L;
        short shortNumber = (short) longNumber;

        System.out.println(shortNumber);
    }
}
