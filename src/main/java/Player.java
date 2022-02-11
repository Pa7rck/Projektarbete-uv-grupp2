/*
    man ska kunna:
           ange namn
           ha 100 health i början
           increase health
           decrease health
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
        if (health > 0) {
            health -= damage;
        }
    }

    // gets health from mushroom
    public static void eatMushroom() {
        if(mushroomCount > 0) {
            health += 5;
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
