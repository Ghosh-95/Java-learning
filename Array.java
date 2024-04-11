class Array {
    public static void main(String[] args) {
        String myName = "Sushovan Ghosh";

        String[] fruits = { "mango", "grape", "banana", "apple" };

        // Change an array item
        fruits[0] = "Jackfruit";

        System.out.println(myName + " loves to eat " + fruits[0]);

        int[] nums = { 2, 3, 4, 8, 9, 19, 76 };
        System.out.println(nums[2]); // prints the third item

        System.out.println(fruits.length);

        // multidimensional array
        int[][] myNumbers = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 } };

        // access values in multidimensional array
        System.out.println(myNumbers[1][2]);
    }
}
