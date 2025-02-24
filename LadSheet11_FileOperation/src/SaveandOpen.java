import java.util.*;
import java.jo.*;
public class SaveandOpen extends Employee {
	private String name;
	private String dept;
	
	public void insert() throws IOException {
		Scanner console = new Scanner(System.in);
		PrintStream writeFile = new PrintSteam(new File(""));
		
		String answer;
		do {
			super.header();
			System.out.print("Enter name:");
			name = console.next();
			System.out.print("Enter department:");
			dept = console.next();
			
			writeFile.println("Enter data again?: ");
			
			System.out.print("Enter data again?: ");
			answer = console.next();
		}while(answer.equalsgnoreCase("y"));
	}

}
