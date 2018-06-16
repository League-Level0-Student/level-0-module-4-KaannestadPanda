import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int Happy = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String species=JOptionPane.showInputDialog("buy a fish");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
for (int flap=0; flap<40000; flap++) {			
int task = JOptionPane.showOptionDialog(null, "Do you care about your pet's emotional security?", "Pet the Pet", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "nah...", "not really", "my pet is a banana" , "another option"}, null);

if (task==0&&species.equals("dug")) {
	nah();
}
else if (task==0&&species.equals("ket")) {
	nahket();
}
else if(task==0) {
	nahelse();
}


if (task==1&&species.equals("dug")) {
	notreally();
}
else if (task==1&&species.equals("ket")) {
	notreallyket();
}
else if(task==1) {
	notreallyelse();
}

if (task==2&&species.equals("dug")) {
	ban();
}
else if (task==2&&species.equals("ket")) {
	banket();
}
else if(task==2) {
	banelse();
}

if (task==3&&species.equals("dug")) {
	four();
}
else if (task==3&&species.equals("ket")) {
	fourket();
}
else if(task==3) {
	fourelse();
}





if(Happy>=5) {
	JOptionPane.showMessageDialog(null, "godo jab");
break;
}
}

			// 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.

	public static void nah() {
		Happy --;
JOptionPane.showMessageDialog(null, "Wow you don't care at ALL!! " +Happy);
	}

	public static void notreally() {
		Happy=Happy;
JOptionPane.showMessageDialog(null, "meh " +Happy);
	}
	
	public static void ban() {
		Happy +=2;
JOptionPane.showMessageDialog(null, "Wow you have very good taste sir!! " +Happy);
	}

	public static void four() {
		Happy -=75;
JOptionPane.showMessageDialog(null, "HAHAHAHAHAAAAAAA....  WRONG choice!!! >:) " +Happy);
	}

	public static void nahket() {
		Happy --;
JOptionPane.showMessageDialog(null, "Wow you don't care at ALL about ur ket!! " +Happy);
	}

	public static void notreallyket() {
		Happy=Happy;
JOptionPane.showMessageDialog(null, "(ket) meh " +Happy);
	}
	
	public static void banket() {
		Happy +=2;
JOptionPane.showMessageDialog(null, "Wow you have very good taste (in kets) sir!! " +Happy);
	}

	public static void fourket() {
		Happy -=75;
JOptionPane.showMessageDialog(null, "HAHAHAHAKETHAAAAAAA....  WRONG choice!!! >:) " +Happy);
	}
	
	public static void nahelse() {
		Happy --;
JOptionPane.showMessageDialog(null, "Wow you don't care at ALL about ur else!! " +Happy);
	}

	public static void notreallyelse() {
		Happy=Happy;
JOptionPane.showMessageDialog(null, "(else) meh " +Happy);
	}
	
	public static void banelse() {
		Happy +=2;
JOptionPane.showMessageDialog(null, "Wow you have very good taste (in else) sir!! " +Happy);
	}

	public static void fourelse() {
		Happy -=75;
JOptionPane.showMessageDialog(null, "HAHAHAHAKETELSEHAAAAAAA....  WRONG choice!!! >:) " +Happy);
	}
	
	
	
	
	
	
	
	
	
	
}