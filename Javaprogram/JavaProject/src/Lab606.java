import javax.swing.JOptionPane;
public class Lab606 {

	public static void main(String[] args) {
		int[] nums = {25,78,41,22,36,85,37};
		int index =Integer.parseInt(JOptionPane.showInputDialog("Input number of array: ")); 
		while(checkIndex(nums,index)){
		index =Integer.parseInt(JOptionPane.showInputDialog("Input number of array, again: "));
		}
		String pre = (prevData(nums,index)!=1)?"Prevoius data, nums"+"["+(index-1)+"]"+" is "+(prevData(nums,index)):"No previous data";
		String next = (nextData(nums,index)!=1)?"Prevoius data, nums"+"["+(index+1)+"]"+" is "+(nextData(nums,index)):"No next data";
		JOptionPane.showMessageDialog(null,"CurrenData, nums"+"["+index+"]"+" is "+currentData(nums,index)+"\n"+pre+"\n"+next);
	}
	public static boolean checkIndex(int[]nums,int index) {
		return((index<0||index>(nums.length-1)?true:false));
	}
	public static int currentData(int[]nums,int index) {
		return nums[index];
	}
	public static int prevData(int[]nums,int index) {	
		return index==0?1:(nums[index-1]);
	}
	public static int nextData(int[]nums,int index) {	
		return index==nums.length-1?1:(nums[index+1]);
	}
}
