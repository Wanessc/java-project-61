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

        int greet_game = 1;
        int even_game = 2;
        int calc_game = 3;
        int gcd_game = 4;
        int progression_game = 5;
        int prime_game = 6;

        if (choise == greet_game) {
            Cli.greetUser();
        } else if (choise == even_game) {
            FirstGame firstGame = new FirstGame();
            firstGame.run();
        } else if (choise == calc_game) {
            SecondGame secondGame = new SecondGame();
            secondGame.run();
        } else if (choise == gcd_game) {
            ThirdGame thirdGame = new ThirdGame();
            thirdGame.run();
        } else if (choise == progression_game) {
            FourthGame fourthGame = new FourthGame();
            fourthGame.run();
        } else if (choise == prime_game) {
            FifeGame fifeGame = new FifeGame();
            fifeGame.run();
        }
    }
}



