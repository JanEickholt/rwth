import codescape.Dogbot;
public class MyDogbot extends Dogbot {

    public void run() {
		// Stringausgabe: System.out.println(String);
		// Stringvergleich: String1.equals(String2);
		// Die Ausgabe von read() in diesem Raum ist entweder "L" oder "R"

		// Dein Code hier:
        String a = "";
		for (int i = 0; i < 11; i++) {

		    switch(i){
		    case 2: {
		        a = read();
		        break;
		    }
		    case 1: case 3: case 4: case 5: case 7: case 8: case 9: {
		        if(((i != 8) && (i != 9)) || a.equals("R") || a.equals("")){
		            turnLeft();
                }
                break;
            }
		    default: move();
		    }

    }
}