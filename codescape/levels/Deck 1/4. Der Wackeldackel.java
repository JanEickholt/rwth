// Scheinbar besteht kein Wackelkontakt?

import codescape.Dogbot;
public class MyDogbot extends Dogbot {

    public void run() {

		// Die Energiezellen sind nur mit sehr effizientem Programmieren sammelbar
		// Dein Code hier:


        for (int i = 0; i < 15; i++) {
            if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8 || i == 12 || i == 14) {
        	    move();
            }
            if (i == 6 || i == 10 || i == 11 || i == 13) {
        	    turnLeft();
            }
            if (i == 7 || i == 9) {
        	    pickUp();
            }
        }

    }
}