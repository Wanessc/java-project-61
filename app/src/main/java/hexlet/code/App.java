package hexlet.code;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.println("Your choice:");

        int choise = scanner.nextInt();

        final int GREET_GAME = 1;
        final int EVEN_GAME = 2;
        final int CALC_GAME = 3;
        final int GCD_GAME = 4;
        final int PROGRESSION_GAME = 5;
        final int PRIME_GAME = 6;

        if (choise == GREET_GAME) {
            Cli.greetUser();
        } else if (choise == EVEN_GAME) {
            FirstGame firstGame = new FirstGame();
            firstGame.run();
        } else if (choise == CALC_GAME) {
            SecondGame secondGame = new SecondGame();
            secondGame.run();
        } else if (choise == GCD_GAME) {
            ThirdGame thirdGame = new ThirdGame();
            thirdGame.run();
        } else if (choise == PROGRESSION_GAME) {
            FourthGame fourthGame = new FourthGame();
            fourthGame.run();
        } else if (choise == PRIME_GAME) {
            FifeGame fifeGame = new FifeGame();
            fifeGame.run();
        }
    }
}



