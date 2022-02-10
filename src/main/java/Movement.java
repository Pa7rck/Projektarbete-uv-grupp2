import java.util.concurrent.ThreadLocalRandom;

public class Movement {

    private int level = 1;

    // Create an event object here

    public void travelLeft() {
        int randomEvent = ThreadLocalRandom.current().nextInt(1, 100 + 1);
        if (randomEvent >= 33) {
            // call for event
            // consequences for player
        } else {
            // call for event
            // consequences for player
        }

        this.level++;
    }

    public void travelRight() {
        int randomEvent2 = ThreadLocalRandom.current().nextInt(1, 100 + 1);
        if(randomEvent2 >= 33) {
            // call for event
            // consequences for player
        } else {
            // call for event
            // consequences for player
        }

        this.level++;
    }

    public int getLevel() {
        return level;
    }
}
