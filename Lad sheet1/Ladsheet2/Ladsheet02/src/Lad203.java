import java.utiil.Scanner;
public class lad203 {
    public satic void main(String[]args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input Weight (kg):");
    double Weight = scanner.nextDouble();

    System.out.print("Input.Height (cm):");
    double HeightInCm = scanner.nextDouble();

    double HeightInMeters = HeightInCm / 100.0;

    double bmi = Weight / (HeightInMeters*HeightInMeters);
    System.out.printf("BMI = %1f\n",bmi);

    if (bmi < 18.5) {
        System.out.println("You're Underweight");
    }else if (bmi >= 18.5 && bmi <= 24.9) {
        System.out.println("You're Normal-weight");
    }else if (bmi >= 25.0 && bmi <= 29.9) {
        System.out.println("You're Overweight");
    }else {
        System.out.println("You're Obesity");
    }

    scanner.close();

}