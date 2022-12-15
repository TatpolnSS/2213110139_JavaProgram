import javax.swing.JOptionPane;
public class Lab605 {

	public static void main(String[] args) {
		int[] number = new int [5];
		for (int i = 0 ;i<number.length;i++) {
			number[i]=Integer.parseInt(JOptionPane.showInputDialog("Input number "+(i+1)+" : "));
		}
		showEven(number);	
		showOdd(number);
	}
	public static void showEven(int[] nums) {
		String _ans ="";
		for (int i = 0 ; i<nums.length;i++)
		{
			if (nums[i]%2==0) {
				_ans+= nums[i]+" ";
			}
		}
		JOptionPane.showMessageDialog(null, "List of even number:\n"+_ans);
	}
	public static void showOdd(int[] nums) {
		String ans="";
		for (int i = 0 ; i<nums.length;i++)
		{
			if (nums[i]%2!=0) {
				ans+= nums[i]+" ";
			}
		}
		JOptionPane.showMessageDialog(null, "List of even number:\n"+ans);
	}
}
