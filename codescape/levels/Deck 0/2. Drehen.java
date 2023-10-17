import codescape.Dogbot;
public class MyDogbot extends Dogbot {

    public void run() {

        for (int i = 0; i < 5; i++) {

            switch(i){
            case 3: {
                turnRight();
                break;
            }
            default: move();
            }
        }

    }
}