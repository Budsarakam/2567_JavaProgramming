import java.util.*;
public class Lad403 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String fullname;
		string firstName;
		
		System.out.println("Please enter your name, separated by a space,");
		System.out.print(":");
		fullName = input.nextLine();
		
		int space = fullname.indexOf('');
		firstName = fullName.substring(0,space);
		
		System.out.println(abbreviatName(fullname));
		input.close();
		
	public static String abbreviatName(String FLullname) {
		String initialLetter="";
		
		for(int i=0;i<fullName.length();i++) {
			if(fullName.charAt(i)=='' ) {
				intialLetter = (initalLetter+fullName.charAt(i)).toUpperCase();
				intialLetter = intialLetter+".";
			}
		}
		return initialLetter;
	}

	}

}
