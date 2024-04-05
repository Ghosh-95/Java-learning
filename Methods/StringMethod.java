package Methods;

public class StringMethod {
    public static void main(String[] args) {
        String goal = "learn basics of Java in 30 days.";

        int goalLength = goal.length();
        System.out.println(goalLength); // 32

        String uppperCaseGoal = goal.toUpperCase();
        String lowerCaseGoal = goal.toLowerCase();

        System.out.println(uppperCaseGoal); // LEARN BASICS OF JAVA IN 30 DAYS.
        System.out.println(lowerCaseGoal); // learn basics of java in 30 days.

        int indexOfJava = goal.indexOf("Java");
        System.out.println(indexOfJava); // 16

        String info = "I am Sushovan, my goal is to ";
        String myIntro = info.concat(goal);
        // String myIntro = info + goal;
        System.out.println(myIntro); // I am Sushovan, my goal is to Learn basics of Java in 30 days.
    }
}