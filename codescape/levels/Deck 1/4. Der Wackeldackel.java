// Scheinbar besteht kein Wackelkontakt?

import codescape.Dogbot;
public class MyDogbot extends Dogbot {

    public void run() {

		// Die Energiezellen sind nur mit sehr effizientem Programmieren sammelbar
		// Dein Code hier:


        for (int i = 0; i < 15; i++) {

            switch(i){
            case 6: case 10: case 11: case 13: {
                turnLeft();
                break;
            }
            case 7: case 9: {
                pickUp();
                break;
            }
            default -> move();
        }

    }
}