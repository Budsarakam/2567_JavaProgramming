import java.utiil.Scanner;

public class Lad202 {
    public satic void main(Sttring[] args {
        Scanner scannner = new scanner(System.in);
        int prevNumber = Integer.MIN_VLUE;

        int currentNumber;

        while {
            System.out.print("Input number");
            currentNumber = scanner.nextint();

            if (currentNumber < prevNumber) {
                break;
            }
            prevNumber = currentNumber;
        }
        System.out.println("BYE BYE");
        scanner.close();
    }
}