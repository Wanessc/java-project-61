package hexlet.code;

import java.util.Scanner;
import java.util.Random;

interface Progression {
    void run();
}

class FourthGame implements Progression {
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();
    private static final int progressionLength = 10;
    private static final int minNumber = 1;
    private static final int maxNumber = 100;
    private static final int maxAtterms = 3;
    private static final int charNam = 11;

    @Override
    public void run() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
        System.out.println("What number is missing in the progression?");

        int correctAnswers = 0;

        while (correctAnswers < maxAtterms) {
            int a = random.nextInt(maxNumber - minNumber + 1) + minNumber;
            int b = random.nextInt(charNam) + 1;
            int hiddeIndex = random.nextInt(progressionLength);
            int hiddenNumber = a + b * hiddeIndex;

            StringBuilder progression = new StringBuilder();

            for (int i = 0; i < progressionLength; i++) {
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
