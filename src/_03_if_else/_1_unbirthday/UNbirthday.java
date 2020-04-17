package _03_if_else._1_unbirthday;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class UNbirthday {
	public static void main(String args[]){
	String input= JOptionPane.showInputDialog("When is your birthday?(put a 0 in the front of you month if it is not a double digit number)");
	Date date = new Date();
	SimpleDateFormat formatter = new SimpleDateFormat("MM/dd");
	System.out.println(formatter.format(date));
	String today = formatter.format(date);
			System.out.println(today);
			if(input.equals(today)){
				JOptionPane.showMessageDialog(null, "Happy birthday!");
				
	}
			else {
JOptionPane.showMessageDialog(null, "HappyUNbirthday!");
			}
}}
