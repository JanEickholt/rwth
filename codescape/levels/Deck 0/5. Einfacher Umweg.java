import codescape.Dogbot;
public class MyDogbot extends Dogbot {

    public void run() {

        for (int i = 0; i < 12; i++) {
            if (i == 0 || i == 1 || i == 3 || i == 4 || i == 8 || i == 10 || i == 11) {
                move();
            }
            if (i == 2 || i == 6 || i == 7 || i == 9) {
                turnRight();
            }
            if (i == 5) {
                pickUp();
            }
        }

    }
}