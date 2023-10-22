package hexlet.code;
import java.util.Scanner;
import java.util.Random;
interface Prime {
    void run();
}
class FifeGame implements Prime {
    private final Scanner scanner = new Scanner(System.in);
    private final Random random = new Random();
    private final int maxAtterms = 3;
    private final int minAterm = 20;
    private final int nam = 3;
    private final int nam1 = 5;
    private  final int nam2 = 6;
    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= nam) {
            return true;
        }
        if (number % 2 == 0 || number % nam == 0) {
            return false;
        }
        for (int i = nam1; i * i <= number; i += nam2) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return  true;
    }

    @Override
    public void run() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        int correctAnswers = 0;

        while (correctAnswers < maxAtterms) {
            int num = random.nextInt(minAterm);
            System.out.println("Question: " + num);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next().toLowerCase();

            if (isPrime(num) && userAnswer.equals("yes") || (!isPrime(num) && userAnswer.equals("no"))) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println(userAnswer + "  is wrong answer ;(. Correct answer was: "
                        + (isPrime(num) ? "yes" : "'no'") + ".");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        if (correctAnswers == maxAtterms) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
