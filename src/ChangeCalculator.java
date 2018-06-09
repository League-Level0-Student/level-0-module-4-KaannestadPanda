//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {
		// Ask the user how many nickels they have
String nick = JOptionPane.showInputDialog(null, "Nicleks?");
int n=Integer.parseInt(nick);
int niklecs=5*n;

String dumb = JOptionPane.showInputDialog(null, "dooms?");
int d=Integer.parseInt(dumb);
int dimleks=10*d;

String quarterr = JOptionPane.showInputDialog(null, "quarks?");
int q=Integer.parseInt(quarterr);
int quartets=25*q;

double dollor  = (quartets+dimleks+niklecs)/100.0;
JOptionPane.showInputDialog("You have like $" +dollor+ " or something.");
		// Convert their answer to an int using Integer.parseInt()

		// Ask the user how many dimes they have, and convert their answer

		// Ask the user how many quarters they have, and convert their answer

		// Calculate how much money the user has and save it in a double variable 

		// Tell the user how much money they have

	}
}

