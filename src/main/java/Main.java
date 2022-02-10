import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to our little game! What's your name");
		String name = scanner.nextLine();

		Player player = new Player(name);

		System.out.printf("Hello %s, good luck with finding your friend. You have %d in hp :) ", player.getName(), player.getHealth());

	}

}
