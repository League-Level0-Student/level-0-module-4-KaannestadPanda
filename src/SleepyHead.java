//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        
        /* You MUST use the above boolean variables in your code */
        
        /*
         * Ask the user for these values using a confirm dialog like the one below
         * JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
         */
        int k=JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Slappy Head", JOptionPane.YES_NO_OPTION);
        int a=JOptionPane.showConfirmDialog(null, "Is it a VAcatiON?", "Sloppy Head", JOptionPane.YES_NO_OPTION);
      
        if(k==1) {
	isWeekday=false;
	
}
else{
	isWeekday=true;
}
if(a==1) {
	isVacation=false;
}
else{
	isVacation=true;
}
if(isWeekday==true&&isVacation==false) {
	JOptionPane.showMessageDialog(null, "GETTTTTT UP MAGGOT!!!");
}
else if(isWeekday==true&&isVacation==true) {
	JOptionPane.showMessageDialog(null, "sleeeeeeeepppppppp......");
}
else if(isWeekday==false||isVacation==true) {
	JOptionPane.showMessageDialog(null, "sleppppp");
}
        /*
         * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!” If it is a weekday, and we are on vacation,
         * print “sleep in”.
         */
    }
}
