import java.util.Scanner;

public class VariableInputs {
    public static void main(String[] args) {

        //scanner object to read input from user
        Scanner scanner = new Scanner(System.in);

        //user enters string of text
        System.out.println("Enter a variable name: ");
        String textInput = scanner.nextLine();

        //user enters integer
        System.out.println("Enter an integer value: ");
        int intInput = scanner.nextInt();

        //user enters a double
        System.out.println("Enter a double value: ");
        double doubleInput = scanner.nextDouble();

        //user enters boolean
        System.out.println("Enter a boolean value: ");
        boolean booleanInput = scanner.nextBoolean();

        //user inputs printed
        System.out.println("Your string is " + textInput);
        System.out.println("Your integer is " + intInput);
        System.out.println("Your double is " + doubleInput);
        System.out.println("Your boolean is " + booleanInput);

        //close scanner
        scanner.close();
    }
}
