import java.util.concurrent.ThreadLocalRandom;

public class Movement {

    // private int randomEvent;
    // private int randomEvent2;

    // Create an event object

    public void travelLeft() {
        int randomEvent = ThreadLocalRandom.current().nextInt(1, 100 + 1);
        if (randomEvent >= 33) {
            // event
            // consequences for player
        } else {
            // event
            // consequences for player
        }
    }

    public void travelRight() {
        int randomEvent2 = ThreadLocalRandom.current().nextInt(1, 100 + 1);
        if(randomEvent2 >= 33) {
            // event
            // consequences for player
        } else {
            // event
            // consequences for player
        }
    }
}
