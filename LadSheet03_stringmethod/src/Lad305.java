import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("Input some sentence: ");
            input = scanner.nextLine();

            if (input.endsWith(".")) {
                break;
            } else {
                System.out.println("The sentence must end with a full stop point!");
            }
        }

        System.out.println("\nThe sentence must end with full stop point: " + input);

        System.out.println("\nFormatted sentence:");
        String[] words = input.split(" ");
        for (String word : words) {
            System.out.println(word);
        }

        scanner.close();
    }
}
