import codescape.Dogbot;
public class MyDogbot extends Dogbot {

    public void run() {

        for (int i = 0; i < 5; i++) {
            if (i == 0 || i == 1 || i == 2 || i == 4) {
                move();
            }
            if (i == 3) {
                turnRight();
            }
        }

    }
}