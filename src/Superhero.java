import java.util.Scanner;

public class Superhero {
    public static void main(String[] args) {

        //created scanner
        Scanner scanner = new Scanner(System.in);

        //first two lines before initial user input
        System.out.println("Let's write a story about a superhero.");
        System.out.println("Who is the hero of your story?");

        //First user input
        String superhero = scanner.nextLine();

        System.out.println("What is " + superhero + "'s" + " " + "superpower");

        String superpower = scanner.nextLine();

        System.out.println("Here is the story");
        System.out.println("There once was a superhero named " + superhero + ", who had the power to " + superpower);
        System.out.println("As they grew older, " + superhero +  " saw that the world needed them.");
        System.out.println(superhero + " used their ability to " + superpower +  " to save the world.");

    }
}
