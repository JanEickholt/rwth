import codescape.Dogbot;
public class MyDogbot extends Dogbot {

    public void run() {

        for (int i = 0; i < 33; i++) {
            if (i == 0 || i == 2 || i == 6 || i == 7 || i == 9 || i == 10 || i == 12 || i == 13 || i == 17 || i == 18 || i == 22 || i == 23 || i == 27 || i == 31 || i == 32) {
            	move();
            }
            if (i == 1 || i == 3 || i == 4 || i == 8 || i == 11 || i == 14 || i == 15 || i == 16 || i == 19 || i == 20 || i == 21 || i == 24 || i == 25 || i == 28 || i == 29 || i == 30) {
            	turnLeft();
            }
            if (i == 5 || i == 26) {
            	pickUp();
            }
        }

    }
}