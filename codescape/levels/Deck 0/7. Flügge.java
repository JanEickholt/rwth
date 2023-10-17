import codescape.Dogbot;
public class MyDogbot extends Dogbot {

    public void run() {

        for (int i = 0; i < 33; i++) {

            switch(i){
            case 1: case 3: case 4: case 8: case 11: case 14: case 15: case 16: case 19: case 20: case 21: case 24: case 25: case 28: case 29: case 30: {
                turnLeft();
                break;
            }
            case 5: case 26: {
                pickUp();
                break;
            }
            default -> move();
            }
        }

    }
}