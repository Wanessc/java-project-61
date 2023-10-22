package hexlet.code;
import java.util.Random;
import java.util.Scanner;

interface CalculatorGame {
    void run();
}
class SecondGame implements CalculatorGame {
    private final Random random = new Random();
    private final int maxAttempts = 3;
    private final int randoms = 100;
    private final Scanner scanner = new Scanner(System.in);

    private char getRandomOperator() {
        char[] operators = {'+', '-', '*'};
        int randomIndex = random.nextInt(operators.length);
        return operators[randomIndex];
    }
    private int calculateExpression(int num1, int num2, char operator) {
        switch (operator) {
            case '-' :
                return  num1 - num2;
            case '+' :
                return  num1 + num2;
            case '*' :
                return num1 * num2;
            default:
                throw new IllegalStateException("Unexpected value: " + operator);
        }
    }
    public void run() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
        System.out.println("What is the result of the expression?");

        int correctAnswers = 0;
        while (correctAnswers < maxAttempts) {
            int number1 = random.nextInt(randoms);
            int number2 = random.nextInt(randoms);
            char operator = getRandomOperator();
            int result = calculateExpression(number1, number2,  operator);
            System.out.println("Question: " + number1 + " " + operator + " " + number2);
            System.out.println("Your answer:");
            int userAnswer = scanner.nextInt();

            if (userAnswer == result) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + result);
                System.out.println("Let's try again, "  + name + "!");
                return;
            }
        }
        if (correctAnswers == maxAttempts) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}


