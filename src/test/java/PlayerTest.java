import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    @Test
    public void nameTest(){
        Player.setName("Bolle");
        assertSame("Bolle", Player.getName());
    }

    @Test
    public void maxHPTest() {
        Player.addHP(200);
        assertEquals(100, Player.getHP());
    }

    @Test
    public void takeDamageTest() {
        int expected = Player.getHP();
        assertEquals(expected, Player.getHP());
        Player.takeDamage(10);
        expected -= 10;
        assertEquals(expected, Player.getHP());
    }

    // Mushroomiiies test
    @Test
    public void addAndRemoveMushroomsTest(){
        int expected = Player.getMushroomCount();
        Player.addMushrooms(10);
        expected += 10;
        assertEquals(10, Player.getMushroomCount());

        Player.removeMushrooms(5);
        expected -= 5;
        assertEquals(5, Player.getMushroomCount());
    }
}

