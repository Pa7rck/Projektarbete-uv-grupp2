package utilities;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import resources.Events;

/**
 * A class that provides methods that generates a random number between 1 and 100.
 * That number is then being used inside the methods to determine which event to call
 * from the resources.Events class. The class also makes sure that the player level increases
 * after each stage of the game.
 */

public class GenerateEvent {

    private int randomEvent;
    private int randomEvent2;
    private int level = 1;

    public void generateEventLeft(Scanner scanner, GenerateEvent ge) {
        this.randomEvent = ThreadLocalRandom.current().nextInt(1, 100 + 1);
        if (randomEvent >= 35 && randomEvent <= 45 || randomEvent >= 65 && randomEvent <= 75 || randomEvent >= 95) {
            Events.eventFindMushroom();
            System.out.println();
        }
        if (randomEvent <= 40) {
            Events.eventDeer();
        } else if (randomEvent > 40 && randomEvent <= 50 ) {
            Events.eventStepOnNail();
        } else if (randomEvent > 50 && randomEvent <= 70 ) {
            Events.eventLeafPile(scanner);
        } else if (randomEvent > 70 && randomEvent <= 80 ) {
            Events.eventFox(scanner);
        } else if (randomEvent > 80) {
            Events.eventBearAttack(scanner, ge);
        }

        this.level++;
    }

    public void generateEventRight(Scanner scanner, GenerateEvent ge) {
        this.randomEvent2 = ThreadLocalRandom.current().nextInt(1, 100 + 1);
        if (randomEvent2 >= 37 && randomEvent2 <= 47 || randomEvent2 >= 67 && randomEvent2 <= 77 || randomEvent2 >= 80) {
            Events.eventFindMushroom();
            System.out.println();
        }
        if (randomEvent2 <= 20) {
            Events.eventDeer();
        } else if (randomEvent2 > 20 && randomEvent2 <= 30 ) {
            Events.eventStepOnNail();
        } else if (randomEvent2 > 30 && randomEvent2 <= 40 ) {
            Events.eventLeafPile(scanner);
        } else if (randomEvent2 > 40 && randomEvent2 <= 60 ) {
            Events.eventFox(scanner);
        } else if (randomEvent2 > 60) {
            Events.eventBearAttack(scanner, ge);
        }

        this.level++;
    }

    public int getLevel() {
        return level;
    }
}
