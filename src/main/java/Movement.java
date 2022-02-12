import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Movement {

    private  int randomEvent;
    private  int randomEvent2;
    private int level = 1;

    public void travelLeft(Scanner scanner) {
        this.randomEvent = ThreadLocalRandom.current().nextInt(1, 100 + 1);
        if (randomEvent <= 10) {
            Events.eventStepOnNail();
        } else if (randomEvent <= 30 && randomEvent > 10 ) {
           // Events.eventBearAttack(scanner, move);
        } else if (randomEvent <= 50 && randomEvent > 30 ) {
            Events.eventPitTrap(scanner);
        } else if (randomEvent <= 100 && randomEvent > 50 ) {
            Events.eventDeer();
        }

        this.level++;
    }

    public void travelRight(Scanner scanner, Movement move) {
        randomEvent2 = ThreadLocalRandom.current().nextInt(1, 100 + 1);
        if (randomEvent2 <= 100) {
            Events.eventBearAttack(scanner, move);
        } else {

        }

        this.level++;
    }

    public int getRandomEvent() {
        return randomEvent;
    }

    public int getRandomEvent2() {
        return randomEvent2;
    }

    public int getLevel() {
        return level;
    }
}
