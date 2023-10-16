import codescape.Dogbot;
public class MyDogbot extends Dogbot {

    public void run() {

        for (int i = 0; i < 13; i++) {
            if (i == 0 || i == 1 || i == 2 || i == 3 || i == 6 || i == 7 || i == 8 || i == 12) {
        	    move();
            }
            if (i == 4) {
        	    pickUp();
            }
            if (i == 5 || i == 9 || i == 10 || i == 11) {
        	    turnLeft();
            }
        }

    }
}