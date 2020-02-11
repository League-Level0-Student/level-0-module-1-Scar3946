package _07_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019

//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		String input = JOptionPane.showInputDialog("How can you leave a room with two legs and come back with six?");
		if (input.equals("You can come back carrying a chair or table")) {
			JOptionPane.showMessageDialog(null, "Correct");
			score++;
		}
		// 4. If they got the answer right, pop up "correct!" and increase the score by
		// one
		else {
			JOptionPane.showMessageDialog(null, "Wrong");
		}
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles
		String dab = JOptionPane.showInputDialog("There's a one story house where everything is yellow."
				+ "The walls are yellow. " + "The doors are yellow." + "Even all the furniture is yellow. "
				+ "The house has yellow beds and yellow couches. " + "What color are the stairs?");
		// 2. Make a pop up to show the score.
		if (dab.contentEquals("there are no stairs in a one story house")) {
			JOptionPane.showMessageDialog(null, "Correct");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong");
		}
		String pizza = JOptionPane.showInputDialog("The Smith family is a very wealthy family "
				+ "that lives in a big circular home" + "One morning Mr.Smith woke up and found his gardener's body."
				+ "He knew it was one of his employees who had killed him"
				+ "So he asked them  what they wer doing in the morining and he got these replies"
				+ "Chauffer; I was outside washing the car" + " Maid; I was dusting the corners of the house"
				+ " I was starting to make lunch for later" + "From the replies he knew who the killer was"
				+ "Who was it ");
		if (pizza.contentEquals("The Maid")) {
			JOptionPane.showMessageDialog(null, " Correct");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong");
		
		}
		JOptionPane.showMessageDialog(null, "your score is");

	}
}
