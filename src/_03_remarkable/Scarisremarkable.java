package _03_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Scarisremarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable
	
	String grumpus = "is helpful";
		// 2. Ask the user to enter a name. Store their answer in a variable.
	String input = JOptionPane.showInputDialog("Who is someone you know?");
			grumpus = " is helpful";
		// 3. In a pop-up, tell the user what is remarkable about that person. 
if(input.equals("grumpus")) {
	 JOptionPane.showMessageDialog(null, grumpus);
}

	}
}

