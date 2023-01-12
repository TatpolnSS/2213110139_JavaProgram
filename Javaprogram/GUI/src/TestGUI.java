import java.awt.*;
import javax.swing.*;

public class TestGUI extends JFrame{
	
	private static final int WIDTH = 400;
	private static final int HEIGHT= 300;
	private JLabel lblLength,lblWidth,lblArea,lblPerimeter;
	private JTextField txtLength,txtWidth,txtArea,txtPerimeter;
	
	public TestGUI() {
		setTitle("Area and Perimeter");
		setSize(WIDTH,HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		lblLength = new JLabel("Enter the length:",SwingConstants.RIGHT);
		lblWidth = new JLabel("Enter the Width:",SwingConstants.RIGHT);
		lblArea = new JLabel("Area:",SwingConstants.RIGHT);
		lblPerimeter = new JLabel("Perimiter:",SwingConstants.RIGHT);

		//txtLength = new JTextField(10);
		
		GridLayout L = new GridLayout(4,1);
		setLayout(L);
		add(lblLength);
		//add(txtLength);
		add(lblWidth);
		add(lblArea);
		add(lblPerimeter);
	}
	
	
	public static void main(String[] args) {
		TestGUI prog = new TestGUI();

	}

}
