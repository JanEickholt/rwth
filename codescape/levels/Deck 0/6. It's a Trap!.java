import codescape.Dogbot;
public class MyDogbot extends Dogbot {

    public void run() {

        for (int i = 0; i < 21; i++) {
            if (i == 0 || i == 1 || i == 2 || i == 5 || i == 8 || i == 9 || i == 10 || i == 11 || i == 12 || i == 14 || i == 18 || i == 20) {
        	    move();
            }
            if (i == 3 || i == 4 || i == 6 || i == 7 || i == 13 || i == 16 || i == 17 || i == 19) {
        	    turnRight();
            }
            if (i == 15) {
        	    pickUp();
            }
        }

    }
}