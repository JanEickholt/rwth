import codescape.Dogbot;
public class MyDogbot extends Dogbot {

    public void run() {
		// Passwort: activate

        for (int i = 0; i < 9; i++) {
            if (i == 0 || i == 1 || i == 7 || i == 8) {
        	    move();
            }
            if (i == 2 || i == 4 || i == 5 || i == 6) {
        	    turnLeft();
            }
            if (i == 3) {
        	    write("activate");
            }
        }

    }
}