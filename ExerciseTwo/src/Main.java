public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: print out your initials using System.out.print and then a char literal,
     * i.e. 'a', 'b', 'c'. You will need multiple print statements
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        //Fabrizio
        System.out.println('F');
        //Farfan
        System.out.println('F');
    }

    /**
     * 2: Print out your age as an int literal, i.e. 28, then print whether or not you've
     * had lunch today as a boolean literal i.e. true, false, then print the price of
     * your lunch as a double, i.e. 4.99
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");

        System.out.println(26);
        System.out.println(false);
        System.out.println(7.89);
    }

    /**
     * 3: Complete exercise 2, but store the values in a variable.
     * And then print out the variable.
     *
     * i.e.
     * char favouriteLetter = 'g';
     * System.out.print("My favourite letter=");
     * System.out.println(favouriteLetter)
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        int age= 26;
        boolean hadLunchToday= false;
        double priceLunch= 7.89;
        System.out.println("My age is= " + age);
        System.out.println("Have you eaten your lunch today= " + hadLunchToday);
        System.out.println("Price of launch= " + priceLunch +"eu");
    }
}
