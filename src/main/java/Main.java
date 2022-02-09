import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Movement move = new Movement();

		try(BufferedReader reader = new BufferedReader(new FileReader("Prologue.txt"));
			Scanner scanner = new Scanner(System.in)) {
			String lines;
			while((lines = reader.readLine()) != null) {
				System.out.println(lines);
			}

			System.out.println();
			System.out.println("Which path do you choose?(left/right)");
			String userChoice = scanner.next();

			if(userChoice.equals("left")) {
				move.travelLeft();
				if (move.getRandomEvent() >= 3) {
					// event
				} else {
					// event
				}
			} else if (userChoice.equals("right")) {
				move.travelRight();
			}
		}







		move.travelLeft();
		System.out.println(move.getRandomEvent());

	}

}
