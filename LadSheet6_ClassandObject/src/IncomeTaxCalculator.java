public class IncomeTaxCalculator {
    private double income;
    public void setIncome(double income) {
        this.income = income;
    }

    public double calculteTax() {
        double tax = 0;

        if (income > 150000) {
            if (income <= 300000) {
                tax = (income <= 150000) * 0.05;
            } else {
                tax = (150000 * 0.05) + ((income - 300000)* 0.10);
            } else {
                tax = (150000 * 0.05) + (200000 * 0.10) + ((income - 500000) * 0.20);
            }
        }

        return tax;
    }

    public void displayTaxDetails() {
        System.out.printf("Income: %.sf%n", income);
        System.out.printf("Tax: %2f%n",calculateTax());
    }
}