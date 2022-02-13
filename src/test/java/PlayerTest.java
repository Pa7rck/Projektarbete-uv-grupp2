import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/*
    Kolla att man får ett namn
    Kolla att man får en mushroom
    Att den äter
    att den tar bort en svamp

    Har HP
    Tar damage
    Får HP


 */
public class PlayerTest {

    private Player player;

    public PlayerTest() {
    }


    @Test
    public void nameTest(){
        Player.setName("Bolle");
        assertSame("Bolle", Player.getName());
    }

    @Test
    public void maxHPTest() {
        Player.addHP(10);
        assertEquals(100, Player.getHP());
    }

    @Test
    public void testTakeDamage() {
        assertEquals(100, Player.getHP());
        Player.takeDamage(10);
        assertEquals(90, Player.getHP());
    }

    // Mushroomiiies test
    @Test
    public void addAndRemoveMushroomsTest(){
        Player.addMushrooms(10);
        assertEquals(10, Player.getMushroomCount());

        Player.removeMushrooms(5);
        assertEquals(5, Player.getMushroomCount());
    }
}

