import java.util.Scanner;

public class IncomeTaxCalaulator {
    public static void main(String[] args) {
        final double TAX_RATE_ABOVE_20K = 0.1;
        final double TAX_RATE_ABOVE_40K = 0.2;
        final double TAX_RATE_ABOVE_60K = 0.3;

        Scanner scanner = new scanner(System.in);

        System.out.print("Enter th taxable income: ");
        int taxableIncome = scanner.nextint();

        double taxPayable = 0;

        if (taxableIncome > 6000) {
            taxPayable += (taxableIncome - 6000) * TAX_RATE_ABOVE_60K;
            taxPayable += 20000 * TAX_RATE_ABOVE_40K;
            taxPayable += 20000 * TAX_RATE_ABOVE_20K;
        }else if (taxableIncome > 40000) {
            taxPayable += (taxableIncome - 40000) * TAX_RATE_ABOVE_40K;
            taxPayable += 20000 * TAX_RATE_ABOVE_20K;
        }else if (taxableIncome > 20000) {taxPayable += (taxableIncome - 20000) * TAX_RATE_ABOVE_20K;
        
        }


        System.out.printf("The income tax payable is: $%2f%n", taxPayable);

        scanner.close();
    }
}