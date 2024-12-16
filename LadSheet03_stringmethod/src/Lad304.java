import javax.swing.JOptionPane;

public class NameChecker {
    public static void main(String[] args) {
        String fullName = JOptionPane.showInputDialog(null, "Input your full name:");

        if (fullName == null) { // กด Cancel
            return;
        }
        if (!fullName.contains(" ")) {
            JOptionPane.showMessageDialog(null, "Incorrect Name");
        } else {
            String firstName = fullName.substring(0, fullName.indexOf(" "));
            String lastName = fullName.substring(fullName.indexOf(" ") + 1);

            JOptionPane.showMessageDialog(null,
                "Full Name: " + fullName + "\n" +
                "First Name: " + firstName.toUpperCase() + "\n" +
                "Last Name: " + lastName.toLowerCase());
        }
    }
}
