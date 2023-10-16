import codescape.Dogbot;
public class MyDogbot extends Dogbot {

    public void run() {

        while(true){
            if(!isMovePossible()){
                pickUp();
            }
            else{
                move();
            }
        }

    }
}