import org.junit.jupiter.api.Test;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.*;

public class GenerateEventTest {
    Scanner sc1 = new Scanner("1");
    Scanner sc2 = new Scanner("2");
    GenerateEvent ge = new GenerateEvent();

    @Test
    public void testTurnLeft_Survive() {

        ge.generateEventLeft(sc1, ge);
        int expected = 2;
        int actual = ge.getLevel();
        assertEquals(expected, actual);
    }

    @Test
    public void testTurnRight_Survive() {

        ge.generateEventRight(sc2, ge);
        int expected = 2;
        int actual = ge.getLevel();
        assertEquals(expected, actual);
    }
}
