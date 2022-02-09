import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Events {
    public static void BearAttack() {
        int random;
        int choice;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("A bear appears from behind a tree, making its way towards you. What do you do?\n");
            System.out.println("1. Approach the bear.\n2. Try to hide.");
            choice = scanner.nextInt();
            if (choice == 1) {
                random = ThreadLocalRandom.current().nextInt(1, 4);
                if (random == 1){
                    System.out.println("The bear gets scared and runs away. You get away safely.");
                } else {
                    System.out.println("The bear decides to attack you, and you lose 30 HP.");
                    Player.setHP(Player.getHP - 30);
                }
            } else if (choice == 2) {
                random = ThreadLocalRandom.current().nextInt(1, 4);
                if (random == 1){
                    System.out.println("You try to hide behind a closeby rock, but the bear sees you. It charges you, gets a swing off and runt away. You lose 30 HP.");
                    Player.setHP(Player.getHP - 30);
                } else {
                    System.out.println("You manage to hide behind a rock, and the bear doesn't notice you. It walks away and you're once again safe.");
                }
            } else {
                throw IOException("Invalid choice.");
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
