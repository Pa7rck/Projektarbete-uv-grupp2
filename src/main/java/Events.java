import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Events {
    private static int random;
    private static int choice;

    public static void eventBearAttack(Scanner scanner) {
        try {
            System.out.println("A bear appears from behind a tree, making its way towards you.\nWhat do you do?\n");
            System.out.println("1. Try to scare the bear.\n2. Try to hide.");
            while (true) {
                choice = scanner.nextInt();
                if (choice == 1) {
                    random = ThreadLocalRandom.current().nextInt(1, 4 + 1);
                    if (random == 1) {
                        System.out.println("The bear gets scared and runs away. You get away safely.");
                    } else {
                        System.out.println(
                                "The bear doesn't fear you at all. It charges at you, gets a swing off and runs away.\nYou lose 30 HP.");
                        Player.takeDamage(30);
                    }
                    break;
                } else if (choice == 2) {
                    random = ThreadLocalRandom.current().nextInt(1, 2 + 1);
                    if (random == 1) {
                        System.out.println(
                                "You try to hide behind a closeby rock, but the bear sees you. It charges you, gets a swing off and runs away.\nYou lose 30 HP.");
                        Player.takeDamage(30);
                    } else {
                        System.out.println(
                                "You manage to hide behind a rock, and the bear doesn't notice you. It walks away and you're once again safe.");
                    }
                    break;
                } else {
                    System.err.println("\nInvalid choice.\n\n1. Try to scare the bear.\n2. Try to hide.");
                }
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void eventFindMushroom() {
        System.out.println("You find a healthy-looking mushroom. You add it to your backpack.");
        Player.addMushrooms(1);
    }

    public static void eventStepOnNail() {
        System.out.println("As you walk along the path, you step on an old, rusty nail. You lose 5 HP.");
        Player.takeDamage(10);
    }

    public static void eventDeer() {
        System.out.println("Suddenly, a magnificent deer jumps across the path!");
        if (Player.getHP() < 100) {
            System.out.println("The beaufy of the scene fills you with joy, healing you a little.");
            Player.addHP(10);
        } else {
            System.out.println("It runs away into the forest, and nothing more happens.");
        }
    }

    public static void eventPitTrap(Scanner scanner) {
        try {
            System.out.println(
                    "In the middle of the trail, you see a big pile of leaves, with something sticking up through them.");
            System.out.println("It could be a trap, or possibly some item of worth.\nWhat do you do?\n");
            System.out.println("1. Investigate the pile of leaves.\n2. Walk around it.");
            while (true) {
                choice = scanner.nextInt();
                if (choice == 1) {
                    random = ThreadLocalRandom.current().nextInt(1, 2 + 1);
                    if (random == 1) {
                        System.out.println(
                                "As you get close, you realize there's some mushrooms growing in the pile.\nYou pick them up.");
                        Player.addMushrooms(5);
                    } else {
                        System.out.println(
                                "As you stick your hand through the leaves, you realize there's a bunch of broken glass underneath and you cut yourself.");
                        System.out.println("You take 15 damage.");
                        Player.takeDamage(15);
                    }
                    break;
                } else {
                    System.out.println("You walk past the pile of leaves and nothing happens.");
                }
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void eventFox(Scanner scanner) {
        try {
            System.out.println("Walking along the trail, you see a fox looking at you curiously.");
            System.out.println("It seems hesitant, but maybe you can approach it.");
            System.out.println("What will you do?\n");
            System.out.println("1. Approach the fox.\n2. Ignore it and continue on.");
            while (true) {
                choice = scanner.nextInt();
                if (choice == 1) {
                    random = ThreadLocalRandom.current().nextInt(1, 1 + 1);
                    if (random == 1) {
                        System.out.println(
                                "You take a few steps towards the fox and kneel down. The fox walks up to you and starts sniffing around you.");
                        if (Player.getMushroomCount() > 0) {
                            System.out.println(
                                    "It quickly grabs a mushroom from your backpack and runs away. That's too bad...");
                            Player.removeMushrooms(1);
                        } else {
                            System.out.println("It quickly gets bored and walks away.");
                        }
                        break;
                    } else {
                        System.out.println(
                                "The fox gets scared and runs away, leaving a msuhroom behind. You decided to take it with you.");
                        Player.addMushrooms(1);
                        break;
                    }
                } else if (choice == 2) {
                    System.out.println("You decide to ignore the fox and keep walking.");
                    break;
                } else {
                    System.err.println("\nInvalid choice.\n\n1. Approach the fox.\n2. Ignore it and continue on.");
                }
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
