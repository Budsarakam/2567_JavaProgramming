import javax.swing.*;
public class Lad302 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputEmail = JOptionPane.showInputDialog("Input your e-mail:");
		
		while(inputEmail.startsWith("@")||inputEmail.contains("")) {
			inputEmail = JOptionPane.showInputDialog("Input your e-mail:");
		}
		
		if(inputEmail.endsWith("@gmail.com") || inputEmail.endsWith("@hotmail.com")) {
			JOptionPane.showMessageDialog(null, "input e-mail is "+inputEmail);
		}else {
			JOptionPane.showMessageDialog(null, "your e-mail is not hotmail dot com");
		}
		
	}

}
