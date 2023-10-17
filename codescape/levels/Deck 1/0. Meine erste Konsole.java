import codescape.Dogbot;
public class MyDogbot extends Dogbot {

    public void run() {
		// Passwort: activate

        for (int i = 0; i < 9; i++) {

            switch(i){
            case 2: case 4: case 5: case 6: {
                turnLeft();
                break;
            }
            case 3: {
                write("activate");
                break;
            }
            default -> move();
            }
        }

    }
}