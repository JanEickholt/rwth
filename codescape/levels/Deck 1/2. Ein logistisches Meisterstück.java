import codescape.Dogbot;
public class MyDogbot extends Dogbot {

    public void run() {
		// Erstellen eines Strings mit dem Passwort mittels:
		// String password = read();
		// Eingabe des Passworts mittels:
		// write(password);

		// Dein Code hier:	
        
        String a = "";
        for (int i = 0; i < 15; i++) {
            if (i == 0 || i == 1 || i == 7 || i == 13 || i == 14) {
        	    move();
            }
            if (i == 2 || i == 4 || i == 5 || i == 6 || i == 8 || i == 10 || i == 11 || i == 12) {
        	    turnLeft();
            }
            if (i == 3) {
        	    a = read();
            }
            if (i == 9) {
        	    write(a);
            }
        }

    }
}