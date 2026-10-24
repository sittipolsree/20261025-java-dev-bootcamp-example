package fundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Iteration {
    public static void main(String[] args) {
        plainForLoop();
        line();
        whileLoop();
        line();
        doWhileLoop();
        line();
        recursiveExample(5);
        line();
        forEachExample();
    }

    private static void line() {
        System.out.println("==========");
    }

    public static void plainForLoop() {
        String message = "";
        // building block - Initialization, Condition, Updating
        for (int i = 1; i <= 10; i++) {
            message += i; // message = message + i
        }
        System.out.println("plainForLoop: " +  message);
    }

    public static void whileLoop() {
        Random rnd = new Random();
        int dice = 1;
        int counter = 0;
        // Check before do something
        while (dice != 4) {
            dice = rnd.nextInt(6) + 1;
            System.out.println("Dice: " + dice);
            counter++;
        }
        System.out.println("WhileLoop dice amount until 4: " +  counter);
    }

    public static void doWhileLoop() {
        Random rnd = new Random();
        int dice = 1;
        int counter = 0;
        // Do something then start checking
        do {
            dice = rnd.nextInt(6) + 1;
            System.out.println("Dice: " + dice);
            counter++;
        }  while (dice != 4);
        System.out.println("DoWhileLoop dice amount until 4: " +  counter);
    }

    public static int recursiveExample(int count) {
        if (count < 0) {
            return 0;
        }
        // Store the function/method itself to JVM's Stack and then resolve (pop) once base case complete
        if (count == 0) {
            return 0;
        }
        var recursiveValue = recursiveExample(count - 1);
        System.out.println("recursiveValue: " +  recursiveValue);
        return recursiveValue + 1;
    }

    public static void forEachExample() {
        // Use on Array/List with expectation to do on every element
        int sum1 = 0;
        int[] exampleArray = new int[] {5,2,3,4};
        for (int n : exampleArray) {
            sum1 += n;
        }
        System.out.println("Sum1: " +  sum1);
        int sum2 = 0;
        List<Integer> exampleList = List.of(5,2,3,4);
        for (int n : exampleList) {
            sum2 += n;
        }
        System.out.println("Sum2: " +  sum2);
    }
}

