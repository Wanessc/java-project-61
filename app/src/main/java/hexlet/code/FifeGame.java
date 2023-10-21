package hexlet.code;
import java.util.Scanner;
import java.util.Random;
interface Prime {
    void run();
}
 class FifeGame implements Prime {
     private Scanner scanner = new Scanner(System.in);
     private final int maxAtterms = 3;
     private Random random = new Random();

     private boolean isPrime(int number) {
         if (number <= 1) {
             return false;
         }
         if (number <= 3) {
             return true;
         }
         if (number % 2 == 0 || number % 3 == 0) {
             return  false;
         }
         for (int i = 5; i * i <= number; i +=6) {
             if(number % i == 0 || number % (i +2) == 0) {
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
             int num = random.nextInt(20);
             System.out.println("Question: " + num);
             System.out.print("Your answer: ");
             String userAnswer = scanner.next().toLowerCase();

             if(isPrime(num) && userAnswer.equals("yes") || (!isPrime(num) && userAnswer.equals("no"))) {
                 System.out.println("Correct!");
                 correctAnswers++;
             } else {
                 System.out.println(userAnswer + "  is wrong answer ;(. Correct answer was: " + (isPrime(num) ? "yes" : "'no'") + ".");
                 System.out.println("Let's try again, " + name + "!");
                 return;
             }
         }
         if(correctAnswers == maxAtterms) {
             System.out.println("Congratulations, " + name + "!");
         }
     }
 };
