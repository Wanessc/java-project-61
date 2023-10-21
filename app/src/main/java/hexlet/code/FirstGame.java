package hexlet.code;

import java.util.Random;
import java.util.Scanner;
interface MyGame {
    void run();
}

class FirstGame implements MyGame {
    private final int maxNumber = 100;
    private final int maxAttempts = 3;
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);

    @Override
        public void run() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int correctAnswers = 0;
        while (correctAnswers < maxAttempts) {
            int number = random.nextInt(maxNumber);
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();

            boolean isEven = number % 2 == 0;
            if (isEven && userAnswer.equals("yes") || !isEven && userAnswer.equals("no")) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was  "
                        + (isEven ? "'yes''" : "'no'") + ".");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        if (correctAnswers == maxAttempts) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}

