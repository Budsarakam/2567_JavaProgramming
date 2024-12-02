import javax.swing.*;
package ladsheet02;

public class ladsheet02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner = new scanner(System.in);
		int previousNumber = Integer.MIN_VALUE;
		int currentNumber;
		
		while(ture) {
			System.out.print("Input numbe :");
			currentNumber = scanner.nextInt();
			
			if (currentNumber < previousNumber) {
				break;
			}
			
			previousNumber = currentNumber;
		}
		
		System.out.println("BYE BYE");
		scanner.close();
	}

}
