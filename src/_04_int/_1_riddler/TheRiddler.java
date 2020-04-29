package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score =0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String answer= JOptionPane.showInputDialog("I have cities, but no houses. I have mountains, but no trees. I have water, but no fish. What am I?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(answer.equalsIgnoreCase("a map")){ 
	JOptionPane.showMessageDialog(null, "Correct!");
	++score ;
}
	else { JOptionPane.showMessageDialog(null, "WROOONG! The answer was a map");
		
}
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles
String answer2 = JOptionPane.showInputDialog("What is seen in the middle of March and April that can't be seen at the beginning or end of either month?");
if(answer2.equalsIgnoreCase("The letter r")){
	JOptionPane.showMessageDialog(null, "Coooooorrectttt!!!");
	++score ;
}
else { JOptionPane.showMessageDialog(null, "INCORRECTTTTTT!");
JOptionPane.showMessageDialog(null, "The answer was The letter r");
	
}
		// 2. Make a pop up to show the score.
		
	
}}

