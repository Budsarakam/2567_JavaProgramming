import java.utiil.Scanner;
public class Lad204 {
    public satic void main(String[]args) {
        Scanner scanner = new scanner(System.in);

        System.out.print("Input vlue of x; ");
        int x = scanner.nextint();

        int y;
        do {
            System.out.prinnt("Input value of Y, again: ");
            y = scanner.nextint();
            if(y <= x) {
                System.out.println("Y must be greater thann X, try again.");
            }
        }while (y <= X);

        int sum = X;
        while(sum <= Y) {
            System.out.printf("%d + %d = %d\n", x, sum - x, sum);
            sum +=x;
        }

        scanner.close();
    }
}