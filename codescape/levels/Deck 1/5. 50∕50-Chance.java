import codescape.Dogbot;
public class MyDogbot extends Dogbot {

    public void run() {
		// Stringausgabe: System.out.println(String);
		// Stringvergleich: String1.equals(String2);
		// Die Ausgabe von read() in diesem Raum ist entweder "L" oder "R"

		// Dein Code hier:
		String a = "";
		for (int i = 0; i < 11; i++) {
            if (i == 0 || i == 6 || i == 10) {
        	    move();
            }
            if (i == 1 || i == 3 || i == 4 || i == 5 || i == 7 ||
            (a.equals("R") && (i == 8))||
            (a.equals("R") && (i == 9))) {
        	    turnLeft();
            }
            if (i == 2) {
        	    a = read();
            }
        }

    }
}