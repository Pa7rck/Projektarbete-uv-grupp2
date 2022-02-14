package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import utilities.GenerateEvent;
import resources.Player;

public class Main {
	public static void main(String[] args) throws IOException {
		GenerateEvent ge = new GenerateEvent();
		int victoryLevel = 10;

		try (BufferedReader reader = new BufferedReader(new FileReader("Prologue.txt"));
				Scanner scanner = new Scanner(System.in)) {

			System.out.println("Remember your name:");
			Player.setName(scanner.nextLine());

			String lines;

			// Prints out the prologue.
			while ((lines = reader.readLine()) != null) {
				System.out.println(lines.replaceAll("PlayerName", Player.getName()));
			}

			// To make the game stop after reaching a certain level(or died)
			started: while (true) {
				System.out.println();
				status(ge);
				System.out.println();
				System.out.println("Which path do you choose?");
				System.out.println("1. Take left and travel through the fog");
				System.out.println("2. Ignore the obvious risks and head towards the road");
				if (Player.getMushroomCount() > 0) {
					System.out.println("3. Eat a mushroom");
				}
				System.out.println();
				String userChoice = scanner.nextLine();
				System.out.println();

				if (userChoice.equals("k")) {
					Player.takeDamage(200);
				}
				if (userChoice.equals("1")) {
					ge.generateEventLeft(scanner, ge);
				} else if (userChoice.equals("2")) {
					ge.generateEventRight(scanner, ge);
				} else if (userChoice.equals("3") && Player.getMushroomCount() > 0) {
					Player.eatMushroom();
				} else {
					System.err.println("That is not a path, choose another one");
				}

				if (ge.getLevel() == victoryLevel && Player.getHP() > 0) {
					System.out.printf("\n\n\nCongratulations, %s!\nYou survived the forest with %d remaining HP!\n\n\n",
							Player.getName(), Player.getHP());
					System.out.println("Credits:\n");
					System.out.println("Andreas");
					System.out.println("Gabriella");
					System.out.println("Patrick");
					System.out.println("\n\nPress any key to exit");
					scanner.nextLine();
					break started;
				}

				if (Player.getHP() < 1) {
					System.out.println("\nYou died.\n\nYou reached level " + ge.getLevel()
							+ "\n\nPress any key to exit");
					scanner.nextLine();
					break started;
				}
			}
		} catch (FileNotFoundException ex) {
			System.err.println("The file does not exist");
		}
	}

	private static void status(GenerateEvent ge) {
		System.out.printf("-----------------------------------Level %02d - %d HP-----------------------------------\n",
				ge.getLevel(), Player.getHP());
	}
}
