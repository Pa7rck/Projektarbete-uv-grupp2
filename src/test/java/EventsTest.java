import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import resources.Events;
import resources.Player;

public class EventsTest {
    @Test
    public void eventFindMushroomTest() {
        Player.addMushrooms(1);
        assertEquals(1, Player.getMushroomCount());
    }

    @Test
    public void eventStepOnNailTest() {
        Player.addHP(100);
        Events.eventStepOnNail();
        assertEquals(85, Player.getHP());
    }

    @Test
    public void eventDeerTest() {
        Player.addHP(100);
        Player.takeDamage(10);
        assertEquals(90, Player.getHP());
        Events.eventDeer();
        assertEquals(100, Player.getHP());
    }
}
