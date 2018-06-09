import javax.swing.JOptionPane;

public class TEST {

	public static void main(String[] args) {
	
		String nick = JOptionPane.showInputDialog(null, "How badly did you fail?");
		double n=Double.parseDouble(nick);
	
	if (n>100) {
		JOptionPane.showMessageDialog(null, "You got "+n+"!!!  STOP CHEATING >:(");
	}
	else if (n>89) {
		JOptionPane.showMessageDialog(null, "You got "+n+"!!!  Top 4 finish");
	}
	else if (n>74) {
		JOptionPane.showMessageDialog(null, "You got "+n+"!!!  get that #1 victory royale!!");
	}
	else if (n>49) {
		JOptionPane.showMessageDialog(null, "pretty bad bro, "+n);
	}
	else if (n>20) {
		JOptionPane.showMessageDialog(null, "wow you didnt study at ALL!  "+n);
	}
	else if (n>0) {
		JOptionPane.showMessageDialog(null, "I mean, you got at least one right...");
	}
	else if (n<=0) {
		JOptionPane.showMessageDialog(null, "WOW!  NO POINTS?!?!?!?!?!??!?!?!??!  YOU LET ME DOWN!!! RRRRRGRHGRHGHRGHRHGHRHGHSAHGJKSHFJKLHEWJAHFWBHVJEKLVBJ VAKJR FWJKLFH EWFFJEHFJWKELHJEJEJJJJJJJJJJJJJJJ!!!!!!!!.....!");
	}
	
	
	
	
	
	
	
	
	
	}
}
