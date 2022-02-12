import org.junit.jupiter.api.Test;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.*;

public class MovementTest {
    Scanner sc1 = new Scanner("1");
    Scanner sc2 = new Scanner("2");
    Movement move = new Movement();

    @Test
    public void testTurnLeft_Survive() {

        move.travelLeft(sc1, move);
        int expected = 2;
        int actual = move.getLevel();
        assertEquals(expected, actual);
    }

    @Test
    public void testTurnRight_Survive() {

        move.travelRight(sc2, move);
        int expected = 2;
        int actual = move.getLevel();
        assertEquals(expected, actual);
    }
}
