import codescape.Dogbot;
public class MyDogbot extends Dogbot {

    public void run() {

        for (int i = 0; i < 19; i++) {

            switch(i){
            case 7: case 8: case 14: {
                turnRight();
                break;
            }
            case 9: {
                pickUp();
                break;
            }
            default -> move();
            }
        }

    }
}