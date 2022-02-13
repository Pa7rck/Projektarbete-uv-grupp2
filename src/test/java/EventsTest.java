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
        Events.eventStepOnNail();
        assertEquals(85, Player.getHP());
    }

    @Test
    public void eventDeerTest() {
        Player.takeDamage(10);
        assertEquals(90, Player.getHP());
        Events.eventDeer();
        assertEquals(100, Player.getHP());
    }
}
