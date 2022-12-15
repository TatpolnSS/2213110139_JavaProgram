import javax.swing.JOptionPane;

public class Lab_Example602_2 {
	static String[] deptName = {"Accounting","HR","Sales","Innovation"};
	static boolean depName = false;
	
	public static void main(String[] args) {
		
		String name =JOptionPane.showInputDialog("Enter a department name");
		for (int i=0;i<deptName.length;i++) 
		{
			if(name.equalsIgnoreCase(deptName[i]))
			{
				depName = true;	
			}
		}
		System.out.println(name+((depName)?" was found in the list":" was not found in the list"));
	}

}
