public class LoanCalculator {
    private String productName;
    private double price;
    private double interestRate;
    private int years;

    public voidsetLoanDetails String productName,double price, double interestRate, int years {
        this.productName = productName;
        this.price = price;
        this.interestRate = interestRate;
        this.years = years;
}

public double calculateMonthlyPayment() {
    double monthlyRate = interestRate / 100 / 12;
    int months = years * 12;
    return (price*monthlyRate) / (1 - Math.pow(1 + monthlyRate, - months));
}

public void displayLoanDetails() {
    System.out.println("Product:" + productName);
    System.out.println("Price:" + price);
    System.out.println("Interest Ratee:" + interestRate + "%");
    System.out.println("Loan Period:" + "years" + "years");
    System.out.println("Monthly Payment: %.2f%n", calculateMonthlyPayment());
    }
}