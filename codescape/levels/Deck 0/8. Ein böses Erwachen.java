import codescape.Dogbot;
public class MyDogbot extends Dogbot {

    public void run() {

        for (int i = 0; i < 19; i++) {
            if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 10 || i == 11 || i == 12 || i == 13 || i == 15 || i == 16 || i == 17 || i == 18) {
            	move();
            }
            if (i == 7 || i == 8 || i == 14) {
            	turnRight();
            }
            if (i == 9) {
            	pickUp();
            }
        }

    }
}