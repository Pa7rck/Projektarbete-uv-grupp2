import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Events.eventBearAttack(sc);
			Events.eventFindMushroom();
			Events.eventStepOnNail();
			Events.eventFox(sc);

			System.out.println("HP: " + Player.getHP() + " | Mushrooms: " + Player.getMushroomCount());

		} catch (Exception e) {
		}
	}
}
