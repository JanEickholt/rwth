import codescape.Dogbot;
public class MyDogbot extends Dogbot {

    public void run() {

        for (int i = 0; i < 12; i++) {

            switch(i){
            case 2: case 6: case 7: case 9 {
                turnRight();
                break;
            }
            case 5: {
                pickUp();
                break;
            }
            default -> move();
            }
        }

    }
}