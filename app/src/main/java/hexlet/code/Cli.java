package hexlet.code;
import java.util.Scanner;
public class Cli {
    public static void greetUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("May I have your name? John");
        System.out.println("Hello, John!");

        scanner.close();
    }
}
