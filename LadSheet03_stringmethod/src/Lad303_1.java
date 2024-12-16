import javax.swing.JOptionPane;

public class SentenceChecker {
    public static void main(String[] args) {
        String sentence;
        boolean isValid = false;

        while (!isValid) {
            sentence = JOptionPane.showInputDialog(null, "Input a sentence:");

            if (sentence == null) { // กด Cancel
                break;
            }

            if (!sentence.endsWith(".")) {
                JOptionPane.showMessageDialog(null, "The sentence must end with a full stop (.)");
                continue;
            }

            int spaceCount = sentence.length() - sentence.replace(" ", "").length();
            int wordCount = sentence.split(" ").length;

            JOptionPane.showMessageDialog(null, 
                "This sentence has " + spaceCount + " spacebar.\n" +
                "This sentence has " + wordCount + " word.");
            isValid = true;
        }
    }
}
