package _02_unbirthday;

import javax.swing.JOptionPane;

public class UnbirthdayScar {
	public static void main(String[] args) {
	
	
	String input = JOptionPane.showInputDialog("When is your birthday");
	if(input.equals("2/3/20")) {
	JOptionPane.showMessageDialog(null,"happy birthday");
			
	} else {
		
		JOptionPane.showMessageDialog(null,"merry unbirthday");
			
	}
	
			

}
}