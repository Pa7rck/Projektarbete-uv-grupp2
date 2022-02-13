package resources;

/*
    man ska kunna:
           ange namn
           ha 100 health i början
           increase health
           decrease health
 */
/**
 * resources.Player-class
 *
 * This class contains player's name, HP status and inventory for the mushrooms.
 * resources.Player will get healing when the method "eatMushroom" is called.
 * resources.Player-class will collect mushrooms and remove mushrooms when player eats them.
 * The method "getHP" will get player's current HP status to update how much HP player has.
 * The resources.Player-class also controls that HP does not go over 100 HP or under 0 HP.
 */

public class Player {
    private static String name;
    private static int health = 100;
    private static int mushroomCount = 0;

    public static void setName(String name) {
        Player.name = name;
    }

    public static String getName() {
        return name;
    }

    // health
    public static void addHP(int healing) {
        health += healing;
        if (health >= 100) {
            health = 100;
        }
    }

    public static int getHP() {
        return health;
    }

    public static void takeDamage(int damage) {
            health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    // gets health from mushroom
    public static void eatMushroom() {
        if (getHP() == 100 && mushroomCount > 0) {
            System.out.println("You already have full health, you don't need to eat.");
        } else if(mushroomCount > 0) {
            System.out.println("You eat a mushroom, healing you for 15 HP.");
            addHP(15);
            System.out.println("Your health is now " + Player.getHP());
            mushroomCount--;
        }
        else {
            System.out.println("You have no mushrooms left");
        }
    }

    public static void addMushrooms(int amount) {
        mushroomCount += amount;
    }

    public static void removeMushrooms(int amount) {
        mushroomCount -= amount;
    }

    public static int getMushroomCount() {
        return mushroomCount;
    }


}
