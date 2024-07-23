import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        //creating scanner for assignment
        Scanner scanner = new Scanner(System.in);

        //printing the greeting, asks user to enter name
        System.out.println("What's your name?");
        String name = scanner.nextLine();

        //greet Bob
        System.out.println("Hi " + name);

        scanner.close();


    }
}