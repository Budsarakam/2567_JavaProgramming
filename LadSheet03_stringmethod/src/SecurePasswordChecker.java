import java.util.Scanner;

import java.util.*;
public class SecurePasswordChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter your password(type 'exit' to quit):");
			String password = scan.nextLine();
			
			if(password.equalsIgnoreCase("exit")) {
				System.out.println("Program terminate.");
				break;
			}
			String error="";
			if(password.length()<8) {
				error += "- password must be at least 8 characters long.\n";
			}
			boolean hasUpperCase = false;
			boolean HasLowerCase = false;
			boolean hasDigit = false;
			
			for(int i=0;i<password.length();i++) {
				char ch = password.charAt(i);
				if(ch>='A' && ch<'Z') {
			}else if(ch>='a' && ch<'z') {
				hasLowerCase = true;
			}else if(ch>='0' && ch<'9') {
				hasDigit=true;
			}
		}
			
			if(!hasUpperCase)  {
				error += "- password must contain at least on uppercase letter(A_Z).\n";
			}
			if(!hasLowerCase) {
				error += "- Password must contain at least one lowercase letter(a-z.\n";
			}
			if(!hasDigit) {
				error += "- Password must contain at least one digit(0-9).\n";
			}
	}

}
