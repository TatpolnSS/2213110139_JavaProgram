
import javax.swing.JOptionPane;

public class BookDemo2 {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Input author name:");
		String email = JOptionPane.showInputDialog("Input author e-mail:");
		String title = JOptionPane.showInputDialog("Input book title:");
		int check;
		int page = Integer.parseInt(JOptionPane.showInputDialog("Input book page:"));
		check = JOptionPane.showConfirmDialog(null, "is this page correct","Confirm",JOptionPane.YES_NO_OPTION);
		
		Book1 Book = new Book1(title,new Author1(name,email),page);
		
			while (check != 0) {
				Book.setPage(Integer.parseInt(JOptionPane.showInputDialog("Input book page, again:")));
				check = JOptionPane.showConfirmDialog(null, "is this page correct","Confirm",JOptionPane.YES_NO_OPTION);

			}
					
		JOptionPane.showMessageDialog(null,"Book Title: "+Book.getTitle()+
				"\nAuthor name: "+Book.getAuthor().getName()+" ("+Book.getPage()+")"+
				"\nAuthor e-mail: "+Book.getAuthor().getEmail());
	}
}
