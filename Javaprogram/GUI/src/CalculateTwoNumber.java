import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.text.*;
import javax.swing.JCheckBox;
import javax.swing.*;

public class CalculateTwoNumber extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumber1;
	private JTextField txtNumber2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculateTwoNumber frame = new CalculateTwoNumber();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculateTwoNumber() {
		setTitle("CalculateTwoNumber");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumber1 = new JLabel("Enter Number1");
		lblNumber1.setBounds(48, 24, 97, 29);
		contentPane.add(lblNumber1);
		
		txtNumber1 = new JTextField();
		txtNumber1.setBounds(165, 28, 117, 20);
		contentPane.add(txtNumber1);
		txtNumber1.setColumns(10);
		
		JLabel lblNumber2 = new JLabel("Enter Number2");
		lblNumber2.setBounds(48, 64, 97, 14);
		contentPane.add(lblNumber2);
		
		txtNumber2 = new JTextField();
		txtNumber2.setBounds(165, 61, 117, 20);
		contentPane.add(txtNumber2);
		txtNumber2.setColumns(10);
		
		final JLabel lblResult = new JLabel("Result");
		lblResult.setForeground(new Color(0, 0, 0));
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblResult.setBounds(333, 155, 61, 29);
		contentPane.add(lblResult);
		
		JLabel lblOperator = new JLabel("Operator");
		lblOperator.setBounds(48, 99, 97, 14);
		contentPane.add(lblOperator);
		
		final JComboBox chOperator = new JComboBox();
		chOperator.setBounds(165, 92, 58, 22);
		chOperator.addItem("+");
		chOperator.addItem("-");
		chOperator.addItem("*");
		chOperator.addItem("/");
		contentPane.add(chOperator);
		
		JLabel rdbOperator = new JLabel("How to show Digit");
		rdbOperator.setBounds(48, 134, 146, 14);
		contentPane.add(rdbOperator);
		
		final JRadioButton oneDigit = new JRadioButton("1 Digit");
		oneDigit.setBounds(165, 130, 109, 23);
		contentPane.add(oneDigit);
		
		final JRadioButton twoDigit = new JRadioButton("2 Digit");
		twoDigit.setBounds(165, 160, 109, 23);
		contentPane.add(twoDigit);
		
		ButtonGroup group = new ButtonGroup();
		group.add(oneDigit);
		group.add(twoDigit);
		
		final JCheckBox chkDialogBox = new JCheckBox("Show Result at DialogBox");
		chkDialogBox.setBounds(165, 188, 175, 23);
		contentPane.add(chkDialogBox);
		
		JLabel lblOption = new JLabel("Option to show");
		lblOption.setBounds(48, 192, 117, 14);
		contentPane.add(lblOption);
			
		final JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1,num2,sum=0;
				String operator;
				if(e.getSource()==btnOk) {
					num1 = Double.parseDouble(txtNumber1.getText());
					num2 = Double.parseDouble(txtNumber2.getText());
					operator = (String)chOperator.getSelectedItem();
					if(operator.equals("+")){
						sum = num1+num2;
					}
					if(operator.equals("-")){
						sum = num1-num2;
					}
					if(operator.equals("*")){
						sum = num1*num2;
					}
					if(operator.equals("/")){
						sum = num1/num2;
					}
					//lblResult.setText(String.format("%.2f",sum));
					DecimalFormat frmNumber = null;
					if(oneDigit.isSelected()) 
					{
						frmNumber = new DecimalFormat("#,###.0");
					}
					else if(twoDigit.isSelected())
					{
						frmNumber = new DecimalFormat("#,###.00");
					}
					
					lblResult.setText(frmNumber.format(sum));
					
					if(chkDialogBox.isSelected()) 
					{
						JOptionPane.showMessageDialog(null,"Result is : "+sum);
					}
						
				}
			}
		
		});
		btnOk.setBounds(124, 227, 89, 23);
		contentPane.add(btnOk);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(225, 227, 89, 23);
		contentPane.add(btnExit);
		
		
		
		
		
	}
}
