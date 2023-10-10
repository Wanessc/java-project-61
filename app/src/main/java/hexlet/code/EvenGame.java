package hexlet.code;
import java.util.Random;
import java.util.Scanner;

public class EvenGame {
    public static void games(String[] nums) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int maxAttempts = 3;
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int currentAnswer = 0;

        while (currentAnswer < maxAttempts) {
            int number = random.nextInt(100);
            System.out.println("Question: " + number);
            System.out.println("Your answer:");
            String userAnswer = scanner.next();

            boolean isEven = number % 2 == 0;

            if (isEven && userAnswer.equals("yes") || (!isEven && userAnswer.equals("no"))) {
                System.out.println("Correct!");
                currentAnswer ++;
            } else {
                System.out.println("'yes' is wrong answer ;(. Correct answer was " + (isEven? "yes" : "no" + "."));
                System.out.println("Let's try again, Bill!");
                break;
            }
        }
        if (currentAnswer == maxAttempts) {
            System.out.println("Congratulations, Bill!");
        }
    }
}
