package resources;

import utilities.GenerateEvent;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Events-class
 *
 * This class contains all of the events that can occur throughout the game.
 * As they get called on from the Movement-class, the events get printed on
 * the screen, where the player at times get a choice on how to react.
 *
 * Certain choices will affect the player's health and amount of mushrooms,
 * with some of the events having random outcomes.
 */

public class Events {
    private static int random;
    private static String choice;

    public static void eventBearAttack(Scanner scanner, GenerateEvent ge) {
        int damage = 20 * ge.getLevel();
        if (damage > 60) {
            damage = 60;
        }
        try {
            System.out.println("A bear appears from behind a tree, making its way towards you.\nWhat do you do?\n");
            System.out.println("1. Try to scare the bear.\n2. Try to hide.\n");
            while (true) {
                choice = scanner.nextLine();
                System.out.println();
                if (choice.equals("1")) {
                    random = ThreadLocalRandom.current().nextInt(1, 4 + 1);
                    if (random == 1) {
                        System.out.println("The bear gets scared and runs away. You get away safely.");
                    } else {
                        System.out.println(
                                "The bear doesn't fear you at all. It charges at you, gets a swing off and runs away.\nYou lose "
                                        + damage + " HP.");
                        Player.takeDamage(damage);
                    }
                    break;
                } else if (choice.equals("2")) {
                    random = ThreadLocalRandom.current().nextInt(1, 2 + 1);
                    if (random == 1) {
                        System.out.println(
                                "You try to hide behind a closeby rock, but the bear sees you. It charges you, gets a swing off and runs away.\nYou lose "
                                        + damage + " HP.");
                        Player.takeDamage(damage);
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
        System.out.println("As you walk along the path, you step on an old, rusty nail. You lose 15 HP.");
        Player.takeDamage(15);
    }

    public static void eventDeer() {
        System.out.println("Suddenly, a magnificent deer jumps across the path!");
        if (Player.getHP() < 100) {
            System.out.println("The beauty of the scene fills you with joy, healing you a little.");
            Player.addHP(10);
        } else {
            System.out.println("It runs away into the forest, and nothing more happens.");
        }
    }

    public static void eventLeafPile(Scanner scanner) {
        try {
            System.out.println(
                    "In the middle of the trail, you see a big pile of leaves, with something sticking up through them.");
            System.out.println("It could be a trap, or possibly some item of worth.\nWhat do you do?\n");
            System.out.println("1. Investigate the pile of leaves.\n2. Walk around it.\n");
            while (true) {
                choice = scanner.nextLine();
                System.out.println();
                if (choice.equals("1")) {
                    random = ThreadLocalRandom.current().nextInt(1, 2 + 1);
                    if (random == 1) {
                        System.out.println(
                                "As you get close, you realize there's some mushrooms growing in the pile.\nYou pick up 3 mushrooms.");
                        Player.addMushrooms(3);
                    } else {
                        System.out.println(
                                "As you stick your hand through the leaves, you realize there's a bunch of broken glass underneath and you cut yourself.");
                        System.out.println("You take 10 damage.");
                        Player.takeDamage(10);
                    }
                    break;
                } else if (choice.equals("2")) {
                    System.out.println("You walk past the pile of leaves and nothing happens.");
                    break;
                } else {
                    System.err.println("\nInvalid choice.\n\n1. Investigate the pile of leaves.\n2. Walk around it.");
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
            System.out.println("1. Approach the fox.\n2. Ignore it and continue on.\n");
            while (true) {
                choice = scanner.nextLine();
                System.out.println();
                if (choice.equals("1")) {
                    random = ThreadLocalRandom.current().nextInt(1, 2 + 1);
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
                                "The fox gets scared and runs away, leaving two mushrooms behind. You decided to take them with you.");
                        Player.addMushrooms(2);
                        break;
                    }
                } else if (choice.equals("2")) {
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
