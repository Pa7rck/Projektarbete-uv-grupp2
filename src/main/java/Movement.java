import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Movement {

    private int level = 1;

    public void travelLeft(Scanner scanner) {
        int randomEvent = ThreadLocalRandom.current().nextInt(1, 100 + 1);
        if (randomEvent <= 10) {
            Events.eventBearAttack(scanner);
        } else if (randomEvent <= 30 && randomEvent > 10 ){
            Events.eventPitTrap(scanner);
        } else if (randomEvent <= 60 && randomEvent > 30 ){

        }

        this.level++;
    }

    public void travelRight(Scanner scanner) {
        int randomEvent2 = ThreadLocalRandom.current().nextInt(1, 100 + 1);
        if (randomEvent2 <= 100) {
            Events.eventBearAttack(scanner);
        } else {

        }

        this.level++;
    }

    public int getLevel() {
        return level;
    }
}
