import javax.swing.*;

public class Lab502 {

	static String email;

	public static void main(String[] args) {
		inputEmail();
	}

	public static void checkEmail(String email) {
		while (email.startsWith("@") || email.contains(" ")) {
			email = JOptionPane.showInputDialog("Input your e-mail, again :");
		}
		email = email.toLowerCase();
		JOptionPane.showMessageDialog(null,
				checkmail((email)) ? "Your e-mail is " + email : "your e-mail is not hotmail or gmail dot com");
	}

	public static boolean checkmail(String mail) {
		if (mail.endsWith("@gmail.com") || mail.endsWith("@hotmail.com"))
			return true;
		else
			return false;
	}

	public static String inputEmail() {
		String answer = "";
		do {
			email = JOptionPane.showInputDialog("Input your e-mail");
			checkEmail(email);
			answer = JOptionPane.showInputDialog("Continue[y||Y to continue]");
		} while (answer.equalsIgnoreCase("y"));
		return email;
	}
}
