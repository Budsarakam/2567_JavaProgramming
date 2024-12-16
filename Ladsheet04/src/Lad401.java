import javax.swing.*;

public class Lad401 {

	public static void main(String[] args) {
		inputEmail();
	}
	
	public static void inputEmail() {
		String ans="";
		do {
			varEmail = JOptionPane.showInputDialog("Input your e-mail:");
			if(varEmail!=null && !varEmail.isEmpty()) {
				
			}else {
				JOptionPane.showMessageDialog(null, "E-mail cannot be empty");
			}
			ans = JOptionPane.showInputDialog("Continue?(y||Y to continue)");
		}while(ans!=null && ans.contentEquals("y"));
	}
	
	public static void checkEmailError(String email) {
		while(email.startsWith("@")||email.contains("Input your e-mail again:");
	}
	email = email.toLowerCase();
	JOptionPane.showMessageDialog(null,checkemail(email));
}
public static boolean checkEmail(String email) {
	
	if(email.endsWith("@gmail.com") ||email.endsith("@hotmail.com")) {
		return true;
	}else {
	retrue false;
}
