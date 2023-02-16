import java.util.*;
import java.io.*;
public class ATMChecking extends ATMData{

	private int money;
	
	public ATMChecking(String accountNumber,String password,int money) {
		super(accountNumber,password);
		this.money=money;
	}
	
	public boolean checkBookBank() throws IOException {
		BufferedReader read = new BufferedReader(new FileReader("D://File//ATMBookBank.txt"));
		String temp= "";
		boolean check = false;
		while((temp=read.readLine())!=null) {
			String[] data = temp.split("\t");
			if(data[0]==super.getID()&&data[1]==super.getPass()&&Integer.parseInt(data[2])<=this.money) {
				check = true;
			}
			else {
				check = false;
			}
		}
		return check;
	}

	
	public void show() throws IOException {
		BufferedReader read1 = new BufferedReader(new FileReader("D://File//ATMBookBank.txt"));
		String temp= "";
		int i = 0;
		while((temp=read1.readLine())!=null) {
			String[] data = temp.split("\t");
			if(data[0]==super.getID()&&data[1]==super.getPass()&&Integer.parseInt(data[2])>=this.money) {
				i = Integer.parseInt(data[2]);
			}
		}
		System.out.println("You drawing for "+this.money%2f+", get");
			int thou=1000;int fHun=500;int hun=100;
			thou = this.money%thou;
			fHun = (this.money%thou)/fHun;
			hun = ((this.money%thou)%fHun)/hun;
		System.out.print("1000 = "+thou);
		System.out.print("500  = "+fHun);
		System.out.print("100  = "+hun)	;
		System.out.println("Your balance is "+(i-this.money)%2f+" Baht");
		read1.close();
			}
	}	

