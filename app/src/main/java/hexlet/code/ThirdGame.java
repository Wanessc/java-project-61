package hexlet.code;
import java.util.Scanner;
import java.util.Random;

interface GCD {
    void run();
}

class ThirdGame implements GCD {
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();
    private final int maxAtterms = 3;

    private int findGCD(int a, int b) {
        if (b == 0) {
            return  a;
        } else {
            return findGCD(b, a % b);
        }
    }

    public void run() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
        System.out.println("Find the greatest common divisor of given numbers.");

        int correctAnswers = 0;

        while (correctAnswers < maxAtterms) {
            int num1 = random.nextInt(100) + 1;
            int num2 = random.nextInt(100) + 1;

            int gcd = findGCD(num1, num2);
            System.out.println("Question: " + num1 + " " + num2);
            System.out.println("Your answer:");
            int userAnswer = scanner.nextInt();

            if (gcd == userAnswer) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + gcd + " .");
                System.out.println(("Let's try again, " + name + "!"));
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}

