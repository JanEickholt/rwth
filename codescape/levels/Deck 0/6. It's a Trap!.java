import codescape.Dogbot;
public class MyDogbot extends Dogbot {

    public void run() {

        for (int i = 0; i < 21; i++) {

            switch(i){
            case 3: case 4: case 6: case 7: case 13: case 16: case 17: case 19: {
                turnRight();
                break;
            }
            case 15: {
                pickUp();
                break;
            }
            default -> move();
            }
        }

    }
}