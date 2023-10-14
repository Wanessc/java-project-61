package hexlet.code;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");

        int choise = scanner.nextInt();

        if(choise == 1) {
            Cli.greetUser();
        } else if (choise == 2) {
            FirstGame firstGame = new FirstGame();
            firstGame.run();
        } else if (choise == 3) {
            SecondGame secondGame = new SecondGame();
            secondGame.run();
        }
    }
}



