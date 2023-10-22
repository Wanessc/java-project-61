package hexlet.code;

import java.util.Scanner;
import java.util.Random;

interface Progression {
    void run();
}

class FourthGame implements Progression {
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();
    private static final int PROGRESSION_LENGTH = 10;
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;
    private static final int MAX_ATTEMPTS = 3;
    private final int CHAR_NUM  = 3;

    @Override
    public void run() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
        System.out.println("What number is missing in the progression?");

        int correctAnswers = 0;

        while (correctAnswers < MAX_ATTEMPTS) {
            int a = random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
            int b = random.nextInt(CHAR_NUM) + 1;
            int hiddeIndex = random.nextInt(PROGRESSION_LENGTH);
            int hiddenNumber = a + b * hiddeIndex;

            StringBuilder progression = new StringBuilder();

            for (int i = 0; i < PROGRESSION_LENGTH; i++) {
                if (i == hiddeIndex) {
                    progression.append(".. ");
                } else {
                    progression.append(a + i * b).append(" ");
                }
            }

            System.out.println("Question: " + progression);
            System.out.println("Your answer:");
            int userAnswer = scanner.nextInt();

            if (userAnswer == hiddenNumber) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + hiddenNumber + ".");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
