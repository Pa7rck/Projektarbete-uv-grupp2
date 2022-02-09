import java.util.concurrent.ThreadLocalRandom;

public class Movement {

    private int randomEvent;

    public void travelLeft() {
        this.randomEvent = ThreadLocalRandom.current().nextInt(1, 50 + 1);
    }

    public void travelRight() {
        this.randomEvent = ThreadLocalRandom.current().nextInt(1, 100 + 1);
    }

    public int getRandomEvent() {
        return randomEvent;
    }
}
