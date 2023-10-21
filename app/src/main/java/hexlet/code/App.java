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

        if (choise == 1) {
            Cli.greetUser();
        } else if (choise == 2) {
            FirstGame firstGame = new FirstGame();
            firstGame.run();
        } else if (choise == 3) {
            SecondGame secondGame = new SecondGame();
            secondGame.run();
        } else if (choise == 4) {
            ThirdGame thirdGame = new ThirdGame();
            thirdGame.run();
        } else if (choise == 5) {
            FourthGame fourthGame = new FourthGame();
            fourthGame.run();
        } else if (choise == 6) {
            FifeGame fifeGame = new FifeGame();
            fifeGame.run();
        }
    }
}



