import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Movement move = new Movement();

		try (BufferedReader reader = new BufferedReader(new FileReader("Prologue.txt"));
			 Scanner scanner = new Scanner(System.in)) {
			String lines;
			while ((lines = reader.readLine()) != null) {
				System.out.println(lines);
			}

			int level = 1;
			while (level < 5) {
				System.out.println();
				System.out.println("Which path do you choose?(left/right)");
				String userChoice = scanner.next();

				if (userChoice.equals("left")) {
					move.travelLeft();
				} else if (userChoice.equals("right")) {
					move.travelRight();
				}

				level++;
			}
		}
	}
}
