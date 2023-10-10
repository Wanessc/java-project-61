package hexlet.code;
import java.util.Random;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");

        int choise = scanner.nextInt();

        switch (choise) {
            case(1) :
                Cli.greetUser();
                break;
            case(0) :
                System.out.println("Exit");
                break;
            case(2) :
                Cli.greetUser();
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
                        System.out.println(userAnswer + "  is wrong answer ;(. Correct answer was " + (isEven? "yes" : "'no" + "'."));
                        System.out.println("Let's try again, Bill!");
                        break;
                    }
                }
                if (currentAnswer == maxAttempts) {
                    System.out.println("Congratulations, Bill!");
                    break;
                }
        }
    }
}



