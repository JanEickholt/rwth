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

            switch(i){
            case 2: case 4: case 5: case 6: case 8: case 10: case 11: case 12: {
                turnLeft();
                break;
            }
            case 3: {
                a = read();
                break;
            }
            case 9: {
                write(a);
                break;
            }
            default: move();
            }
        }

    }
}