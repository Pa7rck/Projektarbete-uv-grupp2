import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class EventsTest {
    Scanner scannerWithOne = new Scanner("1\n");
    Scanner scannerWithTwo = new Scanner("2\n");

    @Test
    public void eventFindMushroomTest() {
        Player.addMushrooms(1);
        assertEquals(1, Player.getMushroomCount());
    }

    @Test
    public void eventStepOnNailTest() {
        Events.eventStepOnNail();
        assertEquals(90, Player.getHP());
    }

    @Test
    public void eventDeerTest() {
        Player.takeDamage(10);
        assertEquals(90, Player.getHP());
        Events.eventDeer();
        assertEquals(100, Player.getHP());
    }

    @Test
    public void eventBearAttackTest() {
        Events.eventBearAttack(scannerWithOne);
    }
}
