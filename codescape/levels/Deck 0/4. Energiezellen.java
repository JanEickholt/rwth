import codescape.Dogbot;
public class MyDogbot extends Dogbot {

    public void run() {

        for (int i = 0; i < 13; i++) {

            switch(i){
            case 4: {
                pickUp();
                break;
            }
            case 5: case 9: case 10: case 11: {
                turnLeft();
                break;
            }
            default -> move();
            }
        }

    }
}