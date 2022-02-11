import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Movement move = new Movement();

		try (BufferedReader reader = new BufferedReader(new FileReader("Prologue.txt"));
			 Scanner scanner = new Scanner(System.in)) {
			String lines;

			// Prints out the prologue.
			while ((lines = reader.readLine()) != null) {
				System.out.println(lines);
			}

			System.out.println();
			System.out.println("Now, what is your name? ");
			String userName = scanner.next();
			Player.setName(userName);

			// To make the game stop after reaching a certain level(or died).
			while (move.getLevel() < 5) {
				System.out.println();
				System.out.println("Which path do you choose?(left/right)");
				String userChoice = scanner.next();

				if (userChoice.equals("left")) {
					move.travelLeft(scanner);
				} else if (userChoice.equals("right")) {
					move.travelRight(scanner);
				}

				if(move.getLevel() == 5) {
					System.out.print("\n\n\nYou survived the forest!\n\n\n");
					System.out.print("Credits:\n\n");
					System.out.println("Andreas");
					System.out.println("Gabriella");
					System.out.println("Patrick");
				}

				if(move.getLevel() < 5) {
					System.out.println("You're on level " + move.getLevel());
					System.out.println("HP " + Player.getHP());
				}

				if(Player.getHP() < 1) {
					System.out.println("You're dead");
				}
			}
		} catch(FileNotFoundException ex) {
			System.err.println("The file does not exist");
		}
	}
}
