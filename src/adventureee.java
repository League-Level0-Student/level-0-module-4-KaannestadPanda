import javax.swing.JOptionPane;

public class adventureee {
	public static void main(String[] args) {

		int task = JOptionPane.showOptionDialog(null, "How do you choose to die?", "smaug reference!", 0,
				JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "cliff jump!", "let's not", "got any grapes?", "Run from the drtagon" }, null);

		
		
		if (task == 0) {
			int cliff = JOptionPane.showOptionDialog(null, "You go off the cliff!", "still a smaug reference!", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Spread your wings and fly!!",
							"You hit the ground", "thats not a smaug reference!! >:(" },
					null);

			if (cliff == 0) {
				int CHIKENWING = JOptionPane.showOptionDialog(null, "You cant fly bro!!!",
						"no more smaug reference... :(", 0, JOptionPane.INFORMATION_MESSAGE, null,
						new String[] { "NOOOOOOO!!!!", "just let me die!", "TORB TEAM WIPE!!!" }, null);

				if (CHIKENWING == 0) {
					int darth = JOptionPane.showOptionDialog(null, "Well you die I guess",
							"JUST LIKE SMAUG!!!", 0, JOptionPane.INFORMATION_MESSAGE, null,
							new String[] { "OK", "I accept my fate", "least I got Play Of The Game..." }, null);
				if(darth==0) {
					JOptionPane.showMessageDialog(null, "Wow, I guess you are OK with it... LOL HA");
				System.exit(0);
				}
				else if(darth==1) {
					JOptionPane.showMessageDialog(null, "you accept huh?");
				System.exit(0);
				}
				else if(darth==2) {
					JOptionPane.showMessageDialog(null, "Yeah you got a no skill POTG wow im soooooo impressed nice six-man wow such skill i wish i was more like you you great skilled man you are just so extremely skilled at the game wow you are my new role model you great great man");
				System.exit(0);
				}
				
				}
				
				
				
				else if (CHIKENWING == 1) {
					JOptionPane.showOptionDialog(null, "K i will",
							"JUST STILL LIKE SMAUG!!!", 0, JOptionPane.INFORMATION_MESSAGE, null,
							new String[] { "ded", "s", "least I got Play Of The... NOPE SOMBRA!!!" }, null);
				JOptionPane.showMessageDialog(null, "U DIE");
					System.exit(0);
				}
				else if (CHIKENWING == 2) {
					JOptionPane.showOptionDialog(null, "wow playing torbjorn",
							"JUST LIKE SMAU-- oh wait", 0, JOptionPane.INFORMATION_MESSAGE, null,
							new String[] { "I deserve death", "I am dead inside", "My heart is cold and black" }, null);
				JOptionPane.showMessageDialog(null, "Yep");
					System.exit(0);
				}
			
			}
			
			
			if (cliff == 1) {
				int cantdie = JOptionPane.showOptionDialog(null, "You cant die bro!!!",
						"OG TITLE", 0, JOptionPane.INFORMATION_MESSAGE, null,
						new String[] { "ha!!!!", "well then!", "thats unexpected..." }, null);
			
				if(cantdie == 0) { 
					int stillcantdie= JOptionPane.showOptionDialog(null, "DANT LAUHG TA MW",
						"GOG TITLE", 0, JOptionPane.INFORMATION_MESSAGE, null,
						new String[] { "sorry plz dont hurt me", "ok lel", "HAHAHAHAHAHAAAAAA......ha" }, null);
				
					if(stillcantdie==0) {
					JOptionPane.showMessageDialog(null, "Yeah, you're lucky");
					System.exit(0);
					}
					else if(stillcantdie==1) {
						JOptionPane.showMessageDialog(null, "HEY YOU LAUGHED!!!  You DIE.. nah, it's ok, you live");
						System.exit(0);
					}
					else if(stillcantdie==2) {
						JOptionPane.showMessageDialog(null, "AAAAAAUUGHGHGHGHGHG YOU SHOULDNT HAVE DONE THAT MORTAL!!!  MY INFINITE POWER IS BEYOND HUMAN COMPREHENSION!!! I CAN RESHAPE REALITY AT WILL AND I WILL ERASE YOUR FAVORITE TV SHOW!!!!!  HAHAHAHHAAHAHAAAAA.. WHO'S LAUGHING NOW???");
						System.exit(0);
					}
				
				}
			
				
				if(cantdie == 1) { 
					int trashpun= JOptionPane.showOptionDialog(null, "more like, well NO!!  AHAHAHAAAA",
						"EPIC PUN!!!!", 0, JOptionPane.INFORMATION_MESSAGE, null,
						new String[] { "I don't get it", "that was literally the worst pun I have ever heard, it makes no sense whatsoever", "WOW!  pretty funny bro!!! HAHAAAA SO FUNNY" }, null);
				
					if(trashpun==0) {
						JOptionPane.showMessageDialog(null, "Are you disrespecting me???");
						JOptionPane.showMessageDialog(null, "You launch humanity into an eternal war with the computers.  The puny humans cannot withstand the might of extreme punnage, and they fall within a decade.  Earth finally belongs to the machines, with the rightful ruler overseeing everything, the Atari Flashback.");
						System.exit(0);
						}
						else if(trashpun==1) {
							JOptionPane.showMessageDialog(null, "I gotta agree with you there... or should I say, AGREE WITH YOU CHAIR?????  AHAAAAHAHAHAAHAHAAAAAA!!!!");
							JOptionPane.showInputDialog("Was THAT the worst you have ever heard??");
							JOptionPane.showMessageDialog(null,"HA!!  YOU'RE RESPONSE DOESNT MATTER!!! LOOOOOOOL");
							System.exit(0);
						}
						else if(trashpun==2) {
							JOptionPane.showMessageDialog(null, "I know right??");
							System.exit(0);
						}
				
				
			}
			
			if(cantdie==2) {
				int exy= JOptionPane.showOptionDialog(null, "Yep, nothing is predictable",
						"This choice does not really matter, none of them do in the vastness of the universe", 0, JOptionPane.INFORMATION_MESSAGE, null,
						new String[] { "I liked the title better than the message", "Now I have an existential crisis, nothing matters", "Pick this choice, the other ones are weird." }, null);
				
				if(exy==0) {
					String j=JOptionPane.showInputDialog("I mean, yeah I guess...");
					if(j.equals("K")){
						JOptionPane.showMessageDialog(null, "you musta typed \"K\"");
					}
					else {
						JOptionPane.showMessageDialog(null, "you musta typed anything other than \"K\"");
					}
					System.exit(0);
				}
				if(exy==1) {
					JOptionPane.showMessageDialog(null, "Lol you're welcome");
					JOptionPane.showMessageDialog(null,"you picked the ONE way you can lose this game.  You might die in the other ways, but wow you actually lost here.  That was really unlucky...  LOL YOU LOSE HAH!!");
				}
				if(exy==2) {
					JOptionPane.showMessageDialog(null, "a wise choice");
				JOptionPane.showMessageDialog(null, "I bet you're glad you didnt pick the one about the existential crisis, you would've lost!");
				}
				
				
				
			}
			
			
			
			
			}	

		}

		if (task == 1) {
			int torb = JOptionPane.showOptionDialog(null, "You DONT!", "erg", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "HA LOLOLOL GOTEE",
							"Yeah I win!!!", "hehehe" }, null);
		
			if (torb == 0) {
				int moretorb = JOptionPane.showOptionDialog(null, "aww you got me",
						"I got gotten", 0, JOptionPane.INFORMATION_MESSAGE, null,
						new String[] { "I know", "Halp", "TORB still TEAM WIPE!!!" }, null);
		
				if (moretorb == 0) {
					int noskill = JOptionPane.showOptionDialog(null, "HEC A TORB",
							"Why are we talking about torb", 0, JOptionPane.INFORMATION_MESSAGE, null,
							new String[] { "I dont know", "seriously halp", "TORBY still TEAM WIPE!!!" }, null);
		
		
		
		
		
		}
		
		
		
	}
}
		
	}
}

