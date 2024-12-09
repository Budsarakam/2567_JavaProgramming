import java.utiil.Random;
import java.utiil.Scanner;

public class Withdrawal {
    public satic void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int balance = rand.nextint(100000) + 1;
        System.out.println("Your balance: " + balance + "baht");

        System.out.print("Enter withdrawal amount:");
        int amount = scanner.nextint();

        if(amount > balance) {
            System.out.println("Error: Cannot withdraw more than balance");
        }else if (amount > 20000) {
            System.out.println("Error: Cannot withdraw more than 20,000 baht");
        }else if (amount % 100 !=0) {
            System.out.println("Error Cannot withdrawl amount must be a multiple of 100 baht.");
        }else {
            System.out.println("You withdraw " + amount + "baht");
            int thousand = amount / 1000;
            amount %= 1000;

            int fiveHundred = amount / 500;
            amount %= 500;

            int OneHundred = amount / 100;
            
            if(thousand > 0)System.out.println("1000 x " + thousand);
            if(fiveHundred > 0)System.out.println("500 x " + fiveHundred);
            if(OneHundred > 0)System.out.println("100 x " + OneHundred);

            balance -= (thousand * 1000 + fiveHundred * 500 + OneHundred * 100);
            System.out.println("Remaining balance: " + balance + "baht.");
        }

        scanner.close();
    } 
}