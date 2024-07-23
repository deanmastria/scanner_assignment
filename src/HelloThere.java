import java.util.Scanner;

public class HelloThere {
    public static void main(String[] args) {

        //scanner usage
        Scanner scanner = new Scanner(System.in);

        //first prompt
        System.out.println("Hello there! how are you doing today?");

        //user input
        String feeling = scanner.nextLine();

        //second line after user input in console
        System.out.println("Wow - Interesting! Tell me more!");

        String more = scanner.nextLine();

        System.out.println("Have a great rest of your day!");

        scanner.close();
    }
}
