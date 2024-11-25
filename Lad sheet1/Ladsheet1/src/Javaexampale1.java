import java.util.*;
public class Javaexampale1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//define object for scanner class(input data from keyboard)
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your first name(using next): ");
		String firstName = input.next();
		input.nextLine();
		
		System.out.println("Enter your first name(using nextLine): ");
		String LastName = input.next();
		
		System.out.println("/n----Output----");
		System.out.println("First Name: "+firstName);
		System.out.println("Last Name : "+LastName);
		
		input.close();

	}

}
